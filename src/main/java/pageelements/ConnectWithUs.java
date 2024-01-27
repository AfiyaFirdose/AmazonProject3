package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ConnectWithUs {
	WebDriver driver;

	By FooterElement = By.cssSelector("footer");
	By Facebook = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a");
	By Twitter = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[2]/a");
	By Instagram = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a");

	public ConnectWithUs(WebDriver d) {
		driver = d;

	}

	public void FooterElement() {
		driver.findElement(FooterElement);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FooterElement);
	}

	public void Facebook() {
		driver.findElement(Facebook).click();
		System.out.println("Successfully Landed on Amazon Facebook Page");
		driver.getTitle();
		driver.navigate().back();
	}

	public void Twitter() {
		driver.findElement(Twitter).click();
		System.out.println("Successfully Landed on Amazon Twitter Page");
		driver.getTitle();
		driver.navigate().back();
	}

	public void Instagram() {
		driver.findElement(Instagram).click();
		System.out.println("Successfully Landed on Amazon Instagram Page");
		driver.getTitle();
	}
}


