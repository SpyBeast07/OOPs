import java.util.Scanner;

class complex 
{
    double real1, imag1, real2, imag2;
    complex(double real11, double real22, double imag11, double imag22)
    {
        real1 = real11;
        imag1 = imag11;
        real2 = real22;
        imag2 = imag22;
    }
    void add()
    {
        double ad1 =  (real1 + real2);
        double ad2 = (imag1 + imag2);
        System.out.println("The sum of the two complex numbers is: " + ad1 + " + " + ad2 + "i");
    }
    void subs()
    {
        double sub1 =  (real1 - real2);
        double sub2 = (imag1 - imag2);
        System.out.println("The difference of the two complex numbers is: " + sub1 + " + " + sub2 + "i");
    }
    void multi()
    {
        double mul1 =  (real1 * real2);
        double mul2 = (imag1 * imag2);
        System.out.println("The product of the two complex numbers is: " + mul1 + " + " + mul2 + "i");
    }
}

public class Complex9
{
    public static void main(String[] args)
    {
        double real1, real2;
        double imag1, imag2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st complex numbers: ");
        real1 = sc.nextDouble();
        imag1 = sc.nextDouble();
        System.out.print("Enter 2nd complex numbers: ");
        real2 = sc.nextDouble();
        imag2 = sc.nextDouble();
        
        complex com = new complex(real1, real2, imag1, imag2);
        com.add();
        com.subs();
        com.multi();
        sc.close();
    }
}
