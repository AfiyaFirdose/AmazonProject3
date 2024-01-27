package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectElectronics {
	WebDriver driver;
	
	By Electronics = By.xpath("//*[@id=\"nav-xshop\"]/a[7]");
	By Accessories = By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[2]/span/a/span");
	By CameraAccessories = By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span");
	By CameraFilm = By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[13]/span/a/span");
	By SelectBrand = By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[1]/span/a/span");
	
	public SelectElectronics(WebDriver d) {
		driver = d;
	}
	public void VerifyAmazonHomePage() {
		assert driver.getTitle().contains("Amazon") : "Not on Amazon home page";
	}
	public void Electronics() {
		driver.findElement(Electronics).click();
	}
	public void Accessories() {
		driver.findElement(Accessories).click();
	}
	public void CameraAccessories() {
		driver.findElement(CameraAccessories).click();
	}
	public void CameraFilm() {
		driver.findElement(CameraFilm).click();
	}
	public void SelectBrand() {
		driver.findElement(SelectBrand).click();
		System.out.println(driver.getTitle());
	}

}


