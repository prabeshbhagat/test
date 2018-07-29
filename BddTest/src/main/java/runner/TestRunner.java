package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Bibhuti\\workspace_selenium\\BddTest\\Feature\\login.feature" ,
		glue={"stepDefinition"} ,
		//monochrome = true,
		//strict = true,//it will check if any step is not defined in step definition file
		//dryRun = false ,//to check the mapping is proper between feature file and step def file
        format= {"pretty","html:test-outout"} //to generate different types of reporting
//the path of the step definition files
)
public class TestRunner {

}
