public class South implements Direction {
    @Override
    public Direction left() {
        return new East();
    }

    @Override
    public Direction right() {
        return new West();
    }

    @Override
    public Position move(Position position) {
        return new Position(position.getX(), position.getY() - 1);
    }

    @Override
    public String toString() {
        return "S";
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
