package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {

		//Test 2:verify url
		//
		
		System.setProperty("webdriver.chrome.driver", "/Users/malvo/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// navigate().to() == get();
		
		driver.navigate().to("http://www.cybertekschool.com");
		
		String expected = "cybertekschool";
		String actual = driver.getCurrentUrl();
		
		if(actual.contains(expected)) {
			
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t"+expected);
			System.out.println("Actual:\t"+actual);
		}
		
		Thread.sleep(1000);
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	//	driver.quit(); closes all the tabs and windows. End session.
	//	We can not use the same driver object again. We should instantiate it again.
	}

}
