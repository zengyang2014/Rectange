import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
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

}
