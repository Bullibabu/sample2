package testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Setup{
   

@Test(dataProvider="LoginData")
  public void loginTest() {
	LoginPage loginpage = new LoginPage(driver);
	
	loginpage.login();
	try {
		
		Thread.sleep(20000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
@DataProvider(name="LoginData")

public static Object[][] credentials() {
	 
    return new Object[][] { { "testuser_1", "Test@123" }};

}
  
}
