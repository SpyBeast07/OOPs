import java.util.*;

public class noSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print("Enter " + n + " numbers: ");
		for (int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			sum += x;
		}
		System.out.println(sum);

		sc.close();
	}
}