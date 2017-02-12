public class North implements Direction {
    @Override
    public Direction left() {
        return new West();
    }

    @Override
    public Direction right() {
        return new East();
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX(), position.getY() + 1);
    }

    @Override
    public String toString() {
        return "N";
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
