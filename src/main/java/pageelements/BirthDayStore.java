package pageelements;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;

		public class BirthDayStore {
			WebDriver driver;
			
			By BirthdayDeals = By.xpath("//*[@id=\"CardInstanceCbbEyPy8njIC6qpZYagghw\"]/div[2]");
			By BirthDayCards = By.xpath("//button[@class='sc-8nu4yh-0 eVjuWP gfhz-button' and text()='Birthday card']");
			By Product1  = By.xpath("//span[@class='sc-167fkr-0 z5x770-0 hoLOMk iJcgAl']");
			
			public BirthDayStore(WebDriver d) {
				driver = d;
			}
			public void BirthdayDeals() {
				driver.findElement(BirthdayDeals).click();
				System.out.println("Successfully loaded to Birthday Deals page");
			}
			public void BirthDayCards() {
				driver.findElement(BirthDayCards).click();
			}
			public void Product1() {
				driver.findElement(Product1).click();
				System.out.println("BirthDay Card is Selected");
			}

		}