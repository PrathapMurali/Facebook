package org.chrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     
	     String fid = driver.getWindowHandle();
	     System.out.println(fid);
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	     Thread.sleep(5000);
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
	    Thread.sleep(5000);
	    
	    Set<String> sid = driver.getWindowHandles();
	    System.out.println(sid);
	    for (String x : sid) {
	    	driver.switchTo().window(x);
	    	String title = driver.getTitle();
	    	
	    	if (title.contains("Samsung")) {
	    		driver.findElement(By.id("add-to-cart-button")).click();
	    		
					
				}
	    	else if (title.contains("Apple")) {
    			driver.findElement(By.id("buy-now-button")).click();
	    		
				
			}
			
		}
	    
	     Thread.sleep(15000);
	     driver.quit();
	}

}
