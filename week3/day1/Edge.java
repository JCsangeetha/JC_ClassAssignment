package week3.day1;

public class Edge extends Chrome {
	
	public void takeSnap()
	{
		System.out.println("taking a snap");
	}
	
	public void clearCookies()
	{
		System.out.println("cleaing the cookies");

	}
	
	public static void main(String[]args) 
	{
		Chrome ch = new Chrome();
		Edge ed= new Edge();
		ch.openIncognito();
		ch.clearCache();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		ed.takeSnap();
		ed.clearCookies();
	}
}
