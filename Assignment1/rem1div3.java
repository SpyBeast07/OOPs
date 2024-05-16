import java.util.*;

public class rem1div3
{
	public static void main(String[] args) 
	{
		for (int i=10; i<80; i++)
		{
			if ((i/10)%3==1)
			{
				System.out.println(i);
			}
		}
	}
}