package Annotation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo 

{
	
 @AfterTest
	 
	 public void AfterTestDemo()
	 {
		  System.out.println("WELCOME TO TestNG AFTERTEST");
		 
	 }
 
	@Test
	public void setupDemo()
	{
		System.out.println("WELCOME TO TestNG METHOD1");
	}
	
	
	@Test
	public void setupDemo2()
	{
		
		System.out.println("WELCOME TO TestNG METHOD2");
	}
	
	@Test
	public void setupDemo3()
	
	{
		
		System.out.println("WELCOME TO TestNG METHOD3");
		
		
		
	}
	
	 @BeforeTest
	   
	   public void BeforeTestDemo()
	   
	   {
		   
		   System.out.println("WELCOME TO TestNG BEFORETEST");
	   }
	
	
	 // declaring AfterTest
	 }

