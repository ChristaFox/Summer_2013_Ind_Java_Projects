/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A04
*******************************************************/
package a04;

public class Rectangle implements Printable
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

	@Override
	public double perimeter() 
	{
		return ((2 * getLength()) + (2 * getWidth()));
	}

	@Override
	public double area() 
	{
		return (getLength() * getWidth());
	}

	@Override
	public StringBuilder print() 
	{
		StringBuilder sb = new StringBuilder();
		if(getWidth() >= getLength())
		{
			for(int i = 0; i < getWidth(); i++)
			{
				sb.append("* ");
			}
			sb.append(System.getProperty("line.separator"));
			for(int i = 0; i < (getLength()-2); i++)
			{
				sb.append("*");
				for(int j = 0; j < (getWidth()-2); j++)
				{
					sb.append("  ");
				}
				sb.append(" *");
				sb.append(System.getProperty("line.separator"));
			}
			for(int i = 0; i < getWidth(); i++)
			{
				sb.append("* ");
			}
			sb.toString();
			return sb;
		}
		else
		{
			for(int i = 0; i < getLength(); i++)
			{
				sb.append("* ");
			}
			sb.append(System.getProperty("line.separator"));
			for(int i = 0; i < (getWidth()-2); i++)
			{
				sb.append("*");
				for(int j = 0; j < (getLength()-2); j++)
				{
					sb.append("  ");
				}
				sb.append(" *");
				sb.append(System.getProperty("line.separator"));
			}
			for(int i = 0; i < getLength()-1 ; i++)
			{
				sb.append("* ");
			}
			sb.append("*");
			sb.toString();
			return sb;
	
		}
	}
}
