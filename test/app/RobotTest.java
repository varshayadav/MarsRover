package app;

import App.Plateu;
import App.Robot;
import direction.Direction;
import direction.EastDirection;
import direction.NorthDirection;
import location.Location;
import position.Position;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class RobotTest {
    @Test
    public void should_return_west_when_turned_left_from_north() throws Exception {
        Plateu plateu = Mockito.mock(Plateu.class);
        Location initial_location = Mockito.mock(Location.class);
        Location changed_location = Mockito.mock(Location.class);
        Robot robot = new Robot(plateu, initial_location);

        when(initial_location.left()).thenReturn(changed_location);

        Assert.assertEquals(changed_location, robot.turn_left());

        verify(initial_location).left();
    }

    @Test
    public void should_return_east_when_turned_right_from_north() throws Exception {
        Plateu plateu = Mockito.mock(Plateu.class);
        Location initial_location = Mockito.mock(Location.class);
        Location changed_location = Mockito.mock(Location.class);
        Robot robot = new Robot(plateu, initial_location);

        when(initial_location.right()).thenReturn(changed_location);

        Assert.assertEquals(changed_location, robot.turn_right());

        verify(initial_location).right();
    }

    @Test
    public void move_to_valid_location_on_plateu() throws Exception {
        Plateu plateu = Mockito.mock(Plateu.class);
        Location initial_location = Mockito.mock(Location.class);
        Location changed_location = Mockito.mock(Location.class);
        Position position = Mockito.mock(Position.class);
        Robot robot = new Robot(plateu, initial_location);

        when(initial_location.move()).thenReturn(changed_location);
        when(changed_location.getPosition()).thenReturn(position);
        when(plateu.validPosition(position)).thenReturn(true);

        Assert.assertEquals(changed_location, robot.move());

        verify(initial_location).move();
        verify(changed_location).getPosition();
        verify(plateu).validPosition(position);
    }

    @Test(expected = Exception.class)
    public void should_throw_exception_when_move_to_invalid_location_on_plateu() throws Exception {
        Plateu plateu = Mockito.mock(Plateu.class);
        Location initial_location = Mockito.mock(Location.class);
        Location changed_location = Mockito.mock(Location.class);
        Position position = Mockito.mock(Position.class);
        Robot robot = new Robot(plateu, initial_location);

        when(initial_location.move()).thenReturn(changed_location);
        when(changed_location.getPosition()).thenReturn(position);
        when(plateu.validPosition(position)).thenReturn(false);

        robot.move();

        verify(initial_location).move();
        verify(changed_location).getPosition();
        verify(plateu).validPosition(position);
    }

//    test cases

//      1) position -> 1 2 N
//         moves ->  LMLMLMLMM

    @Test
    public void moves() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);
        Plateu plateu = new Plateu(bottom_left_position, top_right_position);
        Position position = new Position(1, 2);
        Direction direction = new NorthDirection();
        Location location = new Location(position, direction);
        Robot robot = new Robot(plateu, location);

        robot.turn_left();
        robot.move();
        robot.turn_left();
        robot.move();
        robot.turn_left();
        robot.move();
        robot.turn_left();
        robot.move();
        robot.move();

        Location expectedLocation = new Location(new Position(1, 3), new NorthDirection());
        Assert.assertEquals(expectedLocation, robot.getLocation());
    }


//      2) position -> 3 3 e
//         moves ->  MMRMMRMRRM

    @Test
    public void test_case_2() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);
        Plateu plateu = new Plateu(bottom_left_position, top_right_position);
        Position position = new Position(3, 3);
        Direction direction = new EastDirection();
        Location location = new Location(position, direction);
        Robot robot = new Robot(plateu, location);

        robot.move();
        robot.move();
        robot.turn_right();
        robot.move();
        robot.move();
        robot.turn_right();
        robot.move();
        robot.turn_right();
        robot.turn_right();
        robot.move();

        Location expectedLocation = new Location(new Position(5, 1), new EastDirection());
        Assert.assertEquals(expectedLocation, robot.getLocation());
    }
}
