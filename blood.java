package javaprogram;

import java.util.Scanner;

public class blood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hp= new Scanner(System.in);
		int a=hp.nextInt();
		
		if(a>=20 && a<=50) {
			System.out.println(" eligible");
		}else {
			System.out.println("not eligible");
		}
	}

}
