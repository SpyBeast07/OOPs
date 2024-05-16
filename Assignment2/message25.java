abstract class Parent2
{
    abstract void message();
}

class Subclass1 extends Parent2
{
    void message()
    {
        System.out.println("This is the first subclass");
    }
}

class Subclass2 extends Parent2
{
    void message()
    {
        System.out.println("This is the second subclass");
    }
}

public class message25
{
    public static void main(String[] args)
    {
        Parent2 obj1 = new Subclass1();
        obj1.message();
        Parent2 obj2 = new Subclass2();
        obj2.message();
    }
}
