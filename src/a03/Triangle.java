/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A03
*******************************************************/
package a03;

public class Triangle
{
	//feilds
	private final int leg;
	private final double hypotenuse;
	
	//ctors
	public Triangle(int l) 
	{
		leg = l;
		hypotenuse = Math.hypot(l, l);
	}

	//methods
	public int getLeg()
	{
		return leg;
	}
	
	public double getHypotenuse()
	{
		return hypotenuse;
	}
	
	@Override
	public String toString() 
	{
		return getClass().getSimpleName() + "(" + leg + ")";
	}
	
}
