abstract class Animals 
{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals 
{
    void cats() 
    {
        System.out.println("Cats meow");
    }
    void dogs(){}
}

class Dogs extends Animals 
{
    void dogs() 
    {
        System.out.println("Dogs bark");
    }
    void cats(){}
}

public class animals23
{
    public static void main(String[] args)
    {
        Animals obj1 = new Cats();
        Animals obj2 = new Dogs();
        obj1.cats();
        obj2.dogs();
    }
}
