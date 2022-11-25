import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void coumputeAreaTest(){
        var rectangle = new Rectangle(4,8);

        assertEquals(32, rectangle.computeArea());
    }
}