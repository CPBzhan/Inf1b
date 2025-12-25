public class ImQuadraticSolver {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // 情况 1：不是二次方程
        if (a == 0) {
            // bx + c = 0
            double solution = -c / b;
            System.out.println(solution);
            return;
        }

        // 计算判别式
        double discriminant = b * b - 4 * a * c;

        // 情况 2：判别式 >= 0（实数解）
        if (discriminant >= 0) {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);
        }
        // 情况 3：判别式 < 0（复数解）
        else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);

            System.out.println(realPart + " + " + imagPart + "i");
            System.out.println(realPart + " - " + imagPart + "i");
        }
    }
}
