package a02;

import java.util.ArrayList;

public class BLanguageApp 
{

	public static void main(String[] args) 
	{
		ArrayList<String> quotes = new ArrayList<String>();
		quotes.add(new String("For every minute you are angry you lose sixty seconds of happiness."));
		quotes.add(new String("You miss one hundred percent of the shots you never take."));
		quotes.add(new String("Everything has its beauty, but not everyone sees it."));
		quotes.add(new String("The best way to cheer yourself up is to cheer somebody else up."));
		
		for(String el : quotes)
		{
			System.out.println(el);
		}
		System.out.println();
		
		for(String el : quotes)
		{
			System.out.println(BLanguage.translate(el));
		}
	System.out.println();
	}
}
