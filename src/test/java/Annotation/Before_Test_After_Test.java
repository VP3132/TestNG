package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_Test_After_Test {

	WebDriver driver;
	 String DriverLocation ="D:\\\\SeleniumSource\\\\chromedriver_win32 (3)\\\\chromedriver.exe";
	 String URL="https://www.airindia.in/";
	
	
	@BeforeTest
	public void Setup(){
	
		System.setProperty("Webdriver.chrome.driver", DriverLocation);
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	@Test
	public void VerifyVisibleText()
	{
		
		WebElement LoginPage=driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		boolean Is=LoginPage.isDisplayed();
		System.out.println("Displayed Value is"+Is);
		
		
	}
	
	
	@AfterTest
	public void End()
	{
	driver.close();
	}
	
	
	
}
