package org.chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	     Robot r=new Robot();
	     Actions ac=new Actions(driver);
	     
	     //Mail(new tab)
	     WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
	     ac.contextClick(gmail).build().perform();
	     Thread.sleep(4000);
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(4000);
	     
	     
	     //google image(new window)
	     WebElement images = driver.findElement(By.xpath("//a[@data-pid='2']"));
	     
	     ac.contextClick(images).build().perform();
	     Thread.sleep(4000);
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(4000);
	 
	     //google search 
	     
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mobiles");
	     Thread.sleep(4000);
	    WebElement google = driver.findElement(By.xpath("(//span[text()='mobiles'])[1]"));
	    ac.contextClick(google).build().perform();
	     Thread.sleep(4000);
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     
	     Set<String> sid = driver.getWindowHandles();
	     System.out.println(sid);
	     for (String x : sid) {
	    	 driver.switchTo().window(x);
	    	 String title = driver.getTitle();
	    	 
	    	 if (title.contains("Gmail")) {
				driver.close();
			}else if (title.contains("images")) {
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Laptops");
			     Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class='VmPv7e '])[1]")).click();
				Thread.sleep(4000);
				driver.close();
			}
			else if (title.contains("Samsung")) {
	driver.findElement(By.id("buy-now-button")).click();
	Thread.sleep(4000);
	driver.close();
				
			}
			
		}
	     
	    Set<String> fid = driver.getWindowHandles(); 
	     for ( String y: fid) {
	    	 driver.switchTo().window(y);
	    	 Thread.sleep(4000);
	    	 String title1 = driver.getTitle();
	    	 if (title1.contains("Lenovo")) {
	    		 driver.findElement(By.id("add-to-cart-button")).click();
	    		 Thread.sleep(10000);
	    		 driver.quit();
				
			}
	    	 
			
		}
	     
	     
	}

}
