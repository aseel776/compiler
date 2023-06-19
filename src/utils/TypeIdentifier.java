package utils;

import nodes.*;
import symbolTable.SymbolTableTraveller;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableInstance;

public class TypeIdentifier {

    public static Type getType(String s) {
        switch (s) {
            case "int":
            case "double":
                return Type.number;
            case "String":
                return Type.string;
            case "List":
                return Type.list;
            case "Map":
                return Type.map;
            case "bool":
                return Type.bool;
            case "Function":
                return Type.Function;
            case "void":
                return Type.Void;
            case "dynamic":
            case "var":
                return Type.dynamic;
            case "Object":
            default:
                return Type.object;
        }
    }

    public static boolean typeMatch(SymbolTableInstance left, Node right) {
        return left.type == getNodeType(right);
    }

    public static Type getNodeType(Node node) {
        if (node instanceof Variable) {
            Type type = getVarType((Variable) node, SymbolTableTraveller.currentNode.objectHash);
            if (type == Type.undefined && SymbolTableTraveller.parentNode != null) {
                type = getVarType((Variable) node, SymbolTableTraveller.parentNode.objectHash);
            }
            return type;
        } else if (node instanceof FunctionCall) {
            return getReturnType((FunctionCall) node);
        } else if (node instanceof DartObject) {
            return Type.object;
        } else if (node instanceof Characters) {
            return Type.string;
        } else if (node instanceof UnnamedFunction) {
            return Type.Function;
        } else if (node instanceof Expression) {
            return Type.number;
        } else if (node instanceof DartList) {
            return Type.list;
        } else if (node instanceof DartMap) {
            return Type.map;
        } else {
            return Type.undefined;
        }
    }

    public static Type getVarType(Variable var, int parentHash) {
        for (SymbolTableInstance instance : SymbolTable.table) {
            boolean cond1 = (instance.id.compareTo(var.id) == 0);
            boolean cond2 = (instance.parentHash == parentHash);
            if (cond1 && cond2) {
                return instance.type;
            }
        }
        return Type.undefined;
    }

    public static Type getReturnType(FunctionCall functionCall) {
        Type type = Type.dynamic;
        for (SymbolTableInstance instance : SymbolTable.table) {
            if (instance.id.compareTo(functionCall.id) == 0) {
                return instance.type;
            }
        }
        return type;
    }

}
