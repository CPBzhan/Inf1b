public class Sieve {
    public static void main(String[] args) {
        int limit = 20;
        int[] sieved_numbers = new int[limit - 1];
        for (int i = 0; i < sieved_numbers.length; i++) {
            sieved_numbers[i] = i + 2;
        }

        int p = 2;

        while (p != 0) {
            System.out.print(p + " ");

            for (int i = 0; i < sieved_numbers.length; i++) {
                if (sieved_numbers[i] != 0 && sieved_numbers[i] % p == 0 && sieved_numbers[i] != p) {
                    sieved_numbers[i] = 0;
                }
            }

            p = 0;
            for (int num : sieved_numbers) {
                if (num > p && num > 0 && num > p) {
                    p = num;
                    break;
                }
            }
        }

        System.out.println();
    }
}
