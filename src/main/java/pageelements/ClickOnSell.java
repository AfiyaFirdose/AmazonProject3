package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnSell {
	WebDriver driver;
	
	By Sell = By.xpath("//*[@id=\"nav-xshop\"]/a[3]");
	
	public ClickOnSell(WebDriver d) {
		driver = d;
	}
	public void VerifyAmazonHomePage() {
		assert driver.getTitle().contains("Amazon") : "Not on Amazon home page";
	}
	public void Sell() {
		driver.findElement(Sell).click();
		System.out.println("Successfully Landed On Sell Page");
	}

}