import java.util.*;

public class primeSum
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
			boolean pr = true;
			int x = sc.nextInt();
			for (int j=2; j<((x/2)+1); j++)
			{
				if (x%j==0)
				{
					pr = false;
					break;
				}
			}
			if (pr)
				sum += x;
		}
		System.out.println(sum);

		sc.close();
	}
}