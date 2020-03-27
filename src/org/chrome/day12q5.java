package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		c.get("http://www.adactin.com/HotelApp/");
		WebElement username = c.findElement(By.xpath("//input[@name='username']"));
		JavascriptExecutor js=(JavascriptExecutor)c;
		js.executeScript("arguments[0].setAttribute('value','prathap92')",username);
		WebElement password = c.findElement(By.xpath("//input[@name='password']"));
js.executeScript("arguments[0].setAttribute('value','ZY648R')",password);
	}

}
