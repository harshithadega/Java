package testjava;

public class ClassOneApplication extends ClassOne{

	public ClassOneApplication(int x, int y) {
		super(x, y);
	
	}

	public static void main(String[] args) {
		ClassOneApplication one = new ClassOneApplication(5,6);
		one.display();
		one.output();
	

	}

	@Override
	void output() {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		System.out.println("x+y : "+ (x+y));
	}

}
