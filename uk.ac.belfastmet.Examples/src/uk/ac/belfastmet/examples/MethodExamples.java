package uk.ac.belfastmet.examples;

public class MethodExamples {

	public static void main(String[] args) {
	
		MethodExamples methodExamples = new MethodExamples();

		int outcome = methodExamples.returnSomething();
		System.out.println("Outcome is " + outcome); 
		}
			
	public int returnSomething() {
			int result = 42;

			return result;
		}
		
}

