package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement target1= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
Actions ac=new Actions(driver);
ac.dragAndDrop(src, target).build().perform();
ac.dragAndDrop(src1, target1).build().perform();
ac.dragAndDrop(src2, target2).build().perform();
ac.dragAndDrop(src3, target3).build().perform();
WebElement text = driver.findElement(By.xpath("//a[text()='Perfect!']"));
String text2 = text.getText();
System.out.println(text2);
	}

}
