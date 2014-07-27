package collections;

import java.util.Stack;

public class MazeSolver {
    public static void main(String[] args) {
        Maze maze = new Maze(new String[] { "*****************************", "** ***                      *",
                "** *** * ********************", "** *** *         *          *", "** *** * *******   **** *****",
                "**     * ************** *****", "****** ******* *******  *****", "******         ******* ******",
                "*      ******* ******* ******", "* **** ******* **           *", "*    ********* ******* ******",
                "* ****         ***     ******", "************** **************" });
        solve(maze, 7, 8);
    }

    public static void solve(Maze maze, int row, int column) {
        Stack<Path> s = new Stack<Path>();
        for (Path p : maze.pathsFrom(row, column)) {
            s.push(p);
        }

        while (s.size() > 0) {
            Path p = s.pop();
            System.out.println("Following " + p);
            int r = p.getEndingRow();
            int c = p.getEndingColumn();
            if (maze.isExit(r, c)) {
                System.out.println("Exit!");
                return;
            } else if (maze.isDeadEnd(r, c)) {
                System.out.println("Dead end");
            } else {
                for (Path p2 : maze.pathsFrom(r, c)) {
                    if (!p2.isOpposite(p)) {
                        s.push(p2);
                    }
                }
            }
        }
    }
}
