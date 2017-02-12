public class Location {

    private final Direction direction;
    private final Position position;

    public Location(Position position, Direction direction) {

        this.direction = direction;
        this.position = position;
    }

    public Location left() {
        Direction changed_direction  = direction.left();
        return new Location(position, changed_direction);
    }

    public Location right() {
        Direction changed_direction  = direction.right();
        return new Location(position, changed_direction);
    }

    public Location move(){
        Position changed_position = direction.move(position);
        return new Location(changed_position, direction);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Location otherLocation = (Location) other;

        return direction.equals(otherLocation.direction) && position.equals(otherLocation.position);
    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
