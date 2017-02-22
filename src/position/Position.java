package position;

public class Position implements Comparable {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        return this.compareTo(other) == 0;
    }

    @Override
    public int compareTo(Object o) {
        Position other = (Position) o;
        if (x == other.x && y == other.y)
            return 0;
        else if (x >= other.x && y >= other.y) {
            return 1;
        } else
            return -1;
    }
}
