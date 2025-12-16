package week3.day2;

public class OverRidingSuper {

	public void get() 
	{
		System.out.println("Hit the URL in the browser");
	}
	
	public void userName() 
	{
		System.out.println("Provide the valid username");

	}
	
	public void password() 
	{
		System.out.println("Provide the valid password");

	}
	
	public void loginBtn()
	{
		System.out.println("Click on the login button");

	}
	
	public static void main(String[] args) 
	{
		OverRidingSuper ovs= new OverRidingSuper();
		//executing the methods of the same class
		ovs.get();
		ovs.userName();
		ovs.password();
		ovs.loginBtn();
	}
}
