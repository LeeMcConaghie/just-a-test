package uk.ac.belfastmet.examples;

public class Bad {

	public boolean hasBad(String word) {
		boolean result = false;

		if(word.startsWith("bad")) {
			result = true;
		}
		String sub = word.substring(1);
		if(sub.startsWith("bad")) 
		{
			result = true;
		}
		String sub1 = word.substring(2);
		if(sub1.startsWith("bad")) 
		{
			result = false;
		}
		return result;
	}
}