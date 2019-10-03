package uk.ac.belfastmet.examples;


public class Brackets {
	/**...**
	 * Determine if opening and closing brackets balance in a String
	 * @param bracket
	 */

	public static void main(String[] args) {
		String brackets1 = "[()]";
		String brackets2 = "{[]}";
		String brackets3 = "[]{}()";
		String brackets4 = "[)[)";
		String brackets5 = "()]()";

		String result1 = balancedBrackets(brackets1);
		String result2 = balancedBrackets(brackets2);
		String result3 = balancedBrackets(brackets3);
		String result4 = balancedBrackets(brackets4);
		String result5 = balancedBrackets(brackets5);

		System.out.println("Results:" + result1);
		System.out.println("Results:" + result2);
		System.out.println("Results:" + result3);
		System.out.println("Results:" + result4);
		System.out.println("Results:" + result5);
	}

	public static String balancedBrackets(String bracket) {
		/**
		 * initialising counter variables for opening and closing brackets
		 */
		int openBracket = 0;
		int closedBracket = 0;
		int openCurly = 0;
		int closedCurly = 0;
		int openSquare = 0;
		int closedSquare = 0;

		/**
		 * Modulus for identification of even number
		 */
		if (bracket.length() % 2 == 0) {
			/**
			 * Use for loop to count occurrences of each type of bracket
			 */
			for (int index = 0; index < bracket.length(); index++) {
				if (bracket.charAt(index) == '(') {
					openBracket++;
				}
				if (bracket.charAt(index) == '{') {
					openCurly++;
				}
				if (bracket.charAt(index) == '[') {
					openSquare++;
				}
				if (bracket.charAt(index) == ')') {
					closedBracket++;
				}
				if (bracket.charAt(index) == '}') {
					closedCurly++;
				}
				if (bracket.charAt(index) == ']') {
					closedSquare++;
				}

				if (openBracket == closedBracket && openCurly == closedCurly && openSquare == closedSquare) {
					return "Balanced";
				}
			} //end for
		} //end if
		
		/**
		 * return not balanced if not even or if opening count of bracket type not equal to closing count
		 */
		return "Not Balanced";
	}

}
