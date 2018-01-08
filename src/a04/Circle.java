/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A04
*******************************************************/
package a04;

public class Circle implements Shape
{
	//feilds
	private final int radius;
	
	//ctors
	public Circle(int r) 
	{
		radius = r;
	}
	
	//methods
	public double diameter()
	{
		return (2 * radius);
	}
	
	public double circumference()
	{
		return (Math.PI * diameter());
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	@Override
	public String toString() 
	{
		return getClass().getSimpleName() + "(" + getRadius() + ")";
	}

	@Override
	public double perimeter() 
	{
		return circumference();
	}

	@Override
	public double area() 
	{
		return(Math.PI * (getRadius() * getRadius()));
	}
	
}
