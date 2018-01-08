/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A03
*******************************************************/
package a03;

public class Circle 
{
	//feilds
	private final int radius;
	
	//ctors
	public Circle(int r) 
	{
		radius = r;
	}
	
	//methods
	public int diameter()
	{
		return (2 * radius);
	}
	
	public int circumference()
	{
		return (int) (Math.PI * diameter());
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
	
}
