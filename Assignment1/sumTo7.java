import java.util.*;

public class sumTo7
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=99; i++)
		{
			int a = i/10;
			int b = i%10;
			if ((a+b)%7==0)
			{
				System.out.println(i);
			}
		}
	}
}