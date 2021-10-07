package priya;

class Variables{
	int y=1;	//instance variable 
	void m1(){
		int x=10;
		int y=30 ;		//we can create local variable same lik einstance variable
		y=y+30;
		System.out.println(y);
	}
	void m2(){
		y =y+10;
		System.out.println(y);
	}
	public static void main (String[] hggh){
		Variables a= new Variables();// new object get created  
		a.m1();//30
		a.m2();//11
		System.out.println("---------");
		Variables a1= new Variables();
		a1.m1();// 30
		a1.m2();// 11
		a1.m2();//21
		a1.m1(); //30
	
		}
}