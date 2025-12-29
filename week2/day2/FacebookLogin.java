package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
public static void main(String[] args) throws InterruptedException {
	
		//Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//apply implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		//Enter the email id as testleaf.2023@gmail.com
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter the password as Tuna@321
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		Thread.sleep(5000);
		
		//Click on the Login button.
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		//Print the title of the current web page.
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
