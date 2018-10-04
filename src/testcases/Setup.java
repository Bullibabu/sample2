package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {

	
	 public static WebDriver driver;

	@BeforeSuite
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\webdriver\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://qa.workshare.com/");
	      
	  }

	  @AfterSuite
	  public void afterClass() {
		  driver.close();
		  driver.quit();
	  }
	
}
