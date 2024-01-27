package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeCountry {
	WebDriver driver;
	
	By ChangeCountry = By.xpath("//*[@id=\"icp-flyout-mkt-change\"]/span/div");
	By Country1 = By.xpath("//*[@id=\"icp-dropdown_0\"]");
	By Country2 = By.xpath("//*[@id=\"icp-dropdown_21\"]");
	By Country3 = By.xpath("//*[@id=\"icp-dropdown_5\"]");
	
	public ChangeCountry(WebDriver d) {
		driver = d;
	}
	public void ChangeCountry() {
		driver.findElement(ChangeCountry).click();
		System.out.println("Successfully Page is Landed on Country DropDown Options");
	}
	public void Country1() {
		driver.findElement(Country1).click();
		System.out.println("Successfully Australia Country is Selected");
	}
	public void Country2() {
		driver.findElement(Country2).click();
		System.out.println("Successfully Canada Country is Selected");
	}
	public void Country3() {
		driver.findElement(Country3).click();
		System.out.println("Successfully Egypt Country is Selected");
	}

}