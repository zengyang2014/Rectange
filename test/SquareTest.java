import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yzeng on 03/05/2017.
 */
public class SquareTest {

    @Test
    public void testSquareCalculateArea(){
        Square testSquare = new Square(12);

        double expectedValue = Math.pow(12, 2);

        assertEquals(expectedValue, testSquare.getArea(), 0.00000001);
    }

    @Test
    public void testSquareCalculatePerimeter() {
        Square testSquare = new Square(12);

        double expectedValue = 12 * 4;

        assertEquals(expectedValue, testSquare.getPerimeter(), 0.00000001);
    }

}