package javaprogram;

public class example {
	int func() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
		return a;
			
	}
	public static void main(String [] args) {
		example u=new example();
		u.func();
		System.out.println(u.func());
		
	}

}
