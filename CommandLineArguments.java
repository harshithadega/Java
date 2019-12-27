package testjava;

public class CommandLineArguments {

	public static void main(String[] args) {
		String name = args[0];
		System.out.println(name);
		for(int i=0;i<name.length();i++)
			System.out.println(name.charAt(i));
		System.out.println();
			
   String atr = args[1];
   StringBuffer buf = new StringBuffer();
   for(int i=0;i<atr.length();i++)
   {
	   buf.append(atr.charAt(i));
	   System.out.println(buf);
   }
   System.out.println();
	}
	
	
	
}
