package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginAmazon {
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void Browser(String url) {
		driver = new ChromeDriver();
		driver.get(url);
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
