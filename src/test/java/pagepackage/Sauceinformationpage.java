package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceinformationpage {
	WebDriver driver;
	@FindBy(id="first-name")
	WebElement firstname;
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="continue")
	WebElement  continuebtn;
	
	public Sauceinformationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void information() {
		firstname.sendKeys("ammu");
		lastname.sendKeys("mol");
		postalcode.sendKeys("689567");
	}
	public void clickcontinue() {
		continuebtn.click();
	}

}
