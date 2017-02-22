package direction;

import position.Position;

public class EastDirection implements Direction {
    @Override
    public Direction left() {
        return new NorthDirection();
    }

    @Override
    public Direction right() {
        return new SouthDirection();
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
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        return obj.getClass() == this.getClass();
    }
}
