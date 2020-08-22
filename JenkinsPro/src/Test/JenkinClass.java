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
  public void wbtbl() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Markose\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.navigate().to("https://erail.in/trains-between-stations/mumbai-central-BCT/new-delhi-NDLS");
	  
	  driver.manage().window().maximize();
	  
	  WebElement tab = driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']"));
	  
	  List<WebElement> rows = tab.findElements(By.tagName("tr"));
	  
	  System.out.println("The list of rows:" +rows.size());
	  
	  for(WebElement row : rows) {
		  
		  List<WebElement> cells = tab.findElements(By.tagName("td"));
		  
		  for(WebElement cell:cells) {
			  
			  String value = cell.getText();
			  
			  System.out.print(value);
		  }
	  System.out.println();
	  }
	  
	  driver.close();
		  }	
  }

