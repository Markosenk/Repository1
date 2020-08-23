package Gitpac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\Markose\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		username.sendKeys("markosenk@gmail.com");
	Thread.sleep(3000);

	WebElement password = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	password.sendKeys("loyola03");

	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	login.click();
		}
	  
  }

