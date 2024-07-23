package com.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id(null));
		//driver.findElement(By.name(null));
		//driver.findElement(By.className("profile-link")).click();
		//driver.findElement(By.xpath(null));
		//driver.findElement(By.linkText("Mukesh Otwani")).click();
		//driver.findElement(By.partialLinkText("Otwani")).click();
		//driver.findElement(By.tagName("input")).click();
		driver.findElement(By.cssSelector(".post-count-link")).click();

	}

}
