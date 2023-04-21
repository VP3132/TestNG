package Annotation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {


	@Test
	public void TestNG() throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Facebook.com",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@Test
	public void Google() throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		SoftAssert softasserts=new SoftAssert();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Facebook.com",Keys.ENTER);
		// Title Assertion
		String expectedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle,"Title is Mismatched");
		
		//URL Assertion
		String expectedURL="https://www.facebook.com/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, expectedURL,"URL is Mismatched");
		
		//Text Assertion
		String expectedText="";
		String ActualText=driver.findElement(By.name("email")).getAttribute("Value");
		softasserts.assertEquals(ActualText, expectedText,"Text is Mismatched");
		
		// Border Assertion
		String expectedBorder="";
		String ActualBorder=driver.findElement(By.name("email")).getCssValue("border");
		Assert.assertEquals(ActualBorder, expectedBorder,"Border is Mismatched");
		
		driver.close();
		softasserts.assertAll();
	}
}
