
package flutter;

public class Utils {
    public static String printLine(String str) {
        return str.concat("\n");
    }

    public static String setCommentWidgetName(String name, Integer code) {
        return ("<!-- name:" + name + " code:" + code + "--> \n");
    }

    public static String setClassName(String name) {
        return "class='" + name + "'";
    }

    public static String setClassesNames(String[] classes) {
        StringBuilder top = new StringBuilder();
        top.append("class='");
        for (String s : classes) {
            top.append(s);
        }
        top.append("'");
        return top.toString();
    }
    public static String setStyles(String[] classes) {
        StringBuilder top = new StringBuilder();
        top.append("style='");
        for (String s : classes) {
            top.append(s).append("; ");
        }
        top.append("'");
        return top.toString();
    }
    // public static String setClassNameByJs(String className) {
    //     return "classList.add('" + className + "'')";
    // }

    public static String addScript(String top, String classesName) {
        top=top.concat("<script>");
        top=printLine(top);
        top=top.concat("var parentDiv = document.currentScript.parentNode;");
        top=printLine(top);
        top=top.concat("parentDiv.classList.add(" + classesName + ")");
        top=printLine(top);
        top=top.concat("</script>");
        return top;
    }

    public static String addClassToParentElementByScript(String top, String className) {
        return (addScript(top, className));
    }

    public static String addClassesToParentElementByScript(String top, String[] className) {

        return (addScript(top, formatStringArray(className)));

    }

    /*
     * input :["element 1" , "element 2 ", "element 2"]
     * output :" 'element 1' ,'element 2' ,'element 3' "
     */
    public static String formatStringArray(String[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append("'").append(input[i]).append("'");
            if (i != input.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String getBootstrapColor(String flutterColorName) {
        String[] flutterColor = { "Blue", "Gray", "Green", "Red", "Yellow", "Black", "White" };
        String[] bootstrapColor = { "primary", "secondary", "success", "danger", "warning", "dark", "white" };

        int index = -1;
        for (int i = 0; i < flutterColor.length; i++) {
            if (flutterColor[i].equalsIgnoreCase(flutterColorName)) {
                index = i;
                break;
            }
        }

        if (index >= 0 && index < bootstrapColor.length) {
            return bootstrapColor[index];
        } else {
            return "null"; // Color not found
        }
    }

}
