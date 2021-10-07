package priya;

public class PrimeNumber {
	void toFindPrimeNumber(int num) {
		boolean flag=false;
		for (int i=2; i< num; i++) {
			if(num%i==0) {
				flag= true;
				break;
			}
		}
		if (flag==false)
			System.out.println("  prime");
		else
			System.out.println("Not prime numner");
		
	}
	
	public static void main(String[] args) {
		int num=15;
		PrimeNumber primeNumber= new PrimeNumber();
		primeNumber.toFindPrimeNumber(num);
	}

}
