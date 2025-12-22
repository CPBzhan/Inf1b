public class SaferQuadraticSolver {
    public static void main(String[] args){
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        double n3 = Double.parseDouble(args[2]);
        double delta = Math.sqrt(n2 * n2 - 4 * n1 * n2);
        double x1 = (-n2 + delta) / 2*n1;
        double x2 = (-n2 - delta) / 2*n1;
    }
}
