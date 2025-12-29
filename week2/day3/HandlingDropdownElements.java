package week2.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver(options);
		
		//Load the URL http://leaftaps.com/opentaps/
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(3000);
		
		//Click on the CRM/SFA link
		driver.findElement(By.xpath("//div[@id='button']")).click();
		
		Thread.sleep(3000);
	
		//Click on the Leads tab
		driver.findElement(By.xpath("(//div[@class='frameSectionHeader'])[2]")).click();
		System.out.println("Clicked on leads tab");
		
		//Click on the Create Lead link from shortcuts
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the mandatory fields on the web page.
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		//First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("David");
		//Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		//Select Employee in the source dropdown (using index)
		//locating the dropdown -'source' path
		WebElement sourceDropdown1= driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Create a object for Select class
		Select select1 = new Select(sourceDropdown1);
		
		//using selectByIndex method of Select class to select the dropdown option -Employee
		select1.selectByIndex(4);
		
		//Select Automobile in the Marketing Campaign (using visibleText)
		WebElement sourceDropdown2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2 = new Select(sourceDropdown2);
		select2.selectByVisibleText("Automobile");
		
		//Select Corporation in Ownership (using value)
		WebElement sourceDropdown3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select3 = new Select(sourceDropdown3);
		select3.selectByValue("OWN_CCORP");
		
		//Click on the Create Lead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Print the title of the current web page
		String title =driver.getTitle();
		System.out.println(title);
		
		//Close the browser window.
		driver.close();
}}
