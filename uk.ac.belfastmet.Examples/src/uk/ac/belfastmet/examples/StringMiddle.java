package uk.ac.belfastmet.examples;

public class StringMiddle {
	//StringMiddle stringMiddle = new StringMiddle();
	
	public String middletwo(String code) {
		String result;
		int length = code.length();//get length of string (word) and assign to an int variable (length)
		int halfway = length/2;//divide length variable by 2 to get halfway and assign to int variable (halfway)
		
		// take 1 away from halfway to get correct index (halfway = 3 but we need index of 2 to get 3rd char), assign to result
		result = code.charAt(halfway -1) + "";
		result = result + code.charAt(halfway) + "";// do same as above but don't minus 1 to get 4th char (index 3)
		return result;// return result
	}
}
