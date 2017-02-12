import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    @Test
    public void should_return_0_when_position_is_equal_to_other_position() throws Exception {
        Position position1 = new Position(1,2);
        Position position2 = new Position(1,2);
        assertEquals(position1, position2);

    }

    @Test
    public void should_return_1_when_position_is_greater_than_other_position() throws Exception {
        Position position = new Position(1,2);
        Position otherPosition = new Position(0,1);
        assertEquals(1, position.compareTo(otherPosition));
    }

    @Test
    public void should_return_negative_1_when_position_is_less_than_other_position() throws Exception {
        Position position = new Position(1, 2);
        Position otherPosition = new Position(2, 1);
        assertEquals(-1, position.compareTo(otherPosition));
    }
}