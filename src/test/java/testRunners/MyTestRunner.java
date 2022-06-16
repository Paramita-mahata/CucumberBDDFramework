package testRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepdefinations", "Hooks"},
		plugin = {"pretty", "html:target/cucumber.html", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:threadreport/"},
		monochrome= true,
		 dryRun = false,
		 publish = true
	
		)




public class MyTestRunner {

}
