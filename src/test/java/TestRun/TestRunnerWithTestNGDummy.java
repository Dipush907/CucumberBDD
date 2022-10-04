package TestRun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(
		features = "C:/Users/Bidhudatta/eclipse-workspace_old/Selenium_Automation/com.maven.cucumber.testNG/src/test/resources/Features/LoginWithTestNg.feature",
		glue ="StepDef",
		plugin = {"pretty",
				"html:HTML-Reports/report.html"
				,"json:JSON-Reports/report.json"
				,"junit:JUNIT-reports/report.xml"}
		)

public class TestRunnerWithTestNGDummy extends AbstractTestNGCucumberTests  {


	@BeforeSuite
	public void OpenBrowser()
	{
		System.err.println("BeforeSuite");
	}
	@BeforeTest
	public void logInToApplication()
	{
		System.err.println("BeforeTest");
	}
	
	@BeforeClass
	public void initDriver()
	{
		System.err.println("BeforeClass");
	}
	
	@Test
	public void testRun()
	{
		System.out.println("This is for xml run");
	}
	
	@AfterTest
	public void logOut()
	{
		System.err.println("Aftertest");
	}
	@AfterClass
	public void tearDown()
	{
		System.err.println("AfterClass");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.err.println("Aftersuite");
	}
}
