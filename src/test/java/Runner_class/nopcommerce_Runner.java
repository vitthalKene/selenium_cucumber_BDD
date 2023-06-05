package Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions (plugin = { "pretty" }, 
features = ".//Features_file/Login_nopcommers.feature", 
glue = "Step_Defination", 
monochrome = true, 
dryRun = false
		)
public class nopcommerce_Runner {
	

}
