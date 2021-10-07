package priya;

public class even {

	 void tofindnumiseven(int num) {
		
		if(num%2==0)
			System.out.println("even number "+num);
		else
			System.out.println("odd number: "+num);
	}
	public static void main(String[] args) {
		even e= new even();
		e.tofindnumiseven(5);
		e.tofindnumiseven(10);
		String str= "  Good  monring         all alllets           statr class at 5 pm";
		System.out.println(str.replaceAll("\\s+", " "));
	}
}
