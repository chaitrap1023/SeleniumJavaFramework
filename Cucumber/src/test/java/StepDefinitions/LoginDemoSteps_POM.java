package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPage.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps_POM {
	
	WebDriver driver= null;
	loginPage login;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("=====POM====");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}

	@And("user is in login page")
	
	
	public void user_is_in_login_page() throws Exception {
		driver.navigate().to("https://example.testproject.io/web/");
		
		Thread.sleep(5000);
	}

	//@When("user enters (.*) and (.*)")
	@When("^user enters (.*) and (.*)$")
	public void user_enters_cred(String username, String password)  {
		
		login= new loginPage(driver);
		
		login.userLogin(username, password);
		
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
////		driver.findElement(By.id("name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
//	
//	@And("clicks on login")
//	public void clicks_on_login() throws Exception {
//		login.clickLogin();
//	//	driver.findElement(By.id("login")).click();
//		Thread.sleep(5000);
		
		
	}
	

	@Then("navigate to home page")
	public void navigate_to_home_page() throws Exception {
		
		driver.getPageSource().contains("TestProject Example page");
		Thread.sleep(5000);
		driver.close();
	}
	
	


}
