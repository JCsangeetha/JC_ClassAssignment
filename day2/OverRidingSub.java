package week3.day2;

//Inherting the superclass in this subclass

public class OverRidingSub extends OverRidingSuper{
	
	// overriding the methods of superclass in this subclass and executing with different print statements
	@Override
	public void get() {
		System.out.println("sub class url");

	}
	
	@Override
	public void userName() {
		System.out.println("sub class username");

	}
	
	@Override
	public void password() {
		System.out.println("sub class password");

	}
	
	@Override
	public void loginBtn() {
		System.out.println("sub class loginbtn");

	}
	
	public static void main(String[]args) 
	{
		// after extending the super class , creating the object of this class to execute all the methods
		
		OverRidingSub ovSub= new OverRidingSub();
		ovSub.get();
		ovSub.userName();
		ovSub.password();
		ovSub.loginBtn();
	}   
}
