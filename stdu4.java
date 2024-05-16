class Student1
{
    String name;
    int roll_no;
}

public class stdu4
{
    public static void main(String[] args)
    {
        Student1 stud = new Student1();
        stud.name = "John";
        stud.roll_no = 2;
        System.out.println("Name: " + stud.name);
        System.out.println("Roll No: " + stud.roll_no);
    }
}