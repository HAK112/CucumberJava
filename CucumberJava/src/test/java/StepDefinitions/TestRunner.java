package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue={"StepDefinitions"},
		monochrome=true,
		plugin={"pretty","html:target/HtmlReports/HtmlReport.html",
				"pretty","json:target/JsonReports/JsonReport.json",
				"pretty","junit:target/JunitReports/XmlReport.xml"},
		publish=true,
		tags="@SmokeTest")
public class TestRunner {

}
