package direction;

import position.Position;

public interface Direction {
    Direction left();
    Direction right();
    Position move(Position position);
}
