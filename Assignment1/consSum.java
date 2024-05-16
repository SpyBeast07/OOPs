import java.util.*;

public class consSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		while (n>9)
		{
			int x = n%100;
			sum += x;
			n /= 10;
		}
		System.out.println(sum);

		sc.close();
	}
}