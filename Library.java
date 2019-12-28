package testjava;

public class Library  extends Student{

	protected int BooksDue;
	
	public Library(int regno, String stdname, String group,int BooksDue) {
		super(regno, stdname, group);
        this.BooksDue = BooksDue;
        
	}


}
