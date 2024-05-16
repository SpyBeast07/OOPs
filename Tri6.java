class Triangle
{
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    Triangle()
    {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle is: " + perimeter);

        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of the triangle is: " + area);
    }
}

public class Tri6
{
    public static void main(String[] args)
    {
        Triangle tri = new Triangle();
    }
}
