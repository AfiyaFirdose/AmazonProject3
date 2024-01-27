package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectCategory {
	WebDriver driver;
	
	By SmartPhones = By.xpath("//*[@id=\"n/1805560031\"]/span/a/span");
	By SmartandBasicPhones = By.xpath("//*[@id=\"n/1389432031\"]/span/a/span[2]");
	By BasicPhones = By.xpath("//*[@id=\"n/1805559031\"]/span/a/span");
	
	public SelectCategory(WebDriver d) {
		driver = d;
	}
	public void SmartPhones() {
		driver.findElement(SmartPhones).click();
		System.out.println("Smart Phones page is loaded");
	}
	public void SmartandBasicsPhones() {
		driver.findElement(SmartandBasicPhones).click();
		
	}
	public void BasicPhones() {
		driver.findElement(BasicPhones).click();
		System.out.println("Basic Phones page is loaded");
	}

}

