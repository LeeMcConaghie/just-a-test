package uk.ac.belfastmet.examples;
/**...
 * 
 * @author MCC19171860
 *Count the number of"xx" in the given string. XX is 2
 *
 *countXX("abcxx" > 5
 *countXX("XXX") > 3
 *countXX("XXXX") > 4
 */
public class Xx {
/**...
 * word into method int out. A variable like a method needs 3 things - type, name and a value.
 *
 * @param str
 * @return
 */
	public int countXX(String word) {
		int num1 = 0;
		num1 = word.length();	
		return num1;
		

		
	}
	
	public static void main(String[] args) {		
		Xx xx = new Xx();// here I call the class and create an instance of the class. 
		xx.countXX("abcxx");//calling the countXX method from the xx instance of the class.
		System.out.println(xx.countXX("abcxx"));
		int number = xx.countXX("a");
		System.out.println(number);
		xx.oneToTen();
	}

	public void oneToTen() {
		int num = 1;
		
		System.out.println(num);
		
	
	}
	
	
}
