package uk.ac.belfastmet.examples;
/**...*?
 * 
 * @author MCC19171860
 *Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 */
public class Color {

	public String seeColor(String word) {
		String outcome = "";
		
		if(word.startsWith("red")) {
			 outcome = "red";
		}
		else if(word.startsWith("blue")) {
			 outcome = "blue";
		}
		else {
			outcome = "";
		}
		return outcome;
	} 
}
