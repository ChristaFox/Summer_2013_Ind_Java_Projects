/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A03
*******************************************************/
package a03;

public class Square extends Rectangle
{
	//feilds
	
	//ctors
	public Square(int l, int w) 
	{
		super(l, w);
	}

	//methods
	public int getSide()
	{
		if(getLength() == getWidth())
		{
			return getLength();
		}
		else
		{
			System.out.println("This is a rectangle, and not a square.");
			return 0;
		}
	}
	
	@Override
	public String toString() 
	{
		return getClass().getSimpleName() + "(" + getSide() + ")";
	}

}
