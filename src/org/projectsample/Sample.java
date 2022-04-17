package org.projectsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) throws InterruptedException   {
		BaseClass.browserLaunch("chrome");
		BaseClass.urlLaunch("http://www.leafground.com/pages/drop.html");
		BaseClass.windowMaximize();
		
	}
}