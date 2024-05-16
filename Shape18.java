class Shape 
{
	void sq1()
	{
		System.out.println("This is this is shape");
	}
}

class Rectangle extends Shape 
{
	void sq2()
	{
		System.out.println("This is a rectangular shape");
	}
}

class Circle extends Shape 
{
	void sq() 
	{
		System.out.println("This is a circular shape");
	}
}

class Square extends Rectangle
{
	void sq()
	{
		System.out.println("Square is a rectangle");
	}
}

public class Shape18 
{
	public static void main(String[] args) 
	{
		Square ob = new Square();
		ob.sq1();
		ob.sq2();
	}
}