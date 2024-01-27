package pageelements;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class SearchBar {
		WebDriver driver;
		
		By SearchBar = By.id("twotabsearchtextbox");
		By SearchButton = By.id("nav-search-submit-button");
		
		public SearchBar(WebDriver d) {
			driver = d;
		}
		public void SearchBar() {
			driver.findElement(SearchBar).sendKeys("Mobile Phones");
		}
		public void SearchButton() {
			driver.findElement(SearchButton).click();
			assert driver.getTitle().contains("Mobile Phones") : "Not Landed on Mobile Phones Page";
		}
	}
