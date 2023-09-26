package javaprogram;

import java.util.Scanner;

public class star {
	
	void meth() {
		
		Scanner sc=new Scanner(System.in);
		String d=sc.next();
		
		int len=d.length();
		
		char[] arr=new char[len];
		
		for(int i=0;i<len;i++) 
		{
			arr[i]=d.charAt(i);
			
		}
		
		for(char b:arr) {
		System.out.println(b);	
		}
		
	}
	public static void main(String [] args) {
//		for(int i=0;i>0;i++) {
//			
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
		
		star d=new star();
		d.meth();
	}

}
