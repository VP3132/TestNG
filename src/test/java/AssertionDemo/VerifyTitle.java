package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {

	@Test
	
	public void Title() {
		System.setProperty("Webdriver.chrome.driver","D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String ActualTitle= driver.getTitle();
		String ExceptedTitle = "Googlee";
		System.out.println("Title of Page is :-" +ActualTitle);
		Assert.assertEquals(ActualTitle, ExceptedTitle);
		SoftAssert Title=new SoftAssert();
		System.out.println("Title is Matched");
         Title.assertEquals(ActualTitle, ExceptedTitle, "Title Doest Match");
		
         }

	@Test
	public void Text() {
		
		System.setProperty("WebDriver.chrome.driver","D:\\SeleniumSource\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement Text2=driver.findElement(By.xpath("//a[normalize-space()='Images']"));
		WebElement Text1= driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
		Text1.getText();
		Text2.getText();
		System.out.println("Text Value is:" + Text1 + Text2);
		
		String ExceptedText ="Images";
	
	}	
	
}
