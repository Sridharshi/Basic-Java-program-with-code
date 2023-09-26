package javaprogram1;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++) 
		{
			for(int j=(3-i);j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
	    }
	}

}
