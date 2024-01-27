package pageelements;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class SelectBrand {
		WebDriver driver;
		
		By OnePlus = By.xpath("//*[@id=\"p_89/OnePlus\"]/span/a/div/label/i");
		By Realme = By.xpath("//*[@id=\"p_89/realme\"]/span/a/div/label/i");
		By Samsung = By.xpath("//*[@id=\"p_89/Samsung\"]/span/a/div/label/i");
		
		public SelectBrand(WebDriver d) {
			driver = d;
		}
		public void OnePlus() {
			driver.findElement(OnePlus).click();
		}
		public void Realme() {
			driver.findElement(Realme).click();
		}
		public void Samsung() {
			driver.findElement(Samsung).click();
		}

	}