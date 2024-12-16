package com.generic;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Highlighter;

public class StepDef {
	WebDriver driver;
	SeleniumPageFactory pf;
	
	@Given("Open the browser")
	public void open_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Go to the application")
	public void go_to_the_application() {
		driver.navigate().to("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("Put valid email")
	public void put_valid_email() {
		 pf = new SeleniumPageFactory(driver);
		pf.getEmail().sendKeys("islamshm4@gmail.com");
		Highlighter.getColor(driver, pf.getEmail(), "red");
	}

	@When("Put valid password")
	public void put_valid_password() {	
		 pf = new SeleniumPageFactory(driver);
		pf.getPassword().sendKeys("QAbatch@41");
		Highlighter.getColor(driver, pf.getPassword(), "blue");
	}
	
	@When("Click login button")
	public void click_login_button() throws Exception {
		 pf = new SeleniumPageFactory(driver);
		 Highlighter.getColor(driver, pf.getLogin(), "black");
		 Thread.sleep(5000);
		 pf.getLogin().click();		
	}

	@Then("Login should pass and logout button should visible")
	public void login_should_pass_and_logout_button_should_visible() {
	SoftAssert sa = new SoftAssert();
	//pf.getLogout().isDisplayed();
	sa.assertTrue(pf.getLogout().isDisplayed());
	sa.assertAll();
	}

	@When("Put invalid email")
	public void put_invalid_email() {
		pf = new SeleniumPageFactory(driver);
		pf.getEmail().sendKeys("abcd@gmail.com");
		Highlighter.getColor(driver, pf.getEmail(), "red");
	}

	@When("Put invalid password")
	public void put_invalid_password() {
		pf = new SeleniumPageFactory(driver);
		pf.getPassword().sendKeys("abcd@41");
		Highlighter.getColor(driver, pf.getPassword(), "blue");
	}

	@Then("Login should fail and contain a msg Your email or password is incorrect!")
	public void login_should_fail_and_contain_a_msg_Your_email_or_password_is_incorrect() {	
		SoftAssert sa = new SoftAssert();
		//pf.getYouremailandpasswordisincorrect().isDisplayed();
		sa.assertTrue(pf.getYouremailandpasswordisincorrect().isDisplayed());
		sa.assertAll();
	}
	
}
