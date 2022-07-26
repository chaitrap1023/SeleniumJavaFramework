package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
		@Given("browser is working")
	public void browser_is_working() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}

	@And("user is in search page")
	public void user_is_in_search_page() {
		System.out.println("inside-- search page");
		driver.navigate().to("https://google.com");
	//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
		System.out.println("inside-- searchbox");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("inside--enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("resulta page is displayed")
	public void resulta_page_is_displayed() {
		System.out.println("inside-- result");
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
	}



}
