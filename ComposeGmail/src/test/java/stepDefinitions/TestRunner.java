package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features" , glue = {"stepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports"}
)



public class TestRunner {

}
