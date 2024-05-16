public class evendigi33
{
    public static int evendigit(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else
        {
            int digit = (num%10);
            if(digit%2 == 0)
            {
                return (digit+evendigit(num / 10));
            }
            else
            {
                return (evendigit(num / 10));
            }
        }
    }
    
    public static void main(String[] args)
    {
        int num = 19876532;
        int sum = evendigit(num);
        System.out.println("Sum of even digits is: " + sum);
    }
}
