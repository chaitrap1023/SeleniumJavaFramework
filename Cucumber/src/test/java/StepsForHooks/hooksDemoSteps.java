package StepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksDemoSteps {
	
	WebDriver driver=null;
	
	//@Before(value= "@smoke", order=1)
	@Before("@smoke")
	
	public void browserSetup() throws Exception {
		System.out.println("inside before");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@After
	
		public void tearDown() {
		System.out.println("tear down");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	
	public void beforeStep() {
		System.out.println("before step");
		}
	
	@AfterStep
	
	public void afterstep() {
		System.out.println("after step");
		
	}
	

	
	
	@Given("user is in browser")
	public void user_is_in_browser() {
	}
	@When("user enters un and pswd")
	public void user_enters_un_and_pswd() {
	}
	@And("clicks on login btn")
	public void clicks_on_login_btn() {
	}
	@Then("navigated to home page")
	public void navigated_to_home_page() {
	}



}
