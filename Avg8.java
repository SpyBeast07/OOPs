import java.util.Scanner;

class Average 
{
    public void calc() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + ", " + b + " and " + c + " is " + String.format("%.3f", average));
        sc.close();
    }
}

public class Avg8
{
    public static void main(String[] args) 
    {
        Average avg = new Average();
        avg.calc();
    }
}
