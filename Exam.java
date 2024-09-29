package javaproject;
import java.util.Scanner;

public class Exam {
       private int s1,s2,s3;
       private double avg;
       Scanner sc=new Scanner(System.in);
       
       void Accept()
       {
    	   System.out.println("entre three subjects marks");
    	   s1=sc.nextInt();
    	   s2=sc.nextInt();
    	   s3=sc.nextInt();
    	   avg=(s1+s2+s3)/3;
    	   
       }
       void Check()
       {
    	   if(avg>=60&&s1>=40&&s2>=40&&s3>=40) 
    		   System.out.println("student is passed");
    	   else
    		   System.out.println("student is failed");
    	     
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Exam exam=new Exam();
             exam.Accept();
             exam.Check();
             
	}

}
