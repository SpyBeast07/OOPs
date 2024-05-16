class Areas
{
    int len, bre;

    void setDim(int l, int b)
    {
        len = l;
        bre = b;
    }
    int getArea() 
    {
        return (len * bre);
    }
}

public class rectarea3
{
    public static void main(String[] args) 
    {
        Areas rec = new Areas();
        rec.setDim(4, 9);
        System.out.println("Area of the rectangle is: " + rec.getArea());
    }
}