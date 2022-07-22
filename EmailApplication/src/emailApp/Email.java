package emailApp;

import java.util.Scanner;

public class Email {

	//We will encapsulate them by using private
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=8;
	private String companySuffix="eyycompany.com";
	private String alternateEmail;
	
	//constructor to recieve the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
		//System.out.println("New Worker: "+this.firstName+" "+this.lastName);
		
		//called a method by asking for the department
		this.department= setDepartment();
		System.out.println("Your Department is: "+this.department);
		
		//call a method for password generation
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: "+this.password);
		
		//combine elements to generate email
		email=firstName.toLowerCase()+ "." +lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println(email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("New Worker :"+firstName+ "\nDEPARTMENT CODES:-\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n ENTER THE DEPT CODES:");
		Scanner sc = new Scanner(System.in);
		int deptChoice =sc.nextInt();
		
		if(deptChoice==1) {return "sales";}
		else if (deptChoice==2) { return "dev";}
		else if (deptChoice==3) {return "acc";}
		else {return "";}
		
	}
	//Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int random =(int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	
	public void setMailBoxCapacity(int Capacity) {
		this.mailboxCapacity= Capacity;
	}
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() 
	{
		return mailboxCapacity;
	}
	public String getAlternatEmail() 
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " +firstName+ lastName+
				"\nCOMPANY EMAIL: " +email+
				"\nMAILBOX CAPACITY: "+mailboxCapacity+ "mb";
				
	}
}
