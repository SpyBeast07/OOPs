import java.util.*;

public class weightedSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		int j = 1;
		System.out.print("Enter " + n + " numbers: ");
		for (int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			if (x%2==0)
			{
				sum += (j*x);
				j++;
			}
		}
		System.out.println(sum);

		sc.close();
	}
}