import java.util.*;

public class sqCubeSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Output is: " + ((a*a)+(b*b*b)));

		sc.close();
	}
}