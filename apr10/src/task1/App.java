package task1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Circle();
		s.calculateArea();		//3.14 * r * r

		s=new Rectangle();
		s.calculateArea();		//l * b

		s=new Triangle();
		s.calculateArea();

	}

}

class Shape
{
	
}

class Circle extends Shape
{
	public void calculateArea()
	{
		System.out.println("3.14 * r * r");
	}
}

class Rectangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("l * b");
	}
}

class Triangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("0.5 * b * h");
	}
}
