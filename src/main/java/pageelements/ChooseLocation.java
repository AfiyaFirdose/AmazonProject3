package pageelements;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class ChooseLocation {
		WebDriver driver;

		By Location = By.id("nav-global-location-popover-link");
		By PinCode = By.id("GLUXZipUpdateInput");
		By Apply = By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input");

		public ChooseLocation(WebDriver d) {
			driver = d;
		}
		public void Location() {
			driver.findElement(Location).click();
			System.out.println("Successfully Landed to Choose Your Location Pop-Up");
		}
		public void PinCode() {
			driver.findElement(PinCode).sendKeys("500070");
		}
		public void Apply() {
			driver.findElement(Apply).click();
			System.out.println("Successfully PinCode is Applied");
		}

	}