package direction;

import direction.Direction;
import direction.EastDirection;
import direction.NorthDirection;
import direction.WestDirection;
import org.junit.Assert;
import org.junit.Test;
import position.Position;

public class NorthDirectionTest {

    @Test
    public void to_string() throws Exception {
        Direction north = new NorthDirection();
        Assert.assertEquals("N", north.toString());
    }

    @Test
    public void left() throws Exception {
        Direction north = new NorthDirection();
        Direction west = new WestDirection();
        Assert.assertEquals(west, north.left());
    }

    @Test
    public void right() throws Exception {
        Direction north = new NorthDirection();
        Direction east = new EastDirection();
        Assert.assertEquals(east, north.right());
    }

    @Test
    public void move() throws Exception {
        Direction north = new NorthDirection();
        Position position = new Position(0, 0);
        Position movedPosition = new Position(0, 1);

        Assert.assertEquals(movedPosition, north.move(position));
    }
}
