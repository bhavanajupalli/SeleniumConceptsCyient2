package com.cyient.megento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MegentoTest {

	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://account.magento.com/customer/account/login?_ga=2.3417456.170901856.1622610503-1908246485.1622610503");
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
		driver.findElement(By.id("send2")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		//driver.findElement(By.)

	}

}
