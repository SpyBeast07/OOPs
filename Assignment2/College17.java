class Degree 
{
    public void getDegree() 
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree 
{
    public void getDegree() 
    {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree 
{
    public void getDegree() 
    {
        System.out.println("I am a Postgraduate");
    }
}

public class College17
{
    public static void main(String[] args)
    {
        Degree deg = new Degree();
        deg.getDegree();
        Undergraduate ugdeg = new Undergraduate();
        ugdeg.getDegree();
        Postgraduate pgdeg = new Postgraduate();
        pgdeg.getDegree();
    }
}
