public class FacePrinter {
    public static void main(String[] args) {
        String[] face = {
                "   ///",
                " ///////",
                " | o o |",
                "@|  n  |@",
                " | ~~~ |",
                "  -----"
        };

        for (String line : face) {
            System.out.println(line);
        }
    }
}