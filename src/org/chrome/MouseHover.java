package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.greenstech.in/selenium-course-content.html");
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		WebElement software = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		WebElement automation = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).build().perform();
		ac.moveToElement(software).build().perform();
		ac.click(automation).build().perform();
		
	}

}
