import java.util.*;

public class sumAfterEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print("Enter " + n + " numbers: ");
		int x = 1;
		while (x%2==1)
		{
			x = sc.nextInt();
			n--;
		}
		sum += x;
		while (n>0)
		{
			x = sc.nextInt();
			sum += x;
			n--;
		}
		System.out.println(sum);

		sc.close();
	}
}