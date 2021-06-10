package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private ArrayList<String> courses;
	private int tuitionBalance;
	private static int costOfCourse;
	private static int id=1000;
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		
		courses = new ArrayList<String>();
		tuitionBalance=0;
		costOfCourse=600;
		id++;
		
		System.out.println("Enter student's first name:");
		this.firstName = in.nextLine();
		System.out.println("Enter student's last name:");
		this.lastName = in.nextLine();
		System.out.println("Enter student's class/grade name:");
		this.gradeYear = in.nextInt();
		
		setStudentID();	
	}
	
	private void setStudentID() {
		this.studentID= gradeYear+""+id;
	}
	
	public void enroll() {
		Scanner in = new Scanner(System.in);
		String course;
		do {
			System.out.println("Enter the course name, Q to exit");
			course = in.nextLine();
			
			if(course.equals("Q"))
				break;
			
			courses.add(course);
			tuitionBalance += costOfCourse;
		} while (!course.equals("Q"));
		
		
		
		System.out.println("You hit Q");
		
	}
	
	public void showCourses() {
		for (String course : courses) {
			System.out.println(course);
		}
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public int getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(int tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}

	public static int getCostOfCourse() {
		return costOfCourse;
	}

	public static void setCostOfCourse(int costOfCourse) {
		Student.costOfCourse = costOfCourse;
	}
	
	public void payTuition(double amount) {
		tuitionBalance -= amount;
	}
	
	public String toString() {
		return firstName+" "+lastName+" "+gradeYear;
	}
	

	
	
	
	

}
