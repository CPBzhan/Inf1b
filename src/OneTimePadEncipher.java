public class OneTimePadEncipher {
    // 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
    public static int charToInt(char c) {
        return Character.toLowerCase(c) - 'a';
    }

    // 0 -> 'a', 1 -> 'b', ..., 25 -> 'z'
    // always returns lower-case
    public static char intToChar(int i) {
        return (char) ('a' + i);
    }

    // checks if character is a letter
    public static boolean isAlpha(char c) {
        return Character.isLetter(c);
    }

    // ENCRYPT
    public static String encipher(String original, String onetimepad) {
        int n = Math.min(original.length(), onetimepad.length());
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char o = original.charAt(i);
            char k = onetimepad.charAt(i);

            if (isAlpha(o)) {
                int p = charToInt(o);
                int key = charToInt(k);
                int c = (p + key) % 26;
                ciphertext.append(intToChar(c));
            } else if (o == ' ') {
                ciphertext.append(' ');
            }
        }
        return ciphertext.toString();
    }

    // DECRYPT
    public static String decipher(String encipheredText, String onetimepad) {
        int n = Math.min(encipheredText.length(), onetimepad.length());
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = encipheredText.charAt(i);
            char k = onetimepad.charAt(i);

            if (isAlpha(c)) {
                int ci = charToInt(c);
                int ki = charToInt(k);
                int pi = (ci - ki + 26) % 26; // avoid negative modulo
                plaintext.append(intToChar(pi));
            } else if (c == ' ') {
                plaintext.append(' ');
            }
        }
        return plaintext.toString();
    }

    // TESTING
    public static void main(String[] args) {
        String ciphertext1 = encipher(
                "HELLO EVERYBODY",
                "MYSECRETKEYMYSECRETKEY"
        );
        System.out.println(ciphertext1);

        String plaintext1 = decipher(
                ciphertext1,
                "MYSECRETKEYMYSECRETKEY"
        );
        System.out.println(plaintext1);

        // Given examples
        System.out.println(
                decipher("uvufsghktdal", "WHATSTHEPASSWORD")
        );
        System.out.println(
                decipher("wconlahzgzgleuai", "YOULLNEVERREADMYONETIMEPAD")
        );
    }
}
