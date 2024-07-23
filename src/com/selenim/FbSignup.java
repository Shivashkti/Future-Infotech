package com.selenim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/login/");
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				
				WebElement sinuplink = driver.findElement(By.xpath("//a[@rel = 'nofollow']"));
				sinuplink.click();
				
				//WebElement female=driver.findElement(By.xpath("//input[@value=\"1\"]"));//radio button
				
				WebElement female=driver.findElement(By.xpath("//label[text()=\"Female\"]"));//for label
				
                female.click();
                //Thread.sleep(3000);
                
                
                System.out.println(female.getText());
                
                
            WebElement	male=driver.findElement(By.xpath("//input[@value=\"2\"]"));
			male.click();
			
			WebElement custom=driver.findElement(By.xpath("//input[@value=\"-1\"]"));
			custom.click();
		//WebElement	signup=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		//signup.click();
		
		
		
		/*WebElement drpbtn_day=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
		
          Select dropday=new Select(drpbtn_day);
          dropday.selectByIndex(2);*/
			
         // Thread.sleep(3000);
		
		List<WebElement> month = driver.findElements(By.xpath("//select[@id= 'month'] /option"));
		
		    
		 month.get(11).click();
		// Thread.sleep(5000);
		 
		 System.out.println(month.size());
			
		   System.out.println(month.get(11).getText());
		
			driver.close();
				
}
}

