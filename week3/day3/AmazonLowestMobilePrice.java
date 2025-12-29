package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AmazonLowestMobilePrice {

	public static void main(String[] args)  {
	
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//load 'amazon.in' in the browser
		driver.get("https://www.amazon.in/");
		
		//locate the Search field and Search phones in the search field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		//Write common locator / xpath matching all the phone price in the page and get into List<Element>
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//Create a list to store prices
		List<Integer> priceList = new ArrayList<Integer>();
		
		//Loop through each price
		for(int i=0;i<price.size()-1;i++) 
		{
			//Get the text of each price
			String price_value = price.get(i).getText();	
			 System.out.println(price_value);
			 
			 //check if the price value is null or not toSkip empty values
			 if(!(price_value.isEmpty()))
			 {
				//Remove commas in price text and store it in local variable
				 String replaced_price = price_value.replaceAll(",", "");
				 
				 //convert the price value from String to Int datatype
				 int final_price = Integer.parseInt(replaced_price);
				 
				 //adding the converted int type price to the list(Get the values in a list )
				 priceList.add(final_price);
				 
				 System.out.println(priceList);
				 
			}
			 //sorting the list(sort the values in ascending order)
			 Collections.sort(priceList);
			 
			 //Get the first item from the sorted list which is the least price
			 int first_item_price = priceList.get(0);
			 System.out.println("The least price is:"+first_item_price);
		}
		//Thread.sleep(3000);
		//Close the browser
		driver.close();
	

}
	}
