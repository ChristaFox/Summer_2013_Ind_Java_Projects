/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A04
*******************************************************/
package a04;

public class Triangle implements Printable
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

	@Override
	public double perimeter() 
	{
		return (getLeg() + getLeg() + getHypotenuse());
	}

	@Override
	public double area()
	{	
		return ((getLeg() * getLeg()) / 2);
	}

	@Override
	public StringBuilder print() 
	{
		StringBuilder sb = new StringBuilder();
		int spacerBase = 1;
		
		for(int i = 0; i < ((getLeg() - 1)); i++)
		{
			//left
			{
				sb.append("*");
			}
			
			//middle
			if(i<=1)
			{
				for(int l = 0; l<i; l++)
				{
					sb.append(" ");
				}
			}
			else
			{
				for(int l = 0; l<(i+spacerBase); l++)
				{
					sb.append(" ");
				}

				spacerBase++;
			}
			
			//right
			
			if(i>0)
			{
				sb.append("*");
			}
			sb.append(System.getProperty("line.separator"));
		}
		for(int i = 0; i < (getLeg()); i++)
		{
			sb.append("* ");
		}
		sb.toString();
		return sb;
	}	
}

