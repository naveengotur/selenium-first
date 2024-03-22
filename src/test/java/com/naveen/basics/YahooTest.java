package com.naveen.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class YahooTest {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Title-"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");

		
		driver.close();
	}

}
