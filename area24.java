abstract class Shape2
{
    public abstract void RectangleArea(int l, int b);
    public abstract void SquareArea(int s);
    public abstract void CircleArea(int r);
}

class Area extends Shape2
{
    public void RectangleArea(int l, int b) 
    {
        System.out.println("Area of Rectangle is: " + (l*b));
    }
    public void SquareArea(int s) 
    {
        System.out.println("Area of Square is: " + (s*s));
    }
    public void CircleArea(int r) 
    {
        System.out.println("Area of Circle is: " + (3.14*r*r));
    }
}

public class area24 
{
    public static void main(String[] args) 
    {
        Area obj = new Area();
        obj.RectangleArea(4, 8);
        obj.SquareArea(5);
        obj.CircleArea(7);
    }
}