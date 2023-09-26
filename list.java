package javaprogram;

import java.util.Scanner;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ji=new Scanner(System.in);
		System.out.println("Name of the student:");
		String a=ji.nextLine();
		System.out.println("subjects:");
		System.out.println("Tamil");
		int T=ji.nextInt();
		System.out.println("English");
		int E=ji.nextInt();
		System.out.println("Maths");
		int M=ji.nextInt();
		System.out.println("Science");
		int S1=ji.nextInt();
		int S2=ji.nextInt();
		int S=S1+S2;
		System.out.println("social");
		int S3=ji.nextInt();
		int Total=T+E+M+S+S3;
		System.out.println("Total:" + Total);
		int percentage=Total/5;
		System.out.println("percentage:" + percentage+"%");
		
		

	}

}
