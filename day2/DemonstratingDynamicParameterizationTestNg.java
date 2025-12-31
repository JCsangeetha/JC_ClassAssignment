package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemonstratingDynamicParameterizationTestNg extends BaseClass{
	
@DataProvider(name="getValue")
public String[][] testData() {
	
	//passing two different account name , first name , last name for the creating lead
	//cmpyName|fName|lastName
	//cmpyName|fName|lastName so 2 rows 3 columns
	
	//initializing or creating a object for 2 dimentional string array
	String[][] data = new String[2][3];//2rows,3columns
	//row1 :coulum1,2,3
	data[0][0] = "Freshwork";
	data[0][1] = "David";
	data[0][2] = "D";
	
	//row2:column1,2,3
	data[1][0] = "IBM";
	data[1][1] = "John";
	data[1][2] = "J";

	return data;
	}

@Test(dataProvider="getValue")
public void createLead(String cmpyName ,String fName ,String lastName) 
{
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.name("submitButton")).click();

}
}
