package StepDef;

import org.openqa.selenium.By;

import TestRun.TestRunnerWithTestNG;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends TestRunnerWithTestNG{
	
	@Given("Open the browser")
	public void open_the_browser() {
	    System.out.println("Open the browser");
	}

	@And("Navigate to application")
	public void navigate_to_application() {
		 System.out.println("Navigate to application");
	}

	@When("User provides Valid credentials")
	public void user_provides_valid_credentials() {
		 System.out.println("User provides Valid credentials");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tyss");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");

	}

	@And("click on log in button")
	public void click_on_log_in_button() {
	   System.out.println("click on log in button");
		driver.findElement(By.xpath("//ion-button[contains(@class,'submit-btn')]")).click();
	}

	@Then("User is moved to TOA page.")
	public void user_is_moved_to_toa_page() {
	   System.out.println("User is moved to TOA page.");
	}


}
