package Module5;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=100;
        int b=100;
        if(a==b)
        	System.out.println("same");
        String str1="akshay";
        String str2="akshay";
        if(str1==str2)
        	System.out.println("same");
        else
        	System.out.println("not same");
        System.out.println("================");
       String str3=new String("akshay");
       String str4=new String("AKSHAY");
        if(str3==str4)
        	System.out.println(" same");
        else
        	System.out.println("not same");
        System.out.println("================");
        if(str3.equalsIgnoreCase(str4))
        	System.out.println(" same");
        else
        	System.out.println("not same");
	}

}
