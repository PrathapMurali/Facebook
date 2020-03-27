package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Green {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver c=new FirefoxDriver();
c.get("http://www.greenstechnologys.com/");
c.get("http://gmail.com/");
c.get("http://www.flipkart.com/");
c.get("http://www.greenstechnologys.com/selenium-course-content.html");
c.close();
	}

}
