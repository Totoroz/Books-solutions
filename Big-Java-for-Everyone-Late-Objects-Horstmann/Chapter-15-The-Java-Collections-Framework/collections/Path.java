package collections;

public class Path {
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    private static final int[] ROW_OFFSETS = { -1, 0, 1, 0 };
    private static final int[] COLUMN_OFFSETS = { 0, 1, 0, -1 };
    private int startingRow;
    private int startingColumn;
    private int startingDirection;
    private int endingRow;
    private int endingColumn;
    private int endingDirection;

    public Path(int row, int column, int direction) {
        this.startingRow = row;
        this.startingColumn = column;
        this.startingDirection = direction;
        this.endingRow = row;
        this.endingColumn = column;
        this.endingDirection = direction;
    }

    public void move() {
        this.endingRow = this.getNextRow();
        this.endingColumn = this.getNextColumn();
    }

    public void turn() {
        final int DIRECTIONS = 4;
        this.endingDirection = (this.endingDirection + 1) % DIRECTIONS;
    }

    public int getEndingRow() {
        return this.endingRow;
    }

    public int getEndingColumn() {
        return this.endingColumn;
    }

    public int getNextRow() {
        return this.endingRow + ROW_OFFSETS[this.endingDirection];
    }

    public int getNextColumn() {
        return this.endingColumn + COLUMN_OFFSETS[this.endingDirection];
    }

    private static boolean isOpposite(int dir1, int dir2) {
        return dir1 != dir2 && (dir1 + dir2) % 2 == 0;
    }

    public boolean isOpposite(Path other) {
        return this.startingRow == other.endingRow && this.startingColumn == other.endingColumn
                && isOpposite(this.startingDirection, other.endingDirection);
    }

    @Override
    public String toString() {
        String result = "(" + this.startingRow + "," + this.startingColumn + ")"
                + "NESW".charAt(this.startingDirection);
        if (this.endingRow != this.startingRow || this.endingColumn != this.startingColumn) {
            result = result + "<->(" + this.endingRow + "," + this.endingColumn + ")"
                    + "NESW".charAt(this.endingDirection);
        }
        return result;
    }
}
