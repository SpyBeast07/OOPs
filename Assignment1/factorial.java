import java.util.*;

public class factorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int fact=1;
		while (n>0)
		{
			fact *= n;
			n--;
		}
		while (fact>9)
		{
			fact /= 10;
		}
		System.out.println(fact);

		sc.close();
	}
}