package org.internetexp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Greens {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver c=new InternetExplorerDriver();
		c.get("http://www.greenstechnologys.com/");
		c.get("http://gmail.com/");
		c.get("http://demo.automationtesting.in/Register.html");
		c.get("http://www.greenstechnologys.com/selenium-course-content.html");
		c.close();
	}

}
