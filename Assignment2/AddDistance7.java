import java.util.*;

class Distance
{
    int feet;
    int inches;
    
    public Distance(int f1, int i1, int f2, int i2)
    {
        feet = f1+f2;
        inches = i1+i2;
    }

    void add()
    {
        int totalIn = (feet*12)+inches;
        feet = (totalIn/12);
        inches = (totalIn%12);
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
}

class AddDistance7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f1 = 5, i1 = 8, f2 = 6, i2 = 7;
        Distance dis = new Distance(f1, i1, f2, i2);
        dis.add();
        sc.close();
    }
}
