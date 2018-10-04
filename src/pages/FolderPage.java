package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FolderPage {
	By addFileLocator = By.id("files-header-addfiles");
	WebDriver driver;
	public FolderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		
public void clickAddFileIcon() {
	
	WebElement addFileElement  = findbylocator(addFileLocator);
			addFileElement.click();
		}

private WebElement findbylocator(By addFileLocator2) {
	// TODO Auto-generated method stub
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(addFileLocator2));
	return driver.findElement(addFileLocator2);
	
}

}
