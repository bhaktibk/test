package priya;

public class DataType {
	
	static byte b= 12;  // default 0 2asto 8 = 256 
	static short s; // default 0 :  2bytes :  
	static int i; // default 0
	static long l; //default : 0
	static float f; // default 0.0
	static double d; // default 0.0 
	static char c; // default ' '
	static boolean bb;  // default false 
	void m1() {
		int x;  //local variables  has be inilisized  before used 
		 
		
	}
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bb);
		
		DataType d1= new DataType();
		d1.m1();
		
	}

}
