package org.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ALERexample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER1\\eclipse-workspace\\Alerts\\DriverChrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	Thread.sleep(2000);
	WebElement sindrop = driver.findElement(By.id("continents"));
	Select a=new Select(sindrop);
	boolean multiple = a.isMultiple();
	System.out.println(multiple);
	a.selectByValue("AUS");
	
 
	
}
}
