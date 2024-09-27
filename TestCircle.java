package Module5;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               circle cir=new circle();
               circle cir2=new circle();
               circle cir3=new circle();
               cir.accept();
               cir.display();
               cir. calArea();
               cir.calperi();
               
             System.out.println( cir.hashCode());
             System.out.println( cir2.hashCode());
             System.out.println( cir3.hashCode()); 
               //compare the objects
             boolean result=cir.equals(cir2);
             System.out.println( result);
	}

}
