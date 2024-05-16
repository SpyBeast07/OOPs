abstract class Bank
{
    abstract int getBalance();
}

class A extends Bank
{
    int balance = 1000;

    int getBalance()
    {
        return balance;
    }
}

class B extends Bank
{
    int balance = 1500;

    int getBalance()
    {
        return balance;
    }
}

class C extends Bank
{
    int balance = 2000;

    int getBalance()
    {
        return balance;
    }
}

public class Bank26
{
    public static void main(String[] args)
    {
        Bank A = new A();
        System.out.println("Balance in Bank A: Rs." + A.getBalance());
        Bank B = new B();
        System.out.println("Balance in Bank B: Rs." + B.getBalance());
        Bank C = new C();
        System.out.println("Balance in Bank C: Rs." + C.getBalance());
    }
}
