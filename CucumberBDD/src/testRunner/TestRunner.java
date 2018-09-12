package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\vivek\\Desktop\\other\\selenium\\CucumberBDD\\src\\feature\\login.feature",
	glue= {"stepDefinition"}
	//tags= {"@login"} 
	) 
	public class TestRunner {  	
		
	}

