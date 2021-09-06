package priya;

public class StringTest {
	
	void fullname (String fn, String Ln) {
		 String fullName="";
		 fullName= fn +" --> "+ Ln;
		 System.out.println(fullName);
		 
		 
	}
	
	void duplicateReverse () {
		String input= "Priya";
		String output="";
				
		int ln= input.length();
		for (int index = ln-1; index  >=0 ; index-- ) {
			output=output+ input.charAt(index);
			System.out.println(output);
		}
		System.out.println("------------");
		System.out.println(output);
		
	}
		
	// entry point 
	public static void main (String [] hh) {
		String input= "test";
		StringTest test=new StringTest();
		test.fullname("Priya", "Sontakke");
		test.fullname("Bhakti", "Kakade");
		test.fullname("Vaishanvi", "Dhole");
		
	}
}


///  srt.lenght();    int 
//   srt.CharAT(index)    char
// srt.

////1)    Revers string 
//  input String srt1= "priya" 
//	output = ayirp
////	2) Str 1, str 2,==>    string 3 
//  input = StringFristName = "Bhakti"
//		  String lastName= "Kakade"
//		  
//		  full nam =>  "Bhakti kakade"
//	
//
//
