package StepDefenations;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefenations"},
				monochrome=true,plugin= {"pretty", "html:target/HtmlReports.html",
						"json:target/cucumber.json",
						"junit:target/junitReports.xml"})
public class TestRunner {

}
