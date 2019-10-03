package uk.ac.belfastmet.examples;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String [] args) {
		ArrayExamples arrayExamples = new ArrayExamples();
		arrayExamples.addStringToArrayList();
		}
	public void addStringToArrayList() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning)";
		System.out.println("Size of Array:" + listOfStuff.size()););
		foir (int index = 0; index < listOfStuff(); index++) {
			String indexValue = listOfStuff.get(index);
			System.out.println("Value of String:" + indexValue);
		}
		
	}

}
