package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractionDemo {

	public static void main(String args[]) {
		AbstractionDemo demo = new AbstractionDemo();
			demo.login();
	}
	
	private void login () {
		System.setProperty("webdriver.chrome.driver", "/Users/I339964/Documents/TestEc/SeleniumDemo/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("santhoshks2312@gmail.com");;
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("********");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
