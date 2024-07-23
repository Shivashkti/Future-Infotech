package com.selenim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Altert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
		"G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//WebElement btn=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
	//btn.click();
	//Thread.sleep(3000);
	
	//Alert :interface
    //simple
    //prompt
    //comfirmation
    
	
	//Alert simple = driver.switchTo().alert();
	    // simple.accept();
	/*
	 * driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click
	 * ();
	 * driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	 * Thread.sleep(3000); Alert prompt = driver.switchTo().alert();
	 * System.out.println( prompt.getText()); prompt.dismiss();
	 */
	      driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
	      driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	      Thread.sleep(3000); 
	      
    Alert confirm = driver.switchTo().alert();
	      System.out.println(confirm.getText());
	      confirm.sendKeys("ketaki");
	      confirm.accept();

	
}
}
