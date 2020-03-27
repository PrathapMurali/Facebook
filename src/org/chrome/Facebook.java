package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver f=new ChromeDriver();
f.manage().window().maximize();
f.get("https://www.facebook.com/");
WebElement create = f.findElement(By.xpath("//span[text()='Create an account']"));
String text = create.getText();
System.out.println(text);
WebElement username = f.findElement(By.xpath("//input[@type='email']"));
username.sendKeys("appumurali92@gmail.com");
boolean displayed = username.isDisplayed();
boolean enabled = username.isEnabled();
System.out.println(displayed);
System.out.println(enabled);
if (displayed&&enabled) {
	System.out.println("appumurali92@gmail.com");
	Thread.sleep(3000);
	WebElement select = f.findElement(By.xpath("(//input[@type='radio'])[1]"));
	boolean selected = select.isSelected();
	System.out.println(selected);
	
	
}


	}

}
