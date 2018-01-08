/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A07
*******************************************************/

package a07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListVsSetDemo

{
	//feilds
	private List<ColoredSquare> list;
	private ArrayList<ColoredSquare> set;
	
	//ctors
	public ListVsSetDemo(ColoredSquare... elements)
	{
		this.list = new ArrayList<ColoredSquare>(Arrays.asList(elements));
		this.set = new ArrayList<ColoredSquare>(new HashSet<ColoredSquare>(Arrays.asList(elements)));
	}
	
	//methods
	public String getListElements() 
	{
		StringBuilder sb = new StringBuilder();
		for(ColoredSquare el: this.list)
		{
			sb.append(el);
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}

	public String getSetElements()
	{
		ArrayList<ColoredSquare> temp = new ArrayList<ColoredSquare>(new HashSet<ColoredSquare>(set));
				
		StringBuilder sb = new StringBuilder();
		for(ColoredSquare el: temp)
		{
			sb.append(el);
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	public void addElement(ColoredSquare element)
	{
			list.add(element);
			set.add(element);
	}
	
}
