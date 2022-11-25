import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest
{
    @Test
    public void computeAreaSquareTest()
    {
        Rectangle rectangle = new Square(4);
        assertEquals(16, rectangle.computeArea());
    }

    @Test
    public void computeAreaSquareTest2()
    {
        Rectangle rectangle = new Square(4);
        rectangle.setHeight(3);
        assertEquals(9, rectangle.computeArea());
    }

    @Test
    public void computeAreaSquareTest3()
    {
        Rectangle rectangle = new Square(4);
        rectangle.setWidth(5);
        assertEquals(25, rectangle.computeArea());
    }
}