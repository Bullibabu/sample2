package testcases;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.FolderPage;

public class TestAddFile extends Setup{
	
  @Test
  public void testAddfile() {
	  driver.navigate().to("https://qa.workshare.com/#folders/");
	  //driver.get("https://qa.workshare.com/#folders/"); //navigateTo(");
	  FolderPage fp = new FolderPage(driver);
	  fp.clickAddFileIcon();
	  try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
