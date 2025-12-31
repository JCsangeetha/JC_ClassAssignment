package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemonstratingStaticParameterizationTestNG {
	
public RemoteWebDriver driver;

@Parameters({"browser","Url","userName","passWord"})
@Test
public void loginStaticMethod(String browser,String url, String uName , String pwd) {
	
	//Initialize driver
	switch(browser){
	
	case "CHROME" :
	driver= new ChromeDriver();
	break;
	
	case "FIREFOX":
	driver= new FirefoxDriver();
	break;
	
	case "EDGE":
	driver= new EdgeDriver();
	break;

	case "SAFARI":
	driver= new SafariDriver();
	break;
	}
	//maximize the browser window
	driver.manage().window().maximize();
	
	//apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//load the url
	driver.get(url);
	
	//passing the username and password
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pwd);
	
	//click on the submit button
	driver.findElement(By.className("decorativeSubmit")).click();
	
    //closer the browser
	driver.close();
	
	
	}
	}


