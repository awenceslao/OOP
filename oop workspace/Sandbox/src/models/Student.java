package models;

public class Student {
	//Create a Student class
	//Each student has a numeric ID, name and age in years
	//When the constructor of the student class is called,
	//   the id of that student should be automatically assigned by the class
	//   and the ID of that student should be permanent
	//The Student ID should start at 1 and automatically increment by 1
	
	private static int nextId = 1;
	private final int StudentID;
	private String name;
	private int age = 0;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getNextId() {
		return nextId;
	}

	public int getStudentID() {
		return StudentID;
	}

	public Student(String _name, int _age){
		name = _name;
		age = _age;
		StudentID = nextId;
		nextId++;
	}
	
	public static void main(String[] args) {

	}
	
	@Override
	public String toString(){
		StringBuilder sv = new StringBuilder();
		sv.append("Student ID: " + StudentID + "\n");
		sv.append("\t " + name + ", " + age);
		return sv.toString();
		
	}
	
	
}
