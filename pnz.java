package javaprogram;

import java.util.Scanner;

public class pnz {
	public static void main(String [] args)
	{
		Scanner hh= new Scanner(System.in);
		int a=hh.nextInt();
		
		if(a<0) {
			System.out.println("negative");
		}else if(a>0){
			System.out.println("positive");
		}else {
			System.out.println("zero");
		}
	}

}
