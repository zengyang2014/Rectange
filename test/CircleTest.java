import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yzeng on 03/05/2017.
 */
public class CircleTest {

    @Test
    public void testCircleCalculateCorrectArea(){
        Circle testCircle = new Circle(12);

        double assumedAnswer = Math.PI * Math.pow(12, 2);

        assertEquals(assumedAnswer, testCircle.getArea(), 0.0000001);
    }

    @Test
    public void testCircleCalculatePerimeter() {
        Circle testCircle = new Circle(10);

        double assumedAnswer = 2 * 10 * Math.PI;

        assertEquals(assumedAnswer, testCircle.getPerimeter(), 0.0000001);
    }

    @Test
    public void testPerimiterWithNegativeRadius(){
        Circle testCircle = new Circle(-10);

        double assumedAnswer = 2 * 10 * Math.PI;

        assertEquals(assumedAnswer, testCircle.getPerimeter(), 0.0000001);

    }

    @Test
    public void testAreaWithNegativeRadius() {
        Circle testCircle = new Circle(-100);

        double assumedAnswer =  Math.PI * Math.pow(100, 2);

        assertEquals(assumedAnswer, testCircle.getArea(), 0.0000001);

    }

}