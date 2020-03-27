package org.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/automation-practice-table/");
	     WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
	     WebElement thead = table.findElement(By.tagName("thead"));
	     WebElement tr = thead.findElement(By.tagName("tr"));
	     List<WebElement> th = tr.findElements(By.tagName("th"));
	     for (WebElement x : th) {
	    	 String text = x.getText();
	    	 System.out.print(text +"\t");
			
		}
	     System.out.println();
	     
	     
	     WebElement tbody = table.findElement(By.tagName("tbody"));
	    List<WebElement>trow  = tbody.findElements(By.tagName("tr"));
	for (WebElement trows : trow) {
	    	//WebElement th1 = trows.findElement(By.tagName("th"));
		List<WebElement> td = trows.findElements(By.tagName("td"));
	     for (WebElement y : td) {
	    	 String text = y.getText();
	    	 System.out.print(text + "\t");
	    	 }
	     System.out.println();
	     
	     
	     
	}
driver.quit();
}
}
