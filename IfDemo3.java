package module3;

import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("entre three numbers");
		   int num1=sc.nextInt();
		   int num2=sc.nextInt();
		   int num3=sc.nextInt();
		   if((num1>num2)&&(num1>num3))
				   {
			         System.out.println("num1 is greatest among three");
				   }else if((num2>num1)&&(num2>num3))
				   {
					   System.out.println("num2 is greatest among three");
				   }else
					   System.out.println("num3 is greatest among three");
		   
	}

}
