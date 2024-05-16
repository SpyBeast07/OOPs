public class inceven36
{
    public static int incdigi(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else
        {
            int lastd = (num%10);
            if ((lastd%2) == 0)
            {
                lastd++;
            }
            return ((incdigi(num/10)*10) + lastd);
        }
    }
    
    public static void main(String[] args)
    {
        int num = 6489314;
        int digi = incdigi(num);
        System.out.println("Original number: " + num);
        System.out.println("New Number: " + digi);
    }
}