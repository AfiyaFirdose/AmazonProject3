package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AboutUs {
	WebDriver driver;

	By FooterElement = By.cssSelector("footer");
	By AboutUs = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a");
	By Careers = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a");

	public AboutUs(WebDriver d) {
		driver = d;
	}

	public void FooterElement() {
		driver.findElement(FooterElement);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FooterElement);
	}

	public void AboutUs() {
		driver.findElement(AboutUs).click();
		System.out.println("Successfully landed on About Us Page");
		driver.navigate().back();
	}

	public void Careers() {
		driver.findElement(Careers).click();
		System.out.println("Successfully landed on Careers Page");
	}



	
}
