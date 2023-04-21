package AssertionDemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class Demo2 {
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void Browser(String url) {
		driver = new EdgeDriver();
		driver.get(url);
	}

	@Test 
	public void Title(){

		String ExceptedTitle=driver.getTitle();
		String ActualTitle="PrimeVideoes";
		System.out.println("Title of page:"+ ExceptedTitle);
		SoftAssert asert=new SoftAssert();
		asert.assertEquals(ExceptedTitle, ActualTitle);
	}
	@Test
	public void Text() {
		WebElement text=  driver.findElement(By.xpath("//div[@class='pv-brand-logo']"));
		String ExceptedText=text.getText();
		String ActualText="Go to Homepage";
		System.out.println(ExceptedText);
		// Assert.assertEquals(ExceptedText, ActualText);
		SoftAssert asert=new SoftAssert();
		asert.assertEquals(ExceptedText, ActualText,"Text does not matched");
		asert.assertAll();

	}
	@Test(enabled = false)
	public void CurrentURL() {
		String ExceptedURL=driver.getCurrentUrl();
		String ActualURL="https://www.primevideo.com";
		SoftAssert asert=new SoftAssert();
		asert.assertEquals(ExceptedURL, ActualURL);
		asert.assertAll();
	}
	@Parameters({"EmailId","Pass"})
	@Test
	public void EnterLogin(String EmailId,String Pass) {
		driver.findElement(By.xpath("//span[@class='pv-nav-account-icon']")).click();
		driver.findElement(By.xpath("//a[@id='pv-nav-sign-in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(EmailId);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
}

