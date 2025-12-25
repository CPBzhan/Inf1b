import java.util.Scanner;
public class NMax {
    public static int max(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }

    public static double max(double a, double b, double c){
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("The biggest number is: " + max(a, b, c));
//
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The biggest number is: " + max(a, b, c));
    }
}
