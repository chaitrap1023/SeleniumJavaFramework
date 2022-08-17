package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps_PF {
	
	WebDriver driver= null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.findElement(By.)
	}
	
	@And("user is in login page")
	public void userLogin() throws Exception {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(3000);
		
		
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_cred(String username, String password) throws Exception {
		login = new LoginPage_PF(driver);
		home= new HomePage_PF(driver);
	 	login.enterUSername(username);
	 	login.enterPassword(password);
	 	login.clickLogin();
	 	home.is_logout_displayed();
	 	Thread.sleep(3000);
	 	driver.close();
	 	
	
		
	}

}
