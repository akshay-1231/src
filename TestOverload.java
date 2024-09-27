package Module5;

public class TestOverload {
	
	static public void main() {
		System.out.println("main method without parameters");

	}

	static public void  main(int a, int b) {
		System.out.println("main method with 2 parameters");

	}

	static public void  main(int a) {
		System.out.println("main method with 1 parameters");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 main(10);
		main(12,34);
		 TestOverload.main();
	}

}
