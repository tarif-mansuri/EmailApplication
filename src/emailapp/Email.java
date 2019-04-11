package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;

	// Constructore to setup firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created for " + firstName + " " + lastName);

		// set the department
		this.department = setDepartment();
		System.out.println("Department: "+department);
		this.password = randomPassworh(8);
		System.out.println("Password: "+password);
	}

	private String randomPassworh(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijflmnopqrstuvwxyz1234567890!@#$%^&*()";
		int setLength = passwordSet.length();
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int randomNumber = (int) (Math.random() * setLength);
			password[i] =passwordSet.charAt(randomNumber);
		}
		return new String(password);
	}

	private String setDepartment() {
		System.out.println("Enter the department\n1 For sales\n2 For developement\n3 For Accounting\n0 For none");
		Scanner sc = new Scanner(System.in);
		int dptChoice = sc.nextInt();
		if (dptChoice == 1) {
			return "Sales";
		} else if (dptChoice == 2) {
			return "Dev";
		} else if (dptChoice == 3) {
			return "Acc";
		} else {
			return "";
		}
	}

}
