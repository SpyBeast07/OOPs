public class charint14
{
    public static void opp(int n, char c)
    {
        System.out.println("1st Integer: " + n + " and 2nd Character: " + c);
    }
    public static void opp(char c, int n)
    {
        System.out.println("1st Character: " + c + " and 2nd Integer: " + n);
    }
    public static void main(String[] args)
    {
        opp(7, 'K');
        opp('H', 7);
    }
}