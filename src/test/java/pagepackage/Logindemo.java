package pagepackage;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Baseclaass;

public class Logindemo extends Baseclaass {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement username;

	@FindBy(id="password")
	WebElement pswd;

	@FindBy(id="login-button")
	WebElement login;


		
		public Logindemo(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		

		

		public void setvalues(String userName, String pwd) {
			
			username.sendKeys(userName);
			pswd.sendKeys(pwd);
			
		}
		public String titleverification() {
			String actualtitle=driver.getTitle();
			return actualtitle;
			
		}
		
		
		public void clickloginBtn() {
			login.click();
			
		}

}
