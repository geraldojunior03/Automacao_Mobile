package stepsDefinition;

import core.BaseTest;
import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario scenario) throws Exception{
		//String nomeCenario = scenario.getName().substring(0, 8);
		String nomeCenario = scenario.getName();
		BaseTest.testName = nomeCenario;
//		BaseTest.screenshotIndex = 1;
    }	
	
	@After
    public void afterScenario() throws Exception{
		DriverFactory.resetAPP();
	}
}