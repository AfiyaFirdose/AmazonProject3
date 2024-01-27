package pageelements;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;

	public class FreshIcon {
		WebDriver driver;

		By FreshIcon = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
		By PinCode = By.id("GLUXZipUpdateInput");
		By Apply = By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input");
		By FruitsCategory = By.xpath("//*[@id=\"contentGrid_602068\"]/div/div[2]/div[1]/div/div");
		By AddProduct1 = By.xpath("//*[@id=\"alm-cards-desktop-link-location-B07MM5S7V6\"]/div/div");
		By AddProduct2 = By.xpath("//*[@id=\"alm-cards-desktop-link-location-B07MM5SNQH\"]/div/div");
		By AddProduct3 = By.xpath("//*[@id=\"alm-cards-desktop-link-location-B07BG6Q18N\"]/div/div");

		public FreshIcon(WebDriver d) {
			driver = d;
		}

		public void FreshIcon() {
			driver.findElement(FreshIcon).click();
			System.out.println("Successfully Landed on Fresh Fruits&Vegetables Page");
		}

		public void PinCode() {
			driver.findElement(PinCode).sendKeys("500070");
		}

		public void Apply() {
			driver.findElement(Apply).click();
			System.out.println("Successfully PinCode is Applied");
		}

		public void FruitsCategory() {
			driver.findElement(FruitsCategory).click();
		}

		public void AddProducts1() {
			driver.findElement(AddProduct1).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"productTitle\"]")));
		}

		public void AddProducts2() {
			driver.findElement(AddProduct2).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"productTitle\"]")));
		}

		public void AdddProducts3() {
			driver.findElement(AddProduct3).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"title\"]")));
		}}
