package direction;
import position.Position;

public class SouthDirection implements Direction {
    @Override
    public Direction left() {
        return new EastDirection();
    }

    @Override
    public Direction right() {
        return new WestDirection();
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
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        return obj.getClass() == this.getClass();
    }
}
