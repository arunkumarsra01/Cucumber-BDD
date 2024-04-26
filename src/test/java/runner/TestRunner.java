package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "E:\\BDD\\src\\main\\resources\\features\\LoginPage.feature",
		"E:\\BDD\\src\\main\\resources\\features\\AddToCart.feature" }, glue = { "stepDefintions" }, monochrome = true)
public class TestRunner {

}
