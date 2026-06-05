import java.util.Scanner;
public class ScrabbleWinner {
    public static void main(String[] args) {
        int[] bonus = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            ans += bonus[c - 'A'];
        }
        System.out.println(ans);
    }
}

