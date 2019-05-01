package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPro {
	public static WebDriver d=new ChromeDriver();
	
	
	@Test
	public  static void invokbrowser()
	{
		d.get("http://www.facebook.com");
		d.findElement(By.cssSelector("[name=email]")).sendKeys("hello");
		
		
	}

}
