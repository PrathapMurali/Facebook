package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium1\\workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver s=new ChromeDriver();
s.manage().window().maximize();
s.get("https://adactin.com/HotelApp/SearchHotel.php");
WebElement username = s.findElement(By.xpath("//input[@name='username']"));
username.sendKeys("prathap92");
Thread.sleep(3000);
WebElement password = s.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("ZY648R");
Thread.sleep(3000);
WebElement login = s.findElement(By.xpath("//input[@type='Submit']"));
login.click();
Thread.sleep(2000);
WebElement location = s.findElement(By.xpath("//select[@name='location']"));
location.sendKeys("Brisbane");
Thread.sleep(3000);
WebElement hotels = s.findElement(By.xpath("//select[@name='hotels']"));
hotels.sendKeys("Hotel Hervey");
Thread.sleep(3000);
WebElement roomtype = s.findElement(By.xpath("//select[@id='room_type']"));
roomtype.sendKeys("Double");
Thread.sleep(3000);
WebElement rooms = s.findElement(By.xpath("//select[@name='room_nos']"));
rooms.sendKeys("3 - Three");
Thread.sleep(3000);
WebElement checkin = s.findElement(By.xpath("//input[@name='datepick_in']"));
checkin.sendKeys("12/03/2020");
Thread.sleep(3000);
WebElement checkout = s.findElement(By.xpath("//input[@name='datepick_out']"));
checkout.sendKeys("13/03/2020");
Thread.sleep(3000);
WebElement adult = s.findElement(By.xpath("//select[@id='adult_room']"));
adult.sendKeys("3 - Three");
Thread.sleep(3000);
WebElement childrens = s.findElement(By.xpath("//select[@name='child_room']"));
childrens.sendKeys("1 - One");
Thread.sleep(3000);
WebElement search = s.findElement(By.xpath("//input[@type='submit']"));
search.click();
WebElement radio = s.findElement(By.xpath("//input[@name='radiobutton_0']"));
radio.click();
Thread.sleep(3000);
WebElement submit = s.findElement(By.xpath("//input[@name='continue']"));
submit.click();
WebElement firstname = s.findElement(By.xpath("//input[@name='first_name']"));
firstname.sendKeys("Prathap");
Thread.sleep(3000);
WebElement lastname = s.findElement(By.xpath("//input[@name='last_name']"));
lastname.sendKeys("M");
Thread.sleep(3000);
WebElement address = s.findElement(By.xpath("//textarea[@name='address']"));
address.sendKeys("No 4 Nehru Street SS Nagar Thirumullaivoyal ch-62");
Thread.sleep(3000);
WebElement card = s.findElement(By.xpath("//input[@name='cc_num']"));
card.sendKeys("4567 1564 5243 7891");
Thread.sleep(3000);
WebElement cardtype = s.findElement(By.xpath("//select[@name='cc_type']"));
cardtype.sendKeys("AMEX");
Thread.sleep(3000);
WebElement month = s.findElement(By.xpath("//select[@id='cc_exp_month']"));
month.sendKeys("April");
Thread.sleep(3000);
WebElement year = s.findElement(By.xpath("//select[@id='cc_exp_year']"));
year.sendKeys("2022");
Thread.sleep(3000);
WebElement ccv = s.findElement(By.xpath("//input[@id='cc_cvv']"));
ccv.sendKeys("567");
Thread.sleep(3000);
WebElement booknow = s.findElement(By.xpath("(//input[@type='button'])[1]"));
booknow.click();
WebElement logout = s.findElement(By.xpath("//a[text()='Logout']"));
logout.click();
Thread.sleep(3000);
s.quit();


	}

}
