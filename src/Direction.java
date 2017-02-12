public interface Direction {
    Direction left();
    Direction right();
    Position move(Position position);
}
