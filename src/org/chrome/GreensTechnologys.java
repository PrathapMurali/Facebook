package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologys {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
     WebDriver c=new ChromeDriver();
	c.manage().window().maximize();
	c.get("http://www.greenstechnologys.com/");
	c.get("https://www.facebook.com/");
	c.get("https://www.amazon.in");
	c.get("http://www.greenstechnologys.com/selenium-course-content.html");
	c.close();
	}

}
