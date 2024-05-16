import java.util.*;

public class oddeven
{
	public static void main(String[] args) 
	{
		for (int i=0; i<90; i++)
		{
			if (((i/10)%2)==0 && (i%2)==1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int j=1; j<100; j++)
		{
			if (((j/10)%2)==1 && (j%2)==0)
			{
				System.out.print(j + " ");
			}
		}
	}
}