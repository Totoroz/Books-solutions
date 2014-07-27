package collections;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private String[] cells;

    public Maze(String[] contents) {
        this.cells = contents;
    }

    public List<Path> pathsFrom(int row, int column) {
        List<Path> paths = new ArrayList<Path>();
        if (this.isValid(row - 1, column)) {
            paths.add(new Path(row, column, Path.NORTH));
        }
        if (this.isValid(row, column + 1)) {
            paths.add(new Path(row, column, Path.EAST));
        }
        if (this.isValid(row + 1, column)) {
            paths.add(new Path(row, column, Path.SOUTH));
        }
        if (this.isValid(row, column - 1)) {
            paths.add(new Path(row, column, Path.WEST));
        }
        for (Path path : paths) {
            this.extend(path);
        }
        return paths;
    }

    private void extend(Path path) {
        boolean done = false;
        while (!done) {
            path.move();
            int row = path.getEndingRow();
            int column = path.getEndingColumn();
            if (this.isExit(row, column) || this.countNeighbors(row, column) != 2) {
                done = true;
            } else {
                row = path.getNextRow();
                column = path.getNextColumn();
                if (!this.isValid(row, column)) {
                    path.turn();
                    column = path.getNextColumn();
                    if (!this.isValid(row, column)) {
                        path.turn();
                        path.turn();
                    }
                }
            }
        }
    }

    public boolean isExit(int row, int column) {
        return (row == 0 || row == this.cells.length - 1 || column == 0 || column == this.cells[row].length() - 1) && this.cells[row].charAt(column) == ' ';
    }

    public boolean isDeadEnd(int row, int column) {
        return this.countNeighbors(row, column) == 1;
    }

    private boolean isValid(int row, int column) {
        return 0 <= row && row < this.cells.length && 0 <= column && column < this.cells[row].length() && this.cells[row].charAt(column) == ' ';
    }

    private int countNeighbors(int row, int column) {
        int count = 0;
        if (this.isValid(row - 1, column)) {
            count += 1;
        }
        if (this.isValid(row + 1, column)) {
            count += 1;
        }
        if (this.isValid(row, column - 1)) {
            count += 1;
        }
        if (this.isValid(row, column + 1)) {
            count += 1;
        }
        return count;
    }
}
