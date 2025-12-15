package week3.day1;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("opening the incognito");
	}
	
	public void clearCache()
	{
		System.out.println("clearing the cache");

	}
	
	public static void main(String[]args) 
	{
		Browser obj1= new Browser();
		obj1.openURL();
		obj1.closeBrowser();
		obj1.navigateBack();
		System.out.println(obj1.browserName);
		System.out.println(obj1.browserVersion);
	}
}

