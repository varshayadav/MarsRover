import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LocationTest {

    @Test
    public void left() throws Exception {
        Direction north = Mockito.mock(North.class);
        Direction east = Mockito.mock(East.class);
        Position position = Mockito.mock(Position.class);
        Location location = new Location(position, north);
        Location changed_location = new Location(position, east);

        when(north.left()).thenReturn(east);

        assertEquals(changed_location, location.left());

        verify(north).left();
    }

    @Test
    public void right() throws Exception {
        Direction north = Mockito.mock(North.class);
        Direction west = Mockito.mock(West.class);
        Position position = Mockito.mock(Position.class);
        Location location = new Location(position, north);
        Location changed_location = new Location(position, west);

        when(north.right()).thenReturn(west);

        assertEquals(changed_location, location.right());

        verify(north).right();
    }

    @Test
    public void move() throws Exception {
        Direction north = Mockito.mock(North.class);
        Position position = Mockito.mock(Position.class);
        Position changed_position = Mockito.mock(Position.class);

        Location location = new Location(position, north);
        Location changed_location = new Location(changed_position, north);

        when(north.move(position)).thenReturn(changed_position);

        assertEquals(changed_location, location.move());

        verify(north).move(position);
    }
}