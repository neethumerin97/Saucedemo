package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHomeandLogoutpage {
	WebDriver driver;
	
	@FindBy(id="finish")
	WebElement finishbtn;

	@FindBy(id="back-to-products")
	WebElement backhomebtn;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement menubutton;

	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logoutbutton;
	
	

	public SauceHomeandLogoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void backhome() throws Exception {
		finishbtn.click();
		Thread.sleep(5000);
		backhomebtn.click();
	}
	public void logout() throws Exception {
		menubutton.click();
		Thread.sleep(5000);
		logoutbutton.click();
	}
}
