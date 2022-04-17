package org.projectsample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphone 7"+Keys.ENTER);
		driver.findElement(By.id("681408928461")).click();
		String current = driver.getWindowHandle();
	    System.out.println(current);
	    Set<String> child = driver.getWindowHandles();
	    for(String phone:child) {
	    	if (!current.equals(child)) {
				driver.switchTo().window(phone);
			}
	    }
	    driver.findElement(By.className("intialtext")).click();
	
	}
}
