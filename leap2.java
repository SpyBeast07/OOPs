import java.util.*;

class leapyear
{
    boolean leaps(int x)
    {
        if (x%4==0)
        {
            if (x%100==0)
            {
                if (x%400==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}

public class leap2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        leapyear l = new leapyear();
        System.out.print("Enter the year: ");
        int x = sc.nextInt();
        boolean y = l.leaps(x);
        if (y)
        {
            System.out.println(x+" is a leap year.");
        }
        else
        {
            System.out.println(x+" is not a leap year.");
        }
        sc.close();
    }
}