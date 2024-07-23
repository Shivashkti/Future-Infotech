package com.Mouseevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Moveto_Element
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement title = driver.findElement(By.xpath("//span[text()=\"Blogs\"]"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(title).perform();
		Thread.sleep(5000);
		driver.close();
		
		
	}
}