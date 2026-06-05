import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zehan Wang
 * @version 2026-03-18
 *
 * This program rotates rows and columns of a square matrix
 * based on a list of integer operations.
 *
 * Input format example:
 * [[1,2],[3,4]],[1,2,-3,-1]
 *
 * What this program does:
 * 1. Reads a matrix and a list of numbers from the user
 * 2. Applies rotations to rows and columns
 * 3. Prints the final matrix
 *
 * Important idea:
 * Instead of moving elements step by step, we calculate
 * their final position directly using modular arithmetic.
 */
public class Design {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input like [[1,2],[3,4]],[1,2,-3,-1]:");

        try {

            // Read the full input line as a string
            String input = scanner.nextLine();

            // Check if the input contains both matrix and operations
            if (!input.contains("],["))
                throw new IllegalArgumentException("Input must contain matrix and operations.");

            // Split input into matrix part and operations part
            String matrixPart = input.substring(0, input.indexOf("]],") + 2);
            String opsPart = input.substring(input.indexOf("]],") + 3);

            // ---------- PARSE MATRIX ----------

            // Remove outer brackets [[ and ]]
            matrixPart = matrixPart.replaceAll("\\[\\[", "").replaceAll("]]", "");

            // Split rows using "],[" as separator
            String[] rows = matrixPart.split("],\\[");

            int n = rows.length; // number of rows (and columns)

            int[][] matrix = new int[n][n];

            // Convert each row string into integers
            for (int i = 0; i < n; i++) {

                // Remove remaining brackets and split values
                String[] values = rows[i].replace("[", "").replace("]", "").split(",");

                // Check if the matrix is square
                if (values.length != n)
                    throw new IllegalArgumentException("Matrix must be square.");

                for (int j = 0; j < n; j++) {

                    // Convert each value from String to int
                    matrix[i][j] = Integer.parseInt(values[j].trim());
                }
            }

            // ---------- PARSE OPERATIONS ----------

            // Remove brackets [ ]
            opsPart = opsPart.replace("[", "").replace("]", "");

            // Split values by comma
            String[] opsStr = opsPart.split(",");

            int[] operations = new int[opsStr.length];

            for (int i = 0; i < opsStr.length; i++) {

                operations[i] = Integer.parseInt(opsStr[i].trim());
            }

            // Check if number of operations is exactly 2n
            if (operations.length != 2 * n)
                throw new IllegalArgumentException("Operations must contain exactly 2n values.");

            // ---------- APPLY ROTATIONS ----------

            // Loop through each operation
            for (int i = 0; i < operations.length; i++) {

                int shift = operations[i];

                // Even index → rotate a row
                if (i % 2 == 0) {
                    rotate(matrix, i / 2, shift, true);
                }
                // Odd index → rotate a column
                else {
                    rotate(matrix, i / 2, shift, false);
                }
            }

            // Print the final matrix
            printMatrix(matrix);

        } catch (Exception e) {

            // If anything goes wrong, show a clear error message
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    /**
     * Rotates either a row or a column of the matrix.
     *
     * @param matrix the matrix we are modifying
     * @param index  which row or column to rotate
     * @param shift  how far to rotate
     * @param isRow  true = row rotation, false = column rotation
     *
     * How rotation works:
     * We do NOT move elements one step at a time.
     * Instead, we calculate the final position directly.
     */
    public static void rotate(int[][] matrix, int index, int shift, boolean isRow) {

        int n = matrix.length;

        // Reduce large shifts using modulo
        // Example: shift 5 in size 3 → same as shift 2
        shift = shift % n;

        // Handle negative shifts (convert to positive equivalent)
        if (shift < 0) {
            shift += n;
        }

        // Temporary array to store rotated values
        int[] temp = new int[n];

        // Move each element to its new position
        for (int i = 0; i < n; i++) {

            // Calculate new index using wrap-around
            int newIndex = (i + shift) % n;

            if (isRow) {
                // Rotating a row → move horizontally
                temp[newIndex] = matrix[index][i];
            } else {
                // Rotating a column → move vertically
                temp[newIndex] = matrix[i][index];
            }
        }

        // Copy values back into the matrix
        for (int i = 0; i < n; i++) {

            if (isRow) {
                matrix[index][i] = temp[i];
            } else {
                matrix[i][index] = temp[i];
            }
        }
    }

    /**
     * Prints the matrix in a readable format.
     *
     * Uses Arrays.toString() so each row looks like:
     * [1, 2, 3]
     */
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}