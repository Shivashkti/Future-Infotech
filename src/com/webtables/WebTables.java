package com.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[contains(@id,'customers')] //th"));
		System.out.println(headers.size());
		
		for(WebElement e:headers )
		{
			String val=e.getText();
			System.out.println(val);
		}
		
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[contains(@id,'customers')] //tr"));
		System.out.println(noofrows.size());
		for(WebElement e:noofrows )
		{
			String val=e.getText();
			System.out.println(val);
		}
		driver.close();
	}
}
