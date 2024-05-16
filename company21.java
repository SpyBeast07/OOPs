class member
{
    String name;
    int age;
    long phoneno;
    String address;
    double salary;

    void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends member
{
    String specialisation;
}

class Manager extends member
{
    String department;
}

public class company21
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.name = "John Wick";
        emp.age = 51;
        emp.phoneno = 9716431897L;
        emp.address = "121 Mill Neck in Long Island, NY";
        emp.salary = 720000.00;
        emp.specialisation = "Web Development";
        
        System.out.println("Employee details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone number: " + emp.phoneno);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialisation);

        Manager mgr = new Manager();
        mgr.name = "Sherlock Holmes";
        mgr.age = 46;
        mgr.phoneno = 9789413216L;
        mgr.address = "221B Baker Street";
        mgr.salary = 450000.00;
        mgr.department = "Engineering";

        System.out.println("\nManager details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone number: " + mgr.phoneno);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);

    }
}
