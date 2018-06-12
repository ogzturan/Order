package com.cbt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BAsicAuthenticationTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/malvo/Documents/selenium dependencies/drivers/chromedriver");
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().fullscreen();//full screen page driver

		//driver.navigate().to("https://accounts.google.com/");
		driver.get("https://accounts.google.com/");  
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.name("identifier")).sendKeys("ogzturan@gmail.com");
		driver.findElement(By.id("#identifierNext")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("abdefgh");
		driver.findElement(By.id("passwordNext")).click();
		  
		//driver.close();
		//driver.quit(); 
		// $("")
		
		
		
		
		
		
		
	
	
	}

}
