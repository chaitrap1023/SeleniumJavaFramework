package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By txt_username= By.id("name");
	By txt_password= By.id("password");
	By btn_login= By.id("login");
	
	public loginPage(WebDriver driver) {
		
		
		this.driver=driver;
		
		if(!driver.getTitle().equals("hello world"))
			System.out.println("we are on different page and the url is "+ driver.getCurrentUrl());
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);		
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	// === or everything in one function===
	
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.close();
		
	}
	
	

}
