// int  num= 20,30,40,55,60;   is it 
//devisable by both  5 and 3

package vaishu23;

public class Assig2 {

	static void findDivisible(int[] input) {
		for(int i=0; i<input.length; i++) {
			if (input[i]%3==0 && input[i]%5==0)
				System.out.println(input[i] + " is divisible " );
			else {
				System.out.println(input[i] + " not divisible ");
				
			}
		}
	}
	 static void findArrayDivisible(int[] input) {
		 for(int i=0; i<input.length; i++) {
			// int num=input[i];
			// findDivisible(input[i]);
		 }
	 }
	
	
	public static void main(String args[])
	{
		int[] numbers= {10,3,5,15,20,15};
		int input=20;
		findDivisible(numbers);
		//findArrayDivisible(numbers);
	}
}
