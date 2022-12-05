package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		plugin = {
				//"html:target/cucumber-reports", "pretty",
		        //"html:target/site/cucumber-pretty",
		        //"json:target/cucumber.json",
		        //"junit:target/cucumber.xml",
		        //"com.cucumber.listener.ExtentCucumberFormatter:target/report.html",
				},
		monochrome = true,
		glue = {"stepsDefinition"},
		tags = "@dragdrop"
		)

public class RunnerTest {

	@AfterClass
	public static void quitAPP() {
		DriverFactory.getDriver().quit();
	}
}
