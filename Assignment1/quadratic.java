import java.util.*;

public class quadratic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, p, q, c in form ((a*(p*p))+(b*q)-c): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int x = ((a*(p*p))+(b*q)-c);
		System.out.println(x);

		sc.close();
	}
}