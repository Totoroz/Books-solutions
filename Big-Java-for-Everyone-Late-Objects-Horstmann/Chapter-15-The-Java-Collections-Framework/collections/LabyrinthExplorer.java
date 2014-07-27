package collections;

public class LabyrinthExplorer {
    private static char[][] lab = { { ' ', ' ', ' ', '*', ' ', ' ', ' ' }, { '*', '*', ' ', '*', ' ', '*', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', '*', '*', '*', '*', '*', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', 'e' } };

    private static void findPath(int row, int col) {
        if (col < 0 || row < 0 || col >= lab[0].length || row >= lab.length) {
            return;
        }
        if (lab[row][col] == 'e') {
            System.out.println("Found the exit!");
        }

        // if current cell isn't free
        if (lab[row][col] != ' ') {
            return;
        }

        // mark as visited
        lab[row][col] = 'v';
        findPath(row - 1, col); // up
        findPath(row + 1, col); // down
        findPath(row, col - 1); // left
        findPath(row, col + 1); // right

        // mark current cell as free
        lab[row][col] = ' ';
    }

    public static void main(String[] args) {
        findPath(0, 0, 'S');
    }

    // If we want to know the path
    private static char[] path = new char[lab[0].length * lab.length];
    private static int position = 0;

    private static void findPath(int row, int col, char direction) {
        if (col < 0 || row < 0 || col >= lab[0].length || row >= lab.length) {
            return;
        }
        path[position] = direction;
        position += 1;
        if (lab[row][col] == 'e') {
            printPath(path, 1, position - 1);
        }
        if (lab[row][col] == ' ') {
            lab[row][col] = 'v';
            findPath(row, col - 1, 'L');
            findPath(row, col + 1, 'R');
            findPath(row - 1, col, 'U');
            findPath(row + 1, col, 'D');
            lab[row][col] = ' ';
        }
        position -= 1;
    }

    private static void printPath(char[] path, int startPos, int endPos) {
        System.out.println("Found path to exit: ");
        for (int i = startPos; i <= endPos; i++) {
            System.out.print(path[i]);
        }
        System.out.println();
    }
}
