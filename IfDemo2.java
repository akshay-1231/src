package module3;
import java.util.Scanner;
public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   System.out.println("entre 2 number");
		   int num1=sc.nextInt();
		    int num2=sc.nextInt();
		  if(num1>num2)
	        {
	        	System.out.println("number1 is greater than number2");
	        	
	        }
		   else if(num1<num2)
		   {
				System.out.println("number2 is greater than number1"); 
			   
		   }else
			   
				System.out.println("number1 and number 2 are equal");
	}

}
