package com.Mouseevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	
	/*
	 * WebElement dragme =
	 * driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
	 * WebElement draghere =
	 * driver.findElement(By.xpath("//p[text()=\"Drop here\"]"));
	 * 
	 * Actions act=new Actions(driver); act.dragAndDrop(dragme, draghere).perform();
	 */
	
	
	  WebElement slider = driver.findElement(By.xpath("//div[@id=\"slider\"]"));
	  Actions act=new Actions(driver); 
	  act.clickAndHold(slider).perform();
	 
	
	Thread.sleep(6000);
	driver.close();
	
}
}
