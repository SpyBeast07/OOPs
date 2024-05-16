import java.util.*;

public class maxOfN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to enter: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int x = 0;
		System.out.print("Enter " + n + " numbers: ");
		for (int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int j=0; j<n; j++)
		{
			int y = a[j];
			if (y>=x)
			{
				x = y;
			}
		}
		System.out.println(x);

		sc.close();
	}
}