/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A03
*******************************************************/
package a03;

public class Rectangle 
{
	//feilds
	private final int length;
	private final int width;
	
	//ctors
	public Rectangle(int l, int w) 
	{
		length = l;
		width = w;
	}

	//methods
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	@Override
	public String toString() 
	{
		return getClass().getSimpleName() + "(" + getLength() + "X" + getWidth() + ")";
	}


}
