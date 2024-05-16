import java.util.*;

public class prodExcLastDig
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = x%10;
		int b = y%10;
		x = ((x-a)+b);
		y = ((y-b)+a);
		System.out.println(x*y);

		sc.close();
	}
}