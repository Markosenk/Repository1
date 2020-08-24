package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JenkinClass {
  @Test
public void ExceptionMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Markose\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("https://www.facebook.com/");
	  
	  //driver.manage().window().maximize();
	  
	  try {
		  
		  WebElement cust = driver.findElement(By.xpath("//label[text()='Custom1']")); 
		  
		  if(cust.isDisplayed()) {
			  
			  System.out.println("Element is Displayed");
		  }
		  
	  }
	  
	  catch(Exception e) {
		  
		  System.out.println("Not available");
		  System.out.println(e.getMessage());
	  }
	  
	  
	  finally{
		  
		  System.out.println("I m executed");
		  
   		  
	  }
  
driver.close();	  
  }
}