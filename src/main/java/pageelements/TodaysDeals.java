package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysDeals {
	WebDriver driver;

	By SeeAllDeals = By.xpath("//*[@id=\"CardInstanceslf8eWHi2Iw005AU9n0SsA\"]/div[1]/a");
	By DealsOnFootwear = By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[9]/a/span[1]/img");
	By DealOfDay = By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[1]/img");
	By Clothing = By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[8]/a/span[1]/img");

	public TodaysDeals(WebDriver d) {
		driver = d;

	}

	public void SeeAllDeals() {
		driver.findElement(SeeAllDeals).click();
		System.out.println("Successfully Launched Today's Deals Page");
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void DealsOnFootwear() {
		driver.findElement(DealsOnFootwear).click();
		System.out.println("Successfully Launched Today's Deals On Footwear Page");
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void DealOfDay() {
		driver.findElement(DealOfDay).click();
		System.out.println("Successfully Launched Today's Deal Of The Day Page");
		System.out.println(driver.getTitle());
		driver.navigate().back();
    }
	public void Clothing() {
		driver.findElement(Clothing).click();
		System.out.println("Successfully Launched Today's Deal On Clothing Page");
		System.out.println(driver.getTitle());
		
	}
	

}
