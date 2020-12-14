package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/I339964/Documents/TestEc/SeleniumDemo/drivers/chromedriver");
		ChromeOptions chromeOPtions = new ChromeOptions();
		//chromeOPtions.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(chromeOPtions);
		driver.get("https://facebook.com");
		
		// to maximize the driver
		driver.manage().window().maximize();
		
		// title of the page
		System.out.println("Title: "+ driver.getTitle());
		
		//		WebElement emailById = driver.findElement(By.id("email"));
		//		emailById.sendKeys("santhoshks2312@gmail.com");
		//		
		//		WebElement passById = driver.findElement(By.id("pass"));
		//		passById.sendKeys("Rashmisan");
		//		
		//		WebElement btnClick = driver.findElement(By.name("login"));
		//		btnClick.click();
		//		
		//		System.out.println("Login Successfully");
		//      close the browser
		//      driver.close();
		
		// Using Xpath -> tagName[attribute='value']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("santhoshks2312@gmail.com");;
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Rashmisan");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("Login Successfully");
		
		// Using CssSelector -> using id or .
		
		//driver.findElement(By.cssSelector("input"))
		
		
	}
}
