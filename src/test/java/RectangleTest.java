import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void computeAreaTest(){
        Rectangle rectangle = new Rectangle(4,8);


        assertEquals(32, rectangle.computeArea());
    }

    @Test
    public void computeAreaTest2(){
        Rectangle rectangle = new Rectangle(4,8);

        rectangle.setHeight(rectangle.getHeight() - 1);
        rectangle.setWidth(rectangle.getWidth() + 6);

        assertEquals(42, rectangle.computeArea());
    }
}