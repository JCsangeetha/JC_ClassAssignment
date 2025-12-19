package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlertInteractionWithText {

	public static void main(String[] args) throws InterruptedException {
		
	//Initialize ChromeDriver
	ChromeDriver driver =new ChromeDriver();
	
	// Maximize the browser window
	driver.manage().window().maximize();
	
	//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm)
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
	//Switch to the frame by directly passing the frame Id
	driver.switchTo().frame("iframeResult");
	
	//Add an implicit wait to ensure the webpage elements are fully loaded
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//locating the button and clicking
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	//Switch to the alert
	Alert al = driver.switchTo().alert();
	
	//Click OK/Cancel in the alert that appears
	/*al.accept();
	WebElement alertOk = driver.findElement(By.xpath("//p[@id='demo']"));
	String alertOkText = alertOk.getText();
	System.out.println(alertOkText);*/
	
	al.dismiss();
	WebElement alertCancel = driver.findElement(By.xpath("//p[@id='demo']"));
	String alertCancelText = alertCancel.getText();
	System.out.println(alertCancelText);
	
	// Use Conditional statements to verify the text based on the action performed.
	if(alertCancelText.equalsIgnoreCase("You pressed Cancel!"))
	{
		System.out.println("Verification : pass ->the right text is rendered upon clicking cancel button");
	}
	
	//close the browser
	driver.close();
	
	}

}
