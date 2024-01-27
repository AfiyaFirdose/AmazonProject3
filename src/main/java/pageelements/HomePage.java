package pageelements;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver d) {
		driver = d;
	}

	public void VerifyAmazonHomePage() {
		assert driver.getTitle().contains("Amazon") : "Not on Amazon home page";
	}

}

	