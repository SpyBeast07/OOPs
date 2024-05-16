import java.util.*;

public class deleteLast2Digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int x = (n/100);
		System.out.println(x);

		sc.close();
	}
}