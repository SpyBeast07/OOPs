import java.util.*;
public class evendigit31
{
    static int loc;
    static int digi;
    public static int findLastEvenDigitLocation(int n, int index)
    {
        if (n == 0)
        {
            return -1;
        }
        else if ((n%10)%2 == 0)
        {
            digi = n%10;
            loc = index;
            return index;
        }
        else
        {
            return findLastEvenDigitLocation(n/10, index + 1);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = findLastEvenDigitLocation(n, 1);
        if (index == -1)
        {
            System.out.println("No even digit");
        }
        else
        {
            System.out.println("Last even digit " + digi + " is at location " + loc + " from the last.");
        }
    }
}