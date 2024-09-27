package Module5;

class Myclass2 {
	public void fun2() {
		System.out.println("this is fun2");
	}
}

class Myclass1 {
	public void fun1() {
		System.out.println("this is fun1");
	}
}

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass1 myclass1 = new Myclass1();
		myclass1.fun1();
		Myclass2 myclass2 = new Myclass2();
		myclass2.fun2();
	}

}
