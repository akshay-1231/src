package module3;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("entre number");
        int num=sc.nextInt();
        
        if(num>0)
        {
        	System.out.println("number is positive");
        	
        }
        else if(num<0)
        {
        	System.out.println("number is negative");
        }
        else
        	System.out.println("number is zero");
        
	}

}
