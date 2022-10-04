package TestRun;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vimalselvam.cucumber.listener.Reporter;

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
				,"junit:JUNIT-reports/report.xml"
				,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/extent-config.xml"}  //"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/report.xml"
					//"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"
		)
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests  {

	public static WebDriver driver;
	@BeforeSuite
	public void OpenBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@BeforeTest
	public void logInToApplication()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://p2test.pispl.in:9090/mpower/#/login");
		
	}
	@Test
	public void testRun()
	{
		System.out.println("This is for xml run");
	}
	
	
	@AfterClass 
	public static void writeExtentReport() {
	
		Reporter.loadXMLConfig(new File("./ExtentReport/extent-config.html"));
		Reporter.setSystemInfo("AUT Name", "Parekh");
		Reporter.setSystemInfo("Environment", "Login");
		Reporter.setTestRunnerOutput("BDD Cucumber Framework Reports");
		
	}
}
