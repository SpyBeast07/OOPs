class Student2
{
    String name;
    int rollno;
    String phoneno;
    String address;

    void detail(String nam, int rolln, String phonen, String addr)
    {
        name = nam;
        rollno = rolln;
        phoneno = phonen;
        address = addr;

        System.out.println("Details of "+ name);
        System.out.println("Roll number: " + rollno);
        System.out.println("Phone number: " + phoneno);
        System.out.println("Address: " + address);
    }
}

public class sta5
{
    public static void main(String[] args) 
    {
        Student2 sam = new Student2();
        sam.detail("Sherlock", 21, "9246131289", "221B Baker Street");
        System.out.println();
        Student2 john = new Student2();
        john.detail("Sergio Marquina", 32, "8746592651", "30 Calle Alcántara, San Blas-Canillejas");
    }
}
