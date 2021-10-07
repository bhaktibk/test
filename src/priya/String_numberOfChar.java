/*Input : "BntSoftCom"
 * Letters 
 * b-> 1
 * n-> 1
 * t--> 2
 * s->
 * o->2
 * f->1
 * c-->1
 * m-->1
 * char ch =str.charAt(index)
 * str.indexOf('t')= 2
 * str.LastindexOf('t')=6
 * */

package priya;

public class String_numberOfChar {
	
	static void checkGivenCharisPresent(String input, char x ) {
		int count=0; 
		for (int i=0; i < input.length(); i++) {//0,1, 2, 3, 4 < 4
			//char ch= input.charAt(i);//x, t
			if(input.charAt(i)==x) {//t==t yes , e==t no, x== t no, t==t yes
				count++;//1  , 1, 1, 2
			}
		}
		System.out.println(x+ "----------->" +count);
	}
	public static void main(String[] args) {
		checkGivenCharisPresent("text", 't');
	}
}
