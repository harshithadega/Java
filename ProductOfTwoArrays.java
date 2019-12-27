package testjava;

public class ProductOfTwoArrays {

	public static void main(String[] args) {

		int x[][] =  new int[3][3];
		int z[][]= new int[3][3];
		for( int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				x[i][j]=i+j;
		int y[][]={{1,2,3},{3,4,5},{4,5,6}};
		for( int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		
		}
		System.out.println();
		for( int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(y[i][j]+" ");
			System.out.println();
		
		}
		System.out.println();
		
		for(int i=0;i<3;i++)

			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					z[i][j]+=x[i][k]*y[k][j];
				
	
		for( int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
		

	}

}
