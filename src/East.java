public class East implements Direction {
    @Override
    public Direction left() {
        return new North();
    }

    @Override
    public Direction right() {
        return new South();
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX() + 1, position.getY());
    }

    @Override
    public String toString() {
        return "E";
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
