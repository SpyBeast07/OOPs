import java.util.*;

public class delMaxDigi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int m = n;
		int maxd = 0;
		while (m>0)
		{
			int a = m%10;
			if (a > maxd)
			{
				maxd = a;
			}
			m /= 10;
		}

		int p = 1;
		while (n>0)
		{
			int digi = n%10;
			if (digi != maxd)
			{
				m += digi * p;
				p *= 10;
			}
			n /= 10;
		}
		System.out.println(m);

		sc.close();
	}
}