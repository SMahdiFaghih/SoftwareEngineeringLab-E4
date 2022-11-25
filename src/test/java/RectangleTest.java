import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void coumputeAreaTest(){
        var rectangle = new Rectangle(4,8);

        rectangle.setHeight(rectangle.getHeight() - 1);
        rectangle.setWidth(rectangle.getWidth() + 6);

        assertEquals(42, rectangle.computeArea());
    }
}