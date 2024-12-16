package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionTest {

	public void getLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://automationexercise.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
	driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("islamshm4@gmail.com");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("QAbatch@41");
	driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();

	
	
	}
}
