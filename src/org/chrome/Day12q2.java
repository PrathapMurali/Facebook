package org.chrome;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("http://toolsqa.com/");
		 JavascriptExecutor js=(JavascriptExecutor)c;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 c.quit();
	}

}
