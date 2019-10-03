package uk.ac.belfastmet.examples;



public class BalancedBrackets {
	public static void main(String[] args) {


		int openCurly = 0;
		int closedCurly = 0;
		int openSquare = 0;
		int closedSquare = 0;
		int openParenthesis = 0;
		int closedParenthesis = 0;


		for(int index = 0; index<str.length();index++) {
			if(str.charAt(index) =='{') 
			{
				openCurly++;
			}
			for(int index = 0; index<str.length();index++) {
				if(str.charAt(index) =='{') 
		
					closedCurly++;
			}
				for(int index = 0; index<str.length();index++) {
					if(str.charAt(index) =='{') {
						openSquare++;
			}
				for(int index = 0; index<str.length();index++) {
						if(str.charAt(index) =='{') {
						closedSquare++;	
			}
				for(int index = 0; index<str.length();index++) {
						if(str.charAt(index) =='{') {
								openParenthesis++;
			}
				for(int index = 0; index<str.length();index++) {
						if(str.charAt(index) =='{') {
								closedParenthesis++;
			
						   = false;
						}			
				}
						
				
	
						



			/**.
			 * Input exp = "[()]"
			 * Output Balanced
			 * 
			 * Input: exp "{[]}" 
			 * Output Balanced
			 * 
			 *  Input exp = "[] {} ()"
			 *  Output Balanced
			 *  
			 *  Input: exp "[)[)""
			 *  Output Not Balanced
			 *  
			 *   Input: exp = "()]()"
			 *   Output Not balanced
			 * 
			 * 
			 * BalancedBrackets.**/

			/**.
			 * Ok so what's the logic? How to measure if they are balanced? try an if statement? I need the string length, i need to see if the string 
			 * is odd if so it is not even. If even I need to split the string - where? I need to compare these strings if so do they balance?
			 * 
			 * 
			 * 
			 * ..**/




