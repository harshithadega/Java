package testjava;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=50;
		short s1=b;//implicit casting
		int c= 32000;
		short d = (short)c ;// explict casting
		int e = 34567;
		short g=(short)e;
		System.out.println(s1);
		System.out.println(d);
		System.out.println(g);

	}

}
