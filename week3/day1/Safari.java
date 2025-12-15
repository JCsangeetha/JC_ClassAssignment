package week3.day1;

public class Safari extends Edge {

	public void readerMode() 
	{
		System.out.println("In reading mode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("In full screen mode");
	}



	public static void main(String[] args) 
	{
		//creating a object for Safari class to access its methods
		Safari sa= new Safari();
		sa.readerMode();
		sa.fullScreenMode();
		
		/*since edge has extended chrome and chrome already extended Browser .
		In Edge class we can able able to access all the methods of Chrome, Browser as
		well as the Edge .so creating an object for Edge class is enough to access all the methods
		of Browser, Chrome and Edge class*/
		
		Edge ed= new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.openURL();
		ed.clearCache();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		ed.openIncognito();
		ed.clearCache();
	}
	
}
	
