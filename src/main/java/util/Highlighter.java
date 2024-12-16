package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

	public static void getColor(WebDriver driver,WebElement element){		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid yellow'", element);		
	}
	public static  void getColor(WebDriver driver,WebElement element, String ColorName){		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid "+ColorName+"'", element);		
	}
}
