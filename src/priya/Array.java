package priya;

import java.util.Arrays;

public class Array {
	
	String reverWord(String w1) {
		
		String r1="";
		for(int index=w1.length()-1; index>=0; index--) {
			r1=r1+w1.charAt(index);
		}
		return r1;
	}
	void reverElemntOfArray() {
		String[] test= {"Bhakti","Mohit", "Priya" , "Vaishanvi"};
		System.out.println(Arrays.toString(test));
		for (int index=0; index< test.length;index++) {
			test[index]=reverWord(test[index]);
		}
		System.out.println(Arrays.toString(test));
		String[] output=new String[test.length];
		int x=0;
		for (int index=test.length-1; index>=0; index--) {
			output[x]=test[index];
			x++;
		}	
		System.out.println(Arrays.toString(output));
		
		
	}
	
	
    
    public static void main(String[] hjhj) {
    	Array array= new Array();
    	array.reverElemntOfArray();
    }
}


///  class name should scan casing e. ArrayTest Calsaa A 

// menthod name , variables=  camel casing ReverAarryTObeProvided (), countArray