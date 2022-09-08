
/* Question - To camparing object values using equals method*/


package com.equals.demo;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student("lokesh", 04, "10th", "B", "Good");
		Student stu2 = new Student("Rakesh", 02, "11th", "C", "Bad");
		Student stu3 = new Student("Abishek", 05, "11th", "A", "Average");
		Student stu4 = new Student("Nithish", 06, "10th", "B", "Good");
		
		System.out.println(stu1.equals(stu4));
		System.out.println(stu3.equals(stu2));
		System.out.println(stu2.equals(stu1));
		System.out.println(stu1.equals(stu3));
	}

}
