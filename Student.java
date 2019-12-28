package testjava;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	public Student(int regno, String stdname, String group) 
	{
		this.regno = regno;
		this.stdname = stdname;
		this.group = group;
	}
	
	public Student() {
	}

	public void display()
	{
		
		System.out.println( "regno : " +regno);
		System.out.println("student name : "+ stdname);
	    System.out.println("group :" + group);
		System.out.println("THIS IS FROM SUPERCLASS");
	}
	
}
