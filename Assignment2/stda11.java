class Student3
{
    String name;
    public Student3(String nam)
    {
        name = nam;
        // System.out.println(nam);
    }
    public Student3()
    {
        name = "Unknown";
        // System.out.println(name);
    }
}

public class stda11
{
    public static void main(String[] args) 
    {
        Student3 stad = new Student3();
        Student3 stad1 = new Student3("Kushagra");
        System.out.println(stad.name);
        System.out.println(stad1.name);
    }
}
