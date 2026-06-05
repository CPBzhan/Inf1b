public class ChainAssign {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        j = k = 4;
        i = k = 5;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
