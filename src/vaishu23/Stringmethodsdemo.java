package vaishu23;
public class Stringmethodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length method
		String str1 = "Hello this is my first program"; 
		String str2 = "abc";
		
		
		//System.out.println(str.length);
		System.out.println(str1.length()); 
		
		//charAt method
		System.out.println(str1.charAt(6));				
		
		//concat method
		System.out.println(str1.concat(str2));
		
		//contain method
		System.out.println(str1.contains(" "));
		
		//starts with method
		System.out.println(str1.startsWith("ABC"));
		
		//ends with
		System.out.println(str1.endsWith("program"));
		
		//equals method
		System.out.println(str1.equals(str2));
		
		//indexof method
		System.out.println(str1.indexOf('z'));
	
		String str3 = "";
		//is empty method
		System.out.println(str3.isEmpty());
		
		//replace()
		String str4 = "Priya";
		System.out.println(str4.replace('i','a'));
		System.out.println(str4.replace("Priya","Vaishnavi"));
		
		//substring method
		String str5 = "0123456789";
		System.out.println(str5.substring(5));
		System.out.println(str5.substring(5, 8));
		// hello this is my first program
		  //012345678901234567890123456789
		//begin index= index include end index= exclude
		
		//toCharArray()
		//String str1 = "Hello this is my first program"; 
		char[] charArray = str1.toCharArray();
		System.out.println(charArray);// o/p: Hello this is my first program
		
		for(int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		//lowercase method
		String str6 = "PRIYA";
		String str7 = "vaiShNavI123";
		System.out.println(str6.toLowerCase());
		System.out.println(str7.toLowerCase());
		
		//uppercasse
		System.out.println(str7.toUpperCase());
		
		//trim method
		String str8 = "    Hi Priya && Vaishnavi   ";
		System.out.println(str8.trim());//leading and trailing space will trimout.
	
	}

}