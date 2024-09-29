package javaproject;

import java.util.Scanner; //check if peson is eligible for loan

public class Age {
	private int age;
	private double income;
	Scanner sc = new Scanner(System.in);

	void Accept() {
		System.out.println("enter age and income of person");
		age = sc.nextInt();
		income = sc.nextDouble();

	}

	void Check() {
		if (age >= 18 && age <= 60 && income > 25000)
			System.out.println("person is eligible for loan");
		else
			System.out.println("person is  not eligible for loan");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age = new Age();
		age.Accept();
		age.Check();

	}

}
