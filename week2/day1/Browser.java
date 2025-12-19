package week2.day1;

public class Browser {
	
	public void launchBrowser(String browserName)
	{
		System.out.println("launch the "+browserName+" browser");
	}
			
	public String loadUrl() 
	{
		return "Url loaded successfully";

	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.launchBrowser("CHROME");
		System.out.println(br.loadUrl());
				
		
	}

}
