import java.util.*;

public class maxSumOfDigi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to enter: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int maxSum = 0;
		int z = 0;
		System.out.print("Enter " + n + " numbers: ");
		for (int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int j=0; j<n; j++)
		{
			int y = a[j];
			int m = y;
			int sum = 0;
			while (m>0)
			{
				sum += (m%10);
				m /= 10;
			}
			if (sum >= maxSum)
			{
				maxSum = sum;
				z = y;
			}
		}
		System.out.println(z);

		sc.close();
	}
}