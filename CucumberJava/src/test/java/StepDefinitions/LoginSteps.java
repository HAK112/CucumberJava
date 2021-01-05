package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - User is on Login Page");
	}

	@When("users enter username and password")
	public void users_enter_username_and_password() {
		System.out.println("Inside Step - User enters username and password");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - Clicks on login Button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step - User is navigated to the Home Page");
	}

}
