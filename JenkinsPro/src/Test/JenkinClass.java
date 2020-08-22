package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JenkinClass {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Markose\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();

	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	  driver.get("https://www.facebook.com/");

	  driver.manage().window().maximize();

	  Select slt = new Select(driver.findElement(By.xpath("//select[@title='Day']")));
	  slt.selectByIndex(19);

	  Thread.sleep(3000);
	  	  
	  Select slt1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
	  slt1.selectByValue("4");

	  Thread.sleep(3000);

	  Select slt2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
	  slt2.selectByVisibleText("1985");

	  Thread.sleep(3000);
	  slt2.deselectAll();



	    }
  }

