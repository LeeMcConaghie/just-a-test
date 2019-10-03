package uk.ac.belfastmet.examples;




public class Student {
	/****
	 * student class with two variables Name and age - String and int
	 */

	private String name;
	private int age;
	

public static int numberOfStudents; 

	// default constructor
/**
 * 
 * @param name
 * @param age
 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		numberOfStudents++;
	}
	
	
	//getName method
	
	public String getName() {
	
		return name;
}

	public int getAge() {
	
		return age;
	
	
}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

}

