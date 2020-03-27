package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://artoftesting.com/samplesiteforselenium");
	     WebElement textbox = driver.findElement(By.xpath("//input[@id='fname']"));
	     WebElement submit = driver.findElement(By.xpath("//button[@id='idOfButton']"));
	     WebElement click = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	     Actions ac=new Actions(driver);
	     ac.sendKeys(textbox,"prathap").build().perform();
	     ac.click(submit).build().perform();
	     ac.doubleClick(click).build().perform();
	}

}
