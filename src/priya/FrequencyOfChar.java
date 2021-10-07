/*input="vaishavi", v
 * lenght = 1 to 8 
 * index= 0-7
 * char ch =input.charAt(i);
 * 
 * 
 *input = "welcome to my show"
w--> 2
e--> 2
l-> 1
c-->1

*
*
*/

package priya;

import java.net.StandardSocketOptions;

public class FrequencyOfChar {
	// w provided how many has occurency 
	void togetFrequency(String input, char ch) {
		
		int count=0;
		int i;
		for (i=0; i< input.length(); i++) {
			if (input.charAt(i)==ch) {//boolean 
				count++;
			}	
		}
		System.out.println(ch+"-->"+count);
	}
	
	void togetFrequencyFromString (String input) {
		//"welcome to my show"
		for (int i=0; i< input.length(); i++) {
			char ch= input.charAt(i);//
			if(input.indexOf(ch)==i)
				togetFrequency(input, ch);
		}
	}
	
	void sum(int x, int y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		String input = "welweel";
		FrequencyOfChar f= new FrequencyOfChar();
		f.togetFrequencyFromString(input);
		f.sum(30, 40);
		String s= "swapnil";
		char a='w';
		f.togetFrequency(s, a);
				
	}
	

}
