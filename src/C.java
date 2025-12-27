public class C {
    public static void main(String y[]) {
        int x = Integer.parseInt(y[0]);
        int z = Integer.parseInt(y[1]);
        if (x <= z) {
            for (int x1 = x; x1 <= z; x1++) {
                if (x1 % 2 == 0) {
                    System.out.print(x1 + " ");
                }
            }
        } else {
            System.out.println(x + " cannot be greater than " + z);
        }
    }
}