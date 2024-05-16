import java.util.*;

public class arrexcpet30 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt(); 
            int[] arr = new int[size];
            System.out.println("Array created");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("negative array error: " + e);
        }
    }
}
