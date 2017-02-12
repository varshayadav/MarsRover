public class West implements Direction {
    @Override
    public Direction left() {
        return new South();
    }

    @Override
    public Direction right() {
        return new North();
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX() - 1, position.getY());
    }

    @Override
    public String toString() {
        return "W";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Direction other = (Direction)obj;
        return this.getClass() == other.getClass();
    }
}
