/*1. Create a class called BankAccount, which has 3 methods.
      a) setDetails() method to set username, password, bankAccountNumber.
      b) updatePassword(String password) method to update password
      c) displayInfo() method will print username, password & bankAccountNumber

NOTE : consider bank account number as Integer [for example : 13164]
*/

package vaishu23;

public class Assignment3 {
	String Username;
	String Password;
	int AccountNo;
	int x=20;
	
	void setDetails(String UN, String PW,int AN) {
		Username=UN;
		Password=PW;
		AccountNo=AN;
		
	}
	void updatePassword(String newP) {
		Password=newP;
	}
	void displayInfo() {
		System.out.println("Username: " + Username);
		System.out.println("Password: " +Password);
		System.out.println("AccountNo: " +AccountNo);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 au= new Assignment3();
		au.setDetails("Vaishu", "hello123",25478);
		au.displayInfo();
		au.updatePassword("helloworld");
		au.displayInfo();
		

	}

}
