import java.util.*;

public class sumPowFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		while(m>0)
		{
			sum += (m%10);
			m /= 10;
		}
		for (int j=2; j<((n/2)+1); j++)
		{
			if (n%j==0)
			{
				m = j;
				break;
			}
		}
		double ans = Math.pow(sum, m);
		System.out.println("Sum of digits: " + sum + "\nSmallest factor: " + m);
		System.out.println("Answer: " + ans);

		sc.close();
	}
}