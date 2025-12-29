package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcWindowsHandling {

public static void main(String[] args) throws InterruptedException {
	
	//handling the browser notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
	//Initialize ChromeDriver
	ChromeDriver driver = new ChromeDriver(options);
	
	//Maximize the browser window
	driver.manage().window().maximize();
	
	//Add an implicit wait to ensure the webpage elements are fully loaded
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Load the URL (https://www.irctc.co.in/)
	driver.get("https://www.irctc.co.in/");
	
	Thread.sleep(3000);
	//handling alert for the popup appeared after the site launch(non modular alert so directly inspecting)
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	//click on the hamburger menu to access the menu
	driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
	
	//getting parent window id(flights page is parent)
	String parentWindowId = driver.getWindowHandle();
	System.out.println("The Parent WINDOW_ID is:"+parentWindowId);
	
	//click on the "FLIGHTS" link.
	WebElement flightsMenu = driver.findElement(By.xpath("//label[text()='FLIGHTS']"));
	flightsMenu.click();
	
//Capture the title of the new window that opens (flights window - AirTicket).
	//capturing the window id of both parent and child window
	Set<String> windowIds = driver.getWindowHandles();
	
	// creating a empty list and copy the window ids from Set
	List<String> copyWindowIds = new ArrayList<String>(windowIds);
	String childWindowId = copyWindowIds.get(1);
	System.out.println("The Child WINDOW_ID is:"+childWindowId);
	
	//Capture the title of the new window that opens (flights window - AirTicket).
	WebDriver switchToChild = driver.switchTo().window(childWindowId);
	System.out.println("The page title of the CHILD window is:"+switchToChild.getTitle());
	
	//Close the parent tab (Train ticket booking) alone
	driver.switchTo().window(copyWindowIds.get(0)).close();
	System.out.println("Closed only the PARENT tab");
}

}
