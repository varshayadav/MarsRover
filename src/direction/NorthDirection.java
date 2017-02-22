package direction;
import position.Position;

public class NorthDirection implements Direction {
    @Override
    public Direction left() {
        return new WestDirection();
    }

    @Override
    public Direction right() {
        return new EastDirection();
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
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        return obj.getClass() == this.getClass();
    }
}
