public class Square extends Rectangle
{
    public Square(int height)
    {
        super(height, height);
    }

    public void setHeight(int height)
    {
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(int width)
    {
        super.setHeight(width);
        super.setWidth(width);
    }
}
