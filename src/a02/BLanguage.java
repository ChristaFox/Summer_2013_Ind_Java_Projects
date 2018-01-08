package a02;

public class BLanguage 
{
	//feilds
	private static int fV;
	private static int lV;
	private static String[] rTokens;
	private static String fVowel;
	private static String lVowel;
	
	//ctors
	
	//methods
	public static String translate(String toTranslate)
	{	
		/*
		 * removes all punctuation
		 */
		toTranslate = toTranslate.replace(".", "");
		toTranslate = toTranslate.replace(",", "");
		toTranslate = toTranslate.replace("!", "");
		toTranslate = toTranslate.replace(";", "");
		toTranslate = toTranslate.replace(":", "");
		toTranslate = toTranslate.replace("-", "");
		
		createTokens(toTranslate);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < rTokens.length;i++)
		{
			sb.append(translateWord(rTokens[i]));
			
			if(i != rTokens.length-1)
			{
				sb.append(" ");
			}
		}
		
		sb.append(".");
		return sb.toString().replaceFirst(sb.substring(0, 1), sb.substring(0, 1).toUpperCase());
	}
	
	private static String translateWord(String word)
	{
		String fString = word.toLowerCase();
		fString = firstLetter(fString);
		fString = firstVowel(fString);
		fString = lastVowel(fString);
		return fString;
		
	}
	
	/*
	 * takes in a sentence and splits it word by word
	 */
	private static void createTokens(String s)
	{
		String tokens = s;
		for (int i = 0; i < tokens.length(); i++)
		rTokens = tokens.split(" ");
	}
	
	/*
	 * makes sure the word is greater than 1 letter, and then appends the last letter to the end of the word.
	 */
	private static String firstLetter(String s)
	{	
		if(s.length()>1)
		{
			String fLetter = s.substring(0, 1).toLowerCase();
			s = s.substring(1, s.length()) + fLetter;
		}
		
		return s;
	}
	
	/*
	 * Finds all of the indices of vowels(initialized to -1).  Places these in an array only if they are found.
	 * Finds the lowest index.  Replaces this vowel with vowel b vowel.
	 */
	private static String firstVowel(String s)
	{
		fV = -1;
		fVowel = null;
		int a = s.indexOf("a");
		int e = s.indexOf("e");
		int i = s.indexOf("i");
		int o = s.indexOf("o");
		int u = s.indexOf("u");
		
		int[] foundIndices = {a,e,i,o,u};
		int lowestIndex = Integer.MAX_VALUE;
		
		 for(int id = 0;id<foundIndices.length;id++) 
		 {
			 if(lowestIndex > foundIndices[id]) 
			 {
				 if(foundIndices[id] != -1)
				 {
					 lowestIndex = foundIndices[id];
				 }
			 }
		 }
		 
		 fV = lowestIndex;
		 fVowel = s.substring(lowestIndex, lowestIndex+1);
		
		if(fVowel != null)
		{
			String rString = fVowel + "b" + fVowel;
			String fString = new StringBuilder(s).replace(fV, fV+1, rString).toString();
			return fString;
		}
		else
		{
			return s;
		}
	}
	
	 /*
	  * Finds all of the indices of vowels(initialized to -1).  Places these in an array only if they are 
	  * found.  Finds the highest index.  Checks to see if the index of the last vowel that was appended 
	  * is on the same index.  If it's not it appends the last vowel, a b, and the last vowel.
	  */
	private static String lastVowel(String s)
	{
		lV = -1;
		lVowel = null;
		
		int a = s.lastIndexOf("a");
		int e = s.lastIndexOf("e");
		int i = s.lastIndexOf("i");
		int o = s.lastIndexOf("o");
		int u = s.lastIndexOf("u");
		
		int[] foundIndices = {a,e,i,o,u};
		int highestIndex = Integer.MIN_VALUE;
		
		 for(int id = 0;id<foundIndices.length;id++) 
		 {
			 if(highestIndex < foundIndices[id]) 
			 {
				 if(foundIndices[id] != -1)
				 {
					 highestIndex = foundIndices[id];
				 }
			 }
		 }
		 
		 lV = highestIndex;
		 lVowel = s.substring(highestIndex, highestIndex+1); 
		
		if(lVowel != null && (fV+2) != lV)
		{
			String rString = lVowel + "b" + lVowel;
			String fString = new StringBuilder(s).replace(lV, lV+1, rString).toString();
			return fString;
		}
		else
		{
			return s;
		}
	}

}
