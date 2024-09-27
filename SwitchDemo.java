package module3;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
         System.out.println("entre numbers");
         int num=sc.nextInt();
         switch(num)
         {
         case 5 :
        	 System.out.println("movie time");
        	 break;
        	 
         case 6 :
        	 System.out.println("super saturday");
        	 break;
        	 
         case 7 :
        	 System.out.println("sleppy sunday"); 
        	 break;
         default :
        	 System.out.println("working day");
         
         
         }
	}

}
