package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("https://www.facebook.com/");
		 WebElement username = c.findElement(By.xpath("//input[@name='email']"));
		 JavascriptExecutor js=(JavascriptExecutor)c;
		 js.executeScript("arguments[0].setAttribute('value','appumurali92@gmail.com')", username);
		 WebElement password = c.findElement(By.xpath("//input[@name='pass']"));
		 js.executeScript("arguments[0].setAttribute('value','7401135463')", password);
		 
	}

}
