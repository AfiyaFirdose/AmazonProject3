package pageelements;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class ChangeLanguage {
		WebDriver driver;
		
		By Language1 = By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]/span/span[1]");
		By Language2 = By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[4]/span/span[1]");
		By Language3 = By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[8]/span/span[1]");
		
		public ChangeLanguage(WebDriver d) {
			driver = d;
			}
		public void Language1() {
			driver.findElement(Language1).click();
			System.out.println("Successfully Hindi Language is Selected");
		}
	    public void Language2() {
	    	driver.findElement(Language2).click();
	    	System.out.println("Successfully Telugu Language is Selected");
	    }
	    public void Language3() {
	    	driver.findElement(Language3).click();
	    	System.out.println("Successfully Marathi Language is Selected");
	    }
	}