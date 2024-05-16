import java.util.*;

public class last2ndEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		while ((n%10)%2==1)
		{
			n /= 10;
			continue;
		}
		n /= 10;
		while((n%10)%2==1)
		{
			n /= 10;
		}
		System.out.println(n%10);

		sc.close();
	}
}