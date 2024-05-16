import java.util.*;

public class multiple3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number till when to print multiples of 3: ");
		int n = sc.nextInt();
		for (int i=3; i<=n; i++)
		{
			if ((i%10)%3==0)
				System.out.print(i + " ");
		}

		sc.close();
	}
}