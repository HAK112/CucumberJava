package StepDefenations;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelReader.ExcelReader;
import Locators.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AppachePoiLogin {
	
	WebDriver driver = null;
	LoginPage loginpage; 
	ExcelReader reader = null; 
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		loginpage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
	}

	@When("User fills the form from given sheetname {string} and {int}")
	public void user_fills_the_form_from_given_sheetname_and(String sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("ExcelData\\login.xlsx", sheetname);
		String EmailAddress = testData.get(rowNumber).get("Email");
		String Password = testData.get(rowNumber).get("Password");
		loginpage.LoginEmail(EmailAddress);
		loginpage.LoginPassword(Password);
	}
	@When("Clicks on signin button to login")
	public void clicks_on_signin_button_to_login() {
	    loginpage.LoginButton();
	}

	@Then("User will be navigated to the home page")
	public void user_will_be_navigated_to_the_home_page() throws InterruptedException {
	    Assert.assertEquals(loginpage.HomePageHeading(), "MY ACCOUNT");
	    Thread.sleep(3000);
	    driver.close();
	}
}