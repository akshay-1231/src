package Module5;
import java.util.Scanner;
public class circle {
               private double area1;
               private double radius;
               private double peri;
             final  double PI=3.14; 
            // Scanner sc=new Scanner (System.in);
          
             public void  accept() {
            	    Scanner sc=new Scanner (System.in);
            	 System.out.println("entre radius"); 
            	 radius=sc.nextDouble();
             }
                   
             
             public void display() {
            	 System.out.println(" radius="+radius); 
            	 System.out.println("perimeter="+peri); 
            	 System.out.println("area="+area1); 
             }
             public void calArea() {
            	 area1 =3.14*PI*radius;
            	 
            	// System.out.println("entre"); 
            	 
             }
             public void calperi() {
            	 peri=2*PI*radius;
             }
             
}
