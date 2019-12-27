package testjava;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		sb1.append("harshi");
		System.out.println(sb1);
		sb1.append("tha");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.delete(4,6));
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		String str = " dega";
		StringBuffer sb2 = new StringBuffer();
		sb2.append(str);
		System.out.println(sb2);
		String str2= sb2.toString();
		System.out.println(str2);
		StringBuilder builder = new StringBuilder();
		builder.append("hello");
		System.out.println(builder);
		
		
		
		

	}

}
