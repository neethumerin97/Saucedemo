package pagepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductpage {
	WebDriver driver;

	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	public SauceProductpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public void addtocart() {
		List<WebElement>li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));
		for(WebElement pr:li) { 
			pr.click();
		}
	}
	public void cartclick() {
		cart.click();
	}
	public void clickcheckout() {
		checkout.click();
	}

}
