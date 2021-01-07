package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SignInPage;

public class automationPracticeSignIn {
	WebDriver driver = null;
	SignInPage signInPage = null;
	
	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 		
	}
	
	@After
	public void browserClose() {
		driver.close(); 
	}
	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("Runs before every step");
//	}
//	
//	@AfterStep(order=1)
//	public void afterStep() {
//		System.out.println("Runs after every step");
//	}
//	
//	@AfterStep(order=2)
//	public void afterStep1() {
//		System.out.println("Runs after every step1");
//	}
	
	@Given("browser is open")
	public void user_is_on_automation_practice_homepage() {
		driver.get("http://automationpractice.com");
		signInPage = new SignInPage(driver);
	}
	
	@And("user clicks on Signin button")
	public void user_clicks_on_Signin_button() {
		signInPage.clickSignInHeaderButton();
	}

	@When("^user enter (.*) and (.*)$")
	public void users_enter_username_and_password(String username, String password) {
		signInPage.setEmail(username);
		signInPage.setPassword(password);
	}
	
	@And("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		signInPage.clickSignInButton();
	}

	@Then("user is navigated to account page")
	public void user_is_navigated_to_account_page() {
		System.out.println(signInPage.getPageTitle());
	}
}