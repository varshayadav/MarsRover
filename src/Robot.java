public class Robot {
    private final Plateu plateu;
    private Location location;

    public Robot(Plateu plateu, Location location) {
        this.plateu = plateu;
        this.location = location;
    }

    public Location turn_left() {
        location = location.left();
        return location;
    }

    public Location turn_right() {
        location = location.right();
        return location;
    }

    public Location move() throws InvalidLocationException {
        Location changedLocation = location.move();
        if (plateu.validPosition(changedLocation.getPosition())){
            this.location = changedLocation;
            return location;
        }
        throw new InvalidLocationException();
    }

    public Location getLocation() {
        return location;
    }
}
