package uk.ac.belfastmet.examples;
/**...
 * 
 * @author MCC19171860
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 * 
 * icyHot(120, -1) ? true
 * icyHot(-1, 120) ? true
 * icyHot(2, 120) ? true
 *
 */
public class Temperature {

	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		boolean outcome = temperature.icyHot(120,  -1);//-> true
		boolean outcome1 = temperature.icyHot(-1, 120);//-> true
		boolean outcome2 = temperature.icyHot(2,  120);//-> false

		if(outcome == true && outcome1 == true && outcome2 == false) {
			System.out.println("It worked");
		}
	}



	public boolean icyHot(int tempA, int tempB) {
		boolean result = false;

		if((tempA < 0 && tempB > 100) || (tempA > 100 && tempB <0)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}

