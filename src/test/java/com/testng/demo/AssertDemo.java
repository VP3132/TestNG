package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AssertDemo {
    @Test
	public void test() {
//    	System.setProperty("webdriver.chrome.driver","D:\\SeleniumSource\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
