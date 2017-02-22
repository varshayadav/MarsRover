package app;

import App.Plateu;
import position.Position;
import org.junit.Assert;
import org.junit.Test;

public class PlateuTest {
    @Test
    public void return_true_if_position_is_bottom_left_of_plateu() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);

        Plateu plateu = new Plateu(bottom_left_position, top_right_position);

        Assert.assertTrue(plateu.validPosition(bottom_left_position));
    }

    @Test
    public void return_true_if_position_is_top_right_of_plateu() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);

        Plateu plateu = new Plateu(bottom_left_position, top_right_position);

        Assert.assertTrue(plateu.validPosition(top_right_position));
    }

    @Test
    public void return_true_if_position_is_within_plateu() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);
        Position position = new Position(2, 3);

        Plateu plateu = new Plateu(bottom_left_position, top_right_position);

        Assert.assertTrue(plateu.validPosition(position));
    }


    @Test
    public void return_false_if_location_is_not_within_plateu() throws Exception {
        Position bottom_left_position = new Position(0, 0);
        Position top_right_position = new Position(5, 5);
        Position position = new Position(10, 10);

        Plateu plateu = new Plateu(bottom_left_position, top_right_position);

        Assert.assertFalse(plateu.validPosition(position));
    }
}
