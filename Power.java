package module3;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   System.out.println("entre  number");
		  int num=sc.nextInt();
		  if(num>0)
		  {
		int reminder=num%10;
		 int quotient=num/10;
		
		 System.out.println("power"+Math.pow(reminder, num));	 
		  }
		  
	}

}
