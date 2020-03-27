package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
		 WebDriver c=new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("http://www.greenstechnologys.com/");
		 JavascriptExecutor js=(JavascriptExecutor)c;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 WebElement output = c.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		 String text = output.getText();
		 System.out.println(text);
	}

}
