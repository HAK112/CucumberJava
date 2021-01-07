package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement LoginEmail;
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement LoginPassword;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	WebElement LoginButton;
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]")
	WebElement LoginError;
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	WebElement HomePageHeading;
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement SignButton;
	@FindBy(xpath = "//*[@id=\"login_form\"]/h3")
	WebElement LoginFormHeading;
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/p")
	WebElement LoginFailedError;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginEmail(String username) {
		LoginEmail.sendKeys(username);		
	}	
	public void LoginPassword(String password) {
		LoginPassword.sendKeys(password);		
	}
	public void LoginButton() {
		LoginButton.click();		
	}
	public void LoginError() {
		LoginError.isDisplayed();		
	}
	public String HomePageHeading() {
		return HomePageHeading.getText();		
	}
	public void SignButton() {
		SignButton.click();		
	}
	public String LoginFormHeading() {
		return LoginFormHeading.getText();		
	}
	public String LoginFailedError() {
		return LoginFailedError.getText();		
	}
}
