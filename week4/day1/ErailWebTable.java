package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

public static void main(String[] args) {
	
	//Initialize ChromeDriver
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the browser window
	driver.manage().window().maximize();
	
	//Add an implicit wait to ensure the webpage elements are fully loaded
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Load the URL (https://erail.in/)
	driver.get("https://erail.in/");
	
	//Enter "MAS" as the "From" station.
	driver.findElement(By.id("txtStationFrom")).clear();//clearing the prefilled value in 'From' text field
	driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
	
	//Enter "MDU" as the "To" station.
	driver.findElement(By.id("txtStationTo")).clear();//clearing the prefilled value in 'To' text field
	driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
	
	//Uncheck the "Sort on Date" checkbox
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	//Retrieve the train names from the web table
	List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'stickyTrainListHeader')]//tr//td[2]"));
	System.out.println("The no of trains listed is:"+trainNames.size());
	
	//Verify if there are any duplicate train names in the web table
	List<String> trainNamesList = new ArrayList<String>();
	for(WebElement a : trainNames) 
	{
		trainNamesList.add(a.getText());
	}
	//copying all the elements from the 'trainNamesList' list
	Set<String> trainNamesFinal = new HashSet<String>(trainNamesList);
	
	if(trainNamesList.size()==(trainNamesFinal.size())) 
	{
		System.out.println("Verification:PASSED No duplicate train names found");
	}
	else 
	{
		System.out.println("Verification:FAILED duplicate train names found");

	}
	
	
	

	}

}
