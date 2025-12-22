public class QuadraticSolver {
    public static void main(String[] args){
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        double n3 = Double.parseDouble(args[2]);
        double con = n2 * n2 - 4 * n1 * n2;
        if (n1 == 0){
            System.out.println("Cannot solve equation.");
        }
        else {
            if (con > 0) {
                double delta = Math.sqrt(n2 * n2 - 4 * n1 * n3);
                double x1 = (-n2 + delta) / 2 * n1;
                double x2 = (-n2 - delta) / 2 * n1;
                System.out.println(x1 + x2);
            } else {
                System.out.println("Equation is not solvable for real x.");
            }
        }
    }
}
