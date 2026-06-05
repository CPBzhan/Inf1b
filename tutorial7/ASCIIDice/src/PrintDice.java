import java.util.Scanner;
public class PrintDice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;
            int value = Integer.parseInt(line);
            System.out.println("You entered: " + value);
            printDice(value);
        }
    }

    public static void printDice(int value) {

        char[][] grid = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        if (value % 2 == 1) {
            grid[1][1] = 'O';
        }

        if (value >= 2) {
            grid[0][0] = 'O';
            grid[2][2] = 'O';
        }

        if (value >= 4) {
            grid[0][2] = 'O';
            grid[2][0] = 'O';
        }

        if (value == 6) {
            grid[1][0] = 'O';
            grid[1][2] = 'O';
        }

        System.out.println("-----");

        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println("|");
        }

        System.out.println("-----");

    }
}

/* TODO 1 Open the TODO tab to help you see what needs doing.
            You can rename these comments to remove them from the list.
            This is better than deleting them because you can see what did need
            doing. Alternatively add "DONE" to the comment.
*/
// TODO 2 Read the proposed design in readme.md
/* TODO 3 Sketch out the design on paper so you have a clear idea of the
            program flow before your start coding
 */
// TODO 4 Code, test, and refine a design
// TODO 5 Add comments and JavaDoc comments
// TODO 6 Fill in walkthrough.md
// TODO 7 If you have time, code, test, and refine a different design for comparison
// TODO 8 Complete the reflections.md file