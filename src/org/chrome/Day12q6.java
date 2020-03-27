package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("https://www.flipkart.com/");
		 WebElement login = c.findElement(By.xpath("//a[text()='Login']"));
		 JavascriptExecutor js=(JavascriptExecutor)c;
		 js.executeScript("arguments[0].click()", login);
		 Thread.sleep(3000);
		 WebElement email = c.findElement(By.xpath("(//input[@type='text'])[2]"));
		 js.executeScript("arguments[0].setAttribute('value','appumurali92@gmail.com')", email);
		 Thread.sleep(3000);
		 WebElement password = c.findElement(By.xpath("//input[@type='password']"));
		 js.executeScript("arguments.setAttribute('value','youngbeats')", password);
		 Thread.sleep(3000);
		 c.quit();
		 
	}

}
