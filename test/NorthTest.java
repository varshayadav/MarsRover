import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NorthTest {

    @Test
    public void to_string() throws Exception {
        Direction north = new North();
        Assert.assertEquals("N", north.toString());
    }

    @Test
    public void left() throws Exception {
        Direction north = new North();
        Direction west = new West();
        Assert.assertEquals(west, north.left());
    }

    @Test
    public void right() throws Exception {
        Direction north = new North();
        Direction east = new East();
        Assert.assertEquals(east, north.right());
    }

    @Test
    public void move() throws Exception {
        Direction north = new North();
        Position position = new Position(0, 0);
        Position movedPosition = new Position(0, 1);

        Assert.assertEquals(movedPosition, north.move(position));
    }
}
