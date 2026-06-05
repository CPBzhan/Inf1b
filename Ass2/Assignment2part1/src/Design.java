/**
 * @author Zehan Wang
 * @version 2026-03-09
 *
 * A simple Java program that rotates rows and columns of a square matrix
 * according to a sequence of integer operations.
 *
 * The program alternates between row rotations and column rotations.
 * Rotations are implemented using modular index mapping.
 */
public class Design {

    public static void main(String[] args) {

        // Example matrix
        int[][] matrix = {
                {1, 2, -3},
                {-4, 5, 6},
                {7, -8, 0}
        };
//        int[][] matrix = {
//                {1, 2},
//                {3, 4}
//        };

        // Sequence of rotation operations
//        int[] operations = {1, 2, -3, -1};
        int[] operations = {1, -2, 0, -1, 3, 4};

        // Process each operation in order
        for (int i = 0; i < operations.length; i++) {

            int shift = operations[i];

            // Even index → rotate row
            if (i % 2 == 0) {
                rotateRow(matrix, i / 2, shift);
            }
            // Odd index → rotate column
            else {
                rotateColumn(matrix, i / 2, shift);
            }
        }

        // Print final matrix
        printMatrix(matrix);
    }

    /**
     * Rotates a specific row of the matrix.
     */
    public static void rotateRow(int[][] matrix, int row, int shift) {

        int n = matrix.length;

        // Reduce shift using modulo
        shift = shift % n;

        if (shift < 0) {
            shift += n;
        }

        int[] temp = new int[n];

        // Compute new positions using modular index mapping
        for (int i = 0; i < n; i++) {
            int newIndex = (i + shift) % n;
            temp[newIndex] = matrix[row][i];
        }

        // Copy rotated row back to matrix
        for (int i = 0; i < n; i++) {
            matrix[row][i] = temp[i];
        }
    }

    /**
     * Rotates a specific column of the matrix.
     */
    public static void rotateColumn(int[][] matrix, int col, int shift) {

        int n = matrix.length;

        shift = shift % n;

        if (shift < 0) {
            shift += n;
        }

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + shift) % n;
            temp[newIndex] = matrix[i][col];
        }

        for (int i = 0; i < n; i++) {
            matrix[i][col] = temp[i];
        }
    }

    /**
     * Prints the matrix to the console.
     */
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}