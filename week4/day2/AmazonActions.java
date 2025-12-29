package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

public static void main(String[] args) throws InterruptedException, IOException {
		
	//Initialize ChromeDriver
	ChromeDriver driver = new ChromeDriver();
			
	//Maximize the browser window
	driver.manage().window().maximize();
			
	//Add an implicit wait to ensure the webpage elements are fully loaded
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	// Load the URL (https://www.amazon.in/)
	driver.get("https://www.amazon.in/");
		
	Thread.sleep(3000);
	
	//Scroll down to the "Conditions of Use and Sale" section at the bottom of the page using Actions class
	WebElement source = driver.findElement(By.partialLinkText("Conditions"));
		
	//Get the text of "Conditions of Use and Sale" and print it in the console.
	System.out.println(source.getText());

	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
	act.scrollToElement(source).perform();
		
	//Finally, take a screenshot of the displayed webpage.
	File screenshot = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./Screenshots/amazon1.png");
	FileUtils.copyFile(screenshot, target);
	}

}
