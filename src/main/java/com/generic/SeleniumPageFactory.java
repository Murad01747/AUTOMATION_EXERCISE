package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	SeleniumPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//*[@type='email'])[1]")
	private WebElement email;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy (xpath = "(//*[@type='submit'])[1]")
	private WebElement login;
	@FindBy(xpath = "//*[text()=' Logout']")
	private WebElement Logout;
	@FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
	private WebElement youremailandpasswordisincorrect;	
	
	
	
	public WebElement getYouremailandpasswordisincorrect() {
		return youremailandpasswordisincorrect;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
