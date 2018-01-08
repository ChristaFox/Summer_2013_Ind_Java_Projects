/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A03
*******************************************************/
package a03;

public class InheritanceApp 
{
	public static void main(String[] args) 
	{
		Rectangle myRectangle = new Rectangle(5, 4);
		Square mySquare = new Square(4, 4);
		Triangle myTriangle = new Triangle(5);
		Circle myCircle = new Circle(4);
		System.out.println(myRectangle.toString());
		System.out.printf("Length: %d%n", myRectangle.getLength());
		System.out.printf("Width: %d%n", myRectangle.getWidth());
		System.out.println();
		
		System.out.println(mySquare.toString());
		System.out.printf("Side: %d%n", mySquare.getSide());
		System.out.println();
		
		System.out.println(myTriangle.toString());
		System.out.printf("Leg: %d%n", myTriangle.getLeg());
		System.out.printf("Hypotenuse: %.1f%n", myTriangle.getHypotenuse());
		System.out.println();
		
		System.out.println(myCircle.toString());
		//System.out.printf("Diameter: %d%n", myCircle.diameter());
		//System.out.printf("Circumference: %d%n", myCircle.circumference());
		System.out.printf("Radius: %d%n", myCircle.getRadius());
		System.out.println();
		
		Rectangle rectangle2 = mySquare;
		System.out.println("rectangle2:");
		System.out.println("--------------------");
		System.out.println(rectangle2);
		System.out.printf("Length: %d%n", mySquare.getLength());
		System.out.printf("Width: %d%n", mySquare.getWidth());
		//System.out.printf("Side: %d%n", mySquare.getSide());
		System.out.println();
		
		System.out.println("Rectangle Array:");
		System.out.println("--------------------");
		Rectangle[] rectangles = {rectangle2, mySquare, myRectangle};
		for(Rectangle el : rectangles)
		{
			System.out.println(el.toString());
			System.out.printf("Length: %d%n", el.getLength());
			System.out.printf("Width: %d%n", el.getWidth());
			System.out.println();
		}
	}
}

