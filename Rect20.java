class Rectangle2
{
    int length, breadth;
    public Rectangle2(int len, int bre)
    {
        length = len;
        breadth = bre;
    }
    void area()
    {
        System.out.println("Area of rectangle is: " + (length*breadth));
    }
    void perimeter()
    {
        System.out.println("Perimeter of rectangle is: " + (2*(length+breadth)));
    }
}

class Square2 extends Rectangle2
{
    public Square2(int s)
    {
        super(s, s);
    }
}

public class Rect20
{
    public static void main(String[] args)
    {
        Rectangle2 rect = new Rectangle2(5, 10);
        System.out.print("Rectangle area: ");
        rect.area();
        System.out.print("Rectangle perimeter: ");
        rect.perimeter();

        Square2 square = new Square2(7);
        System.out.print("Square area: ");
        square.area();
        System.out.print("Square perimeter: ");
        square.perimeter();
    }
}
