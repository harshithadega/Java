package testjava;

public class TestArray {

	public static void main(String[] args) {
		int x[]=new int[50];
		int y[]={10,12,13,14,15};
		for(int i=0;i<5;i++)
			x[i]=i+4;
	  for(int i=0;i<5;i++)
		  System.out.println(x[i]+" " +y[i]);	

	}

}
