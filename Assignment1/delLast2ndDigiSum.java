import java.util.*;

public class delLast2ndDigiSum
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
			int a = x%10;
			x = ((x/100)*10)+a;
			sum += x;
		}
		System.out.println(sum);

		sc.close();
	}
}