package javaproject;

import java.util.Scanner;

public class voter {
	private int age;
	private boolean Citizen;
	Scanner sc = new Scanner(System.in);

	void Accept() {
        System.out.println("Enter age:");
        age = sc.nextInt(); // Asking for age first
        
        System.out.println("Enter citizenship (type 'India' for Indian citizenship):");
        String checkCitizen = sc.next(); // Asking for citizenship after age
        Citizen = checkCitizen.equalsIgnoreCase("India"); // Makes it case-insensitive
    }

	

	void Check() {
		if (Citizen && age >= 18)
			System.out.println("you are eligible");
		else
			System.out.println("not eligible");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voter voter1 = new voter();
		voter1.Accept();
		voter1.Check();

	}

}
/*System.out.println("Enter citizenship..."); prompts the user to enter their citizenship.
String checkCitizen = sc.next(); reads the next input from the user as a string and assigns it to the variable checkCitizen.
citizen = checkCitizen.equalsIgnoreCase("India"); checks if the user’s input matches "India" (ignoring case) and assigns the result to the citizen variable. If the input is "India", citizen becomes true; otherwise, it becomes false.
*/