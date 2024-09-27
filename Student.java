package module1;

public class Student {
         private int rollNo;
         private String name;
         private double score;
         
         public void attendClass() {
        	System.out.println("attending the class");
        	 
         }
          public void apperExam() {
        	
        	  System.out.println("appearing the exam");  
         }
          public void competeAssignment() {
         	 
        	  System.out.println("competing the assignment");
          }
          
          public void display() {
         	System.out.println("rollNo="+rollNo);
         	
         	System.out.println("name="+name);  
        	  
         	System.out.println("score="+score); 
        	  
          }
          
         
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Student student =new Student();
            student.rollNo=1;
            student.name="Akshay";
            student.score=87.78;
            
            System.out.println("calling member fun");
            student.display();
            student.apperExam();
            student.competeAssignment();
            student.attendClass();
            
            System.out.println("======================");
            Student student2 =new Student();
            student2.rollNo=2;
            student2.name="Ajay";
            student2.score=88.78;
            
            System.out.println("calling member fun");
            student.display();
            student.apperExam();
            student.competeAssignment();
            student.attendClass();
            
            
            
            
            
	}

}
