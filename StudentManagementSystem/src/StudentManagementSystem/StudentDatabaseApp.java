package StudentManagementSystem;

import java.util.Iterator;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.enroll();
		student1.showCourses();
		System.out.println(student1.getTuitionBalance());
		System.out.println(student1.getCostOfCourse());
		
		student1.payTuition(500.0);
		System.out.println(student1.getTuitionBalance());
		
		Student[] students = new Student[10];
		for(int i=0; i<students.length; i++) {
			//do something
			students[i].toString();
		}

	}

}
