public class factor34
{
    public static int facto(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return (n*facto(n - 1));
        }
    }
    
    public static void main(String[] args)
    {
        int n = 5;
        int factorial = facto(n);
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}