package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Page_Object.Login_nopcommerce_POM;
import io.cucumber.java.en.*;

public class Login_stepDef {
	
	public WebDriver driver;
	public Login_nopcommerce_POM lp;
	
	
	@Given("User launch the Chrome browser")
	public void user_launch_the_chrome_browser() {
	   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		lp=new Login_nopcommerce_POM(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	
	    
	}

	@Then("Enter the valid Email and password")
	public void enter_the_valid_email_and_password() {
	    lp.setUserName("admin@yourstore.com");
	    lp.setPassword("admin");
	}

	@Then("click the login button")
	public void click_the_login_button() {
	   lp.clickLogin();
	}

	@Then("Open dashboard {string}")
	public void open_dashboard(String title) {
	    
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
			
		}
	}

	@When("User click on log out")
	public void user_click_on_log_out() {
		lp.clickLogout();
	}
	
	@Then("close browser")
	public void close_browser() {
	  lp.driver.close();
	}


}
