import java.util.*;

public class lastBTW5_8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number till which to print: ");
		int n = sc.nextInt();
		for (int i=5; i<=n; i++)
		{
			int x = (i%10);
			if (x>=5 && x<=8)
			{
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}