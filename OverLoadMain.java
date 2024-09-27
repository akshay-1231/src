package Module5;

public class OverLoadMain {
	public void main() {
		System.out.println("main method without parameters");

	}

	public void main(int a, int b) {
		System.out.println("main method with 2 parameters");

	}

	public void main(int a) {
		System.out.println("main method with 1 parameters");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMain obj = new OverLoadMain();
		obj.main(); // 1
		obj.main(10, 20); // 2
		obj.main(45); // 3
	}

}
