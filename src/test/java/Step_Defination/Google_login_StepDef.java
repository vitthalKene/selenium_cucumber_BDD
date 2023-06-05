package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page_Object.Google_login_POM;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_login_StepDef {
	
	public WebDriver driver;
	public Google_login_POM lp;
	
	@Given("User go to google url {string}")
	public void user_go_to_google_url(String string) {
	  // System.setProperty("webdriver.chrome.driver", "D:\\MSSquare Global\\chromedriver_win32\\chromedriver.exe");
	  
		 WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	   driver.get("https://www.google.co.in/");
	}

	@When("enter the value in search box")
	public void enter_the_value_in_search_box() {
		lp.search();
	    
	}

	@Then("user click on second option")
	public void user_click_on_second_option() {
		lp.Secondoption();
	    
	}

}
