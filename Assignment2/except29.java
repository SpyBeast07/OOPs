public class except29
{
    public static void main(String[] args)
    {
        try
        {
            int x = 10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("0 division error: " + e);
        }

        try
        {
            int[] arr = new int[3];
            arr[4] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bound error: " + e);
        }

        // Null pointer exception
        try
        {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("null pointer error: " + e);
        }
    }
}
