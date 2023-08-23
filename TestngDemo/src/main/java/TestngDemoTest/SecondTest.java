package TestngDemoTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void TestCase1()
	{
		System.out.println("test case 1");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Test case 3");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In Before Method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("In after method");
	}
	
	 @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }

	}

