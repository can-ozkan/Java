package EmailAdministration;

import java.util.Iterator;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength;
	private String email;
	private String companySuffix="company.com";
	
	//Constructor
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.defaultPasswordLength = 10;
		this.mailboxCapacity=500;
		
		System.out.println(this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department is " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println(password);
		
		//Generating email
		this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
		System.out.println(email);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDepartment() {
		return department;
	}
	
	private String setDepartment() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Department Codes");
		System.out.println("0 - None");
		System.out.println("1 - Sales");
		System.out.println("2 - Development");
		System.out.println("3 - Accounting");
		System.out.print("Enter Department Code: ");
		
		int depChoice = in.nextInt();
		
		if(depChoice == 1)
			return "Sales";
		else if(depChoice == 2)
			return "Development";
		else if(depChoice == 3)
			return "Accounting";
		else
			return "";
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for (int i = 0; i <length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
				
		return new String(password);
	}
	
	public String toString() {
		return firstName+" "+lastName+" "+department;
	}
	
	

}
