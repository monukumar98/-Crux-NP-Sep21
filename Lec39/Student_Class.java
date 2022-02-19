package Lec39;

public class Student_Class {
	int marsks;
	String name;

	public Student_Class() {
		// TODO Auto-generated constructor stub
	}

	Student_Class(int marks, String name) {
		this.marsks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " " + this.marsks;
	}

}
