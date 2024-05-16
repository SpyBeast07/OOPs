public class instance28 
{
    static int count = 0;

    public instance28()
    {
        count++;
    }

    public static void main(String[] args)
    {
        instance28 obj1 = new instance28();
        instance28 obj2 = new instance28();
        instance28 obj3 = new instance28();
        System.out.println("Number of instances created: " + count);
    }
}