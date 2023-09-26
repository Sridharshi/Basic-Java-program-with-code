package javaprogram;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=1; i<=20;i++) {
			if(i%2==1) {
				System.out.println(i);
				a+=i;
			}
			
		}
		System.out.println("total:" + a);
			
	}

}
