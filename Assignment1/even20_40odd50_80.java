import java.util.*;

public class even20_40odd50_80
{
	public static void main(String[] args) 
	{
		for (int i=20; i<=40; i++)
		{
			if (i%2==0)
				System.out.print(i + " ");
		}
		System.out.println();
		for (int j=50; j<80; j++)
		{
			if (j%2==1)
				System.out.print(j + " ");
		}
	}
}