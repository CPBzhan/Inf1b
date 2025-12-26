public class Factorial {
    public static int factorial(int N) {
        if (N > 1) return (N * factorial(N-1));
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println(" 2! (Should be: 2) returned: " + factorial(2) );
        System.out.println(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.println(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}