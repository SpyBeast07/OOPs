class Student5
{
    String name;
    int age;
    String address;
    
    public Student5() 
    {
        name = "unknown";
        age = 0;
        address = "not available";
    }
    
    public void setInfo(String nam, int ag) 
    {
        name = nam;
        age = ag;
    }
    
    public void setInfo(String nam, int ag, String addres) 
    {
        name = nam;
        age = ag;
        address = addres;
    }

    public Student5(String nam, int ag) 
    {
        name = nam;
        age = ag;
        address = "not available";
    }
    
    public Student5(String nam, int ag, String addres) 
    {
        name = nam;
        age = ag;
        address = addres;
    }
    
    public void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class sdat16
{
    public static void main(String[] args) 
    {
        Student5[] studentas = new Student5[10];
        
        studentas[0] = new Student5("John", 20, "123 Main St");
        studentas[1] = new Student5("Jane", 21);
        studentas[2] = new Student5("Sherlock", 26, "221 Bakers Street");
        studentas[3] = new Student5("Bob", 22, "456 Elm St");
        studentas[4] = new Student5("Alice", 19);
        studentas[5] = new Student5("Mike", 23);
        studentas[6] = new Student5("Sara", 20, "789 Oak St");
        studentas[7] = new Student5("Watson", 24);
        studentas[8] = new Student5("Tom", 21);
        studentas[9] = new Student5("Mary", 22, "345 Pine St");
        
        for (int i = 0; i < studentas.length; i++) 
        {
            studentas[i].display();
        }
    }
}
