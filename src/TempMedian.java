import java.util.Arrays;
public class TempMedian {
    public static void main(String[] args) {
        int n = args.length;
        if (n != 0) {
            int[] temps = new int[n];
            temps[0] = Integer.parseInt(args[0]);
            if (n > 1) {
                for (int i = 1; i < n; i++) {
                    if (args[i].equals(".")) {
                        temps[i] = temps[i - 1];
                    } else if (args[i].equals("+")) {
                        temps[i] = temps[i - 1] + 1;
                    } else if (args[i].equals("-")) {
                        temps[i] = temps[i - 1] - 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(temps[i]);
                System.out.print(" ");
            }
            System.out.println();

            // After sorted
            Arrays.sort(temps);
            for (int i = 0; i < n; i++) {
                System.out.print(temps[i]);
                System.out.print(" ");
            }
            System.out.println();

            double median = 0;
            if (n % 2 == 0){
                median = (double) (temps[n/2] + temps[(n/2) - 1]) / 2;
            }
            else {
                median = temps[n/2];
            }
            System.out.println(median);
        }
    }
}
