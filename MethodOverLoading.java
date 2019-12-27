package testjava;

public class MethodOverLoading {
	void add(int x,int y)
	{
		System.out.println("int "+(x+y));
		
	}
	void add(double x,double y)
	{
		System.out.println("double "+(x+y));
		
	}
	void add(String x,String y)
	{
		System.out.println("String "+(x+y));
		
	}
	 public static void main(String args[])
	 {
		 MethodOverLoading method =  new MethodOverLoading();
		 method.add(2,4);
		 method.add(56.78,45.6);
		 method.add("har","shu");
	 }

}
