public class SplitPathName {

    public static String[] splitPath(String s) {
        String[] result = new String[4];

        int lastSlash = s.lastIndexOf('/');
        int lastDot = s.lastIndexOf('.');

        // 1. directory (including trailing slash)
        if (lastSlash >= 0) {
            result[0] = s.substring(0, lastSlash + 1);
            result[1] = s.substring(lastSlash + 1);
        } else {
            // no slash at all
            result[0] = "";
            result[1] = s;
        }

        // 2 & 3. basename without extension + extension
        if (lastDot >= 0 && lastDot > lastSlash) {
            result[2] = result[1].substring(0, lastDot - lastSlash - 1);
            result[3] = result[1].substring(lastDot - lastSlash - 1);
        } else {
            // no extension
            result[2] = result[1];
            result[3] = "";
        }

        return result;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            String[] c = splitPath(arg);
            System.out.println("File: " + c[1] + " Type: " + c[3] + " [" + c[0] + "]");
        }
    }
}
