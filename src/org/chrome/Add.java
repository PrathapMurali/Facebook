package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("https://www.facebook.com/");
		 WebElement signup = c.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		 String color = signup.getCssValue("Color");
		 System.out.println(color);
		 String bgcolor = signup.getCssValue("Backgroundcolor");
		 System.out.println(bgcolor);
		 String fs = signup.getCssValue("Font-Size");
		 System.out.println(fs);
		 String ff = signup.getCssValue("Font-Family");
		 System.out.println(ff);
		 c.quit();
	}
	

	}


