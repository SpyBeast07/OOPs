// import java.util.*;
public class kdigit32
{    
    public static int g(int x, int k)
    {
        if (k<1)
        {
            return x%10;
        }
        else if (x<10 && k>1)
        {
            return -1;
        }
        else
        {
            return g(x/10, k-1);
        }
    }
    
    public static void main(String[] args)
    {
        int x = 17654835;
        x = Math.abs(x);
        int k = 3;
        int digi = g(x, k-1);
        if (g(x, k-1) == -1)
        {
            System.out.println("The " + k + "th index is out of bound");
        }
        else
        {
            System.out.println("The " + k + "th digit from last of number is: " + digi);
        }
    }
}
