package testjava;

public class CheckForPalindrome {

	public static void main(String[] args) {
	String s = args[0];
	 StringBuffer s1 =  new StringBuffer();
	 StringBuffer s2 =  new StringBuffer();
	s1.append(s);
	s2=s1.reverse();
	String a=s2.toString();
	int p = a.compareTo(s);
	if(p==0)
	 System.out.println("palimdrome");
	else
	System.out.println("not palimdrome");
}
}
