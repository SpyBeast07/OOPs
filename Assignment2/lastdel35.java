public class lastdel35
{
    public static int del(int n) 
    {
       if (n < 10) 
       {
         return 0;
       }
       else
       {
         int temp = del(n/10);
         return ((temp*10)+(n%10));
       }
    }
 
    public static void main(String[] args) 
    {
       int num = 31452;
       int result = del(num);
       System.out.println(result);
    }
}
