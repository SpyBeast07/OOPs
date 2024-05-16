import java.util.*;

public class consExcSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		while (n>9)
		{
			int b = n%10;
			n /= 10;
			int a = n%10;
			sum += ((b*10)+a);
		}
		System.out.println(sum);

		sc.close();
	}
}