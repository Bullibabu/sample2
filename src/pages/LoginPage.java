package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver ;
	By usernameFiled = By.id("signup-content-form-email");
    By continue_button= By.id("signup-content-form-email-btn-continue");
    By passwordFiled  = By.id("signup-content-form-password");
    By loginButton =By.id("signup-content-form-password-signin");

    public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
    	driver = driver2;
	}



	public void login() {
     
    waitfor(usernameFiled);
     CharSequence username = "sravanadmin1@zenqatest2.com";
	driver.findElement(usernameFiled).sendKeys(username);
      waitfor(continue_button);
      driver.findElement(continue_button).click();
      CharSequence password = "Second@123";
      waitfor(passwordFiled);
      driver.findElement(passwordFiled).sendKeys(password );
      waitfor(loginButton);
      driver.findElement(loginButton).click();
      //By userTitleLocator = By.id("app-header-user-name");

     // waitfor(userTitleLocator);

     

     
    }

	private void waitfor(By locator) {
		// TODO Auto-generated method stub
		WebDriverWait  wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}