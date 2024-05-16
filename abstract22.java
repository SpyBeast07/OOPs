abstract class Abstract
{
    Abstract()
    {
        System.out.println("This is a constructor of the abstract class.");
    }
    
    abstract void a_method();
    
    void normal()
    {
        System.out.println("This is a normal method of the abstract class.");
    }
}

class SubClass extends Abstract
{
    void a_method() 
    {
        System.out.println("This is abstract method.");
    }
}

public class abstract22 
{
    public static void main(String[] args) 
    {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normal();
    }
}