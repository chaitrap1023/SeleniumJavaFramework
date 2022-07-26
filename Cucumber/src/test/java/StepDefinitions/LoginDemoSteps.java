//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemoSteps {
//	
//	WebDriver driver= null;
//	
//	@Given("browser is open")
//	public void browser_is_open() throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		Thread.sleep(5000);
//		
//	}
//
//	@And("user is in login page")
//	public void user_is_in_login_page() throws Exception {
//		driver.navigate().to("https://example.testproject.io/web/");
//		
//		Thread.sleep(5000);
//	}
//
//	//@When("user enters (.*) and (.*)")
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_cred(String username, String password)  {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
//	
//	@And("clicks on login")
//	public void clicks_on_login() throws Exception {
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(5000);
//	}
//	
//
//	@Then("navigate to home page")
//	public void navigate_to_home_page() throws Exception {
//		
//		driver.getPageSource().contains("TestProject Example page");
//		Thread.sleep(5000);
//		driver.close();
//	}
//	
//	
//
//
//}
