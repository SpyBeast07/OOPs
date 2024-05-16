import java.util.*;

public class exc3Nlast
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter min 3 digit number: ");
		int n = sc.nextInt();
		int x = (n%1000);
		n = (n/1000);
		int a = (x/100);
		int b = ((x%100)/10);
		int c = (x%10);
		x = ((c*100)+(b*10)+a);
		n = ((n*1000)+x);
		System.out.println(n);

		sc.close();
	}
}