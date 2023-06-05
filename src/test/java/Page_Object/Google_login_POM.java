package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Google_login_POM {
	
	public WebDriver driver;
	
	public Google_login_POM(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//textarea[@id=\"APjFqb\"]")
	public WebElement SearchBox;
	
	public void search() {
		SearchBox.sendKeys("ICC");
		
	}
	public List<WebElement> Secondoption (){
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname=\\\"bw4e9b\\\"])[1]"));
		System.out.println("List of all Option" +list);
		
		for (WebElement li:list) {
			if (li.getText().contains("icc ranking")) {
				li.click();
				break;
			}
			else 
			{
				System.out.println("Error");
			}
		}
		return list;
		
	}
	

}
