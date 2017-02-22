package App;

import position.Position;

public class Plateu {

    private final Position bottomLeftPosition;
    private final Position topLeftPosition;

    public Plateu(Position bottomLeftPosition, Position topLeftPosition) {
        this.bottomLeftPosition = bottomLeftPosition;
        this.topLeftPosition = topLeftPosition;
    }

    public boolean validPosition(Position position) {
        return bottomLeftPosition.compareTo(position) <= 0 && topLeftPosition.compareTo(position) >= 0 ;
    }
}
