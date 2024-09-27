package module3;
import java.util.Scanner;
public class IfDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("entre  number");
         int num=sc.nextInt();
        // int num2=sc.nextInt();
        // int num3=sc.nextInt();
         if(num>=0&&num<=9)
         {
        	 System.out.println("num is one digit number");
        	 
         }else if(num>=10 && num<=99)
         {
         	 System.out.println("num is two digit number");
         }else if(num>=100&&num<=999)
         {
          	 System.out.println("num is three digit number"); 
         }else
          	 System.out.println("num is four digit number");
	}

}
