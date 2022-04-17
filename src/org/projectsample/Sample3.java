package org.projectsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement d1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select s1 = new Select(d1);
		s1.selectByIndex(2);
		WebElement d2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select s2 = new Select(d2);
		s2.selectByVisibleText("Loadrunner");
		WebElement d3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select s3 = new Select(d3);
		s3.selectByValue("3");
		WebElement d4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s4 = new Select(d4);
		List<WebElement> options = s4.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
			WebElement d5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
			d5.sendKeys("Selenium");
			WebElement d6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
			Select s5 = new Select(d6);
			boolean multiple = s5.isMultiple();
			System.out.println(multiple);
			s5.selectByIndex(0);
			s5.selectByIndex(1);
			s5.selectByIndex(2);
			s5.selectByIndex(3);

		}
	}
}
