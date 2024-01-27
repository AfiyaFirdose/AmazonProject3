package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLaunch {
	WebDriver driver;

	By NewLaunchTab = By.xpath("//*[@id=\"navSwmHoliday\"]/a");
	By NewSmartPhone = By.xpath("//*[@id=\"sobe_d_b_4_1\"]/a/div/img");
	By NewLaptopLaunch = By.xpath("//*[@id=\"sobe_d_b_5_1\"]/a/div/img");

	public NewLaunch(WebDriver d) {
		driver = d;
	}

	public void NewLaunchTab() {
		driver.findElement(NewLaunchTab).click();
		System.out.println("Successfully Landed on New Launch in Electronics Page");
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

	public void NewSmartPhone() {
		driver.findElement(NewSmartPhone).click();
		System.out.println("Successfully Landed on New Smart Phone Page");
		System.out.println(driver.getTitle());
		driver.navigate().back();

	}

	public void NewLaptopLaunch() {
		driver.findElement(NewLaptopLaunch).click();
		System.out.println("Successfully Landed on New Laptop Launch Page");
		System.out.println(driver.getTitle());

	}

}

