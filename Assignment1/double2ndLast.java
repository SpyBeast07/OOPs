import java.util.*;

public class double2ndLast
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int l = n%10;
		int x = ((n%100)/10);
		n = ((((n/10)+x)*10)+l);
		System.out.println(n);

		sc.close();
	}
}