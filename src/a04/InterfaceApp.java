/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A04
*******************************************************/
package a04;

public class InterfaceApp 
{
	public static void main(String[] args)
	{
		Rectangle myRectangle1 = new Rectangle(6, 3);
		Triangle myTriangle1 = new Triangle(6);
		Square mySquare1 = new Square(5, 5);
		Circle myCircle1 = new Circle(5);
		
		System.out.println(myRectangle1.toString() + "\n");
		System.out.println(mySquare1.toString() + "\n");;
		System.out.println(myTriangle1.toString() + "\n");
		System.out.println(myCircle1.toString());
		System.out.printf("Diameter: %.0f%n", myCircle1.diameter());
		System.out.printf("Circumference: %.1f%n%n", myCircle1.circumference());
		
		System.out.println("Shape Array: \n------------");
		
		Shape[] shapes = {mySquare1, myRectangle1, myTriangle1, myCircle1};
		for(Shape el : shapes)
		{
			System.out.println(el.toString());
			System.out.printf("Perimeter: %.1f%n", el.perimeter());
			System.out.printf("Area: %.1f%n", el.area());	
			if(el instanceof Printable)
			{
				System.out.println(((Printable) el).print());
				System.out.println();
			}
			else
			{
				System.out.println();
			}
			
		}
		
	}
}
