import java.util.Comparator;

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
    public boolean equals(Object o) {
        return this.compareTo(o) == 0;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
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
