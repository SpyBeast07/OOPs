import java.util.*;

public class rectArea
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 sides of rectangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area of rectangle is: " + a*b);

		sc.close();
	}
}