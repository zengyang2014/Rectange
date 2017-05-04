import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp(){
        rectangle = new Rectangle(10, 20);
    }

    @Test
    public void shouldHaveHeight() {
        assertNotNull(this.rectangle.getHeight());

        assertTrue(this.rectangle.getHeight() > 0);

        this.rectangle = new Rectangle(0,0);
        assertTrue(this.rectangle.getHeight() == 0);

        this.rectangle = new Rectangle(-1000,0);
        assertTrue(this.rectangle.getHeight() == 1000);

    }

    @Test
    public void testSquareCalculateArea(){
        Rectangle testSquare = Rectangle.generateSquare(12);

        double expectedValue = Math.pow(12, 2);

        assertEquals(expectedValue, testSquare.getArea(), 0.00000001);
    }

    @Test
    public void testSquareCalculatePerimeter() {
        Rectangle testSquare = Rectangle.generateSquare(12);

        double expectedValue = 12 * 4;

        assertEquals(expectedValue, testSquare.getPerimeter(), 0.00000001);
    }

}
