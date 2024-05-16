public class RecSqArea15
{
    public static void area(int r)
    {
        System.out.println("Area of square: " + ((3.14f)*r*r));
    }
    public static void area(int l, int b)
    {
        System.out.println("Area of rectangle: " + (l*b));
    }
    public static void main(String[] args)
    {
        area(7);
        area(9, 8);
    }    
}
