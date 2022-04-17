package org.projectsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\SeleniumProject\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\SeleniumProject\\FF Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("This Browser is not valid");
			break;
		}

	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	
}
