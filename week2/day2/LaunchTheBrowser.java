package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
	
	public static void main(String[] args) throws InterruptedException
	{
		//Instantiate the browser driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url: https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Close the browser window.
		driver.close();
		

	}
}
