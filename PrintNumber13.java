public class PrintNumber13
{
    public static void printin(byte n)
    {
        System.out.println("Byte number: " + n);
    }
    public static void printin(short n)
    {
        System.out.println("Short number: " + n);
    }
    public static void printin(int n)
    {
        System.out.println("Int number: " + n);
    }
    public static void printin(long n)
    {
        System.out.println("Long number: " + n);
    }
    public static void printin(float n)
    {
        System.out.println("Float number: " + n);
    }
    public static void printin(double n)
    {
        System.out.println("Double number: " + n);
    }
    public static void printin(char n)
    {
        System.out.println("Character: " + n);
    }
    public static void main(String[] args)
    {
        printin((byte)12);
        printin((short)15);
        printin(10);
        printin(10000000000L);
        printin(21.12f);
        printin(100000000000.999D);
        printin('K');
    }
}