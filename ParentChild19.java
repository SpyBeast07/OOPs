class Parent
{
    public void par()
    {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent
{
    public void chi()
    {
        System.out.println("This is child class.");
    }
}

public class ParentChild19
{
    public static void main(String[] args)
    {
        Parent pp = new Parent();
        Child cc = new Child();

        pp.par();
        cc.chi();
        cc.par();
    }
}
