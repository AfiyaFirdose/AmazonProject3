package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageelements.AboutUs;
import pageelements.BestSeller;
import pageelements.BirthDayStore;
import pageelements.ChangeCountry;
import pageelements.ChangeLanguage;
import pageelements.ChooseLocation;
import pageelements.ClickAllDropDown;
import pageelements.ClickOnSell;
import pageelements.ConnectWithUs;
import pageelements.FreshIcon;
import pageelements.HomePage;
import pageelements.NewLaunch;
import pageelements.SearchBar;
import pageelements.SelectBrand;
import pageelements.SelectCategory;
import pageelements.SelectElectronics;
import pageelements.SelectStorage;
import pageelements.TodaysDeals;

public class Amazon {
	WebDriver driver;

	@Test

	void homepage() throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getCurrentUrl());
			// Verify Amazon Home Page
			HomePage AmazonHomePage = new HomePage(driver);
			AmazonHomePage.VerifyAmazonHomePage();
			System.out.println("Successfully Landed on Amazon HomePage");
			// Search Bar and Search Button
			SearchBar SearchBar = new SearchBar(driver);
			SearchBar.SearchBar();
			SearchBar.SearchButton();
			System.out.println("Successfully Landed on Mobiles Search Page");
			// Select Brands
			SelectBrand SelectBrands = new SelectBrand(driver);
			SelectBrands.OnePlus();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectBrands.Realme();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectBrands.Samsung();
			System.out.println("Successfully Selected Brands");
			// Select Category
			SelectCategory SelectCategory = new SelectCategory(driver);
			SelectCategory.SmartPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectCategory.SmartandBasicsPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SelectCategory.BasicPhones();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Select Storage
			driver.get("https://www.amazon.in/");
			SearchBar.SearchBar();
			SearchBar.SearchButton();
			SelectStorage SelectStorage = new SelectStorage(driver);
			SelectStorage.FourGbStorage();
			SelectStorage.EightGbStorage();
			SelectStorage.SixteenGbStorage();
			// Fresh Icon
			driver.get("https://www.amazon.in/");
			FreshIcon FreshIcon = new FreshIcon(driver);
			FreshIcon.FreshIcon();
			FreshIcon.PinCode();
			FreshIcon.Apply();
			FreshIcon.FruitsCategory();
			FreshIcon.AddProducts1();
			FreshIcon.AddProducts2();
			FreshIcon.AdddProducts3();
			// Sell Page
			driver.get("https://www.amazon.in/");
			ClickOnSell ClickOnSell = new ClickOnSell(driver);
			ClickOnSell.VerifyAmazonHomePage();
			ClickOnSell.Sell();
			// Best Sellers
			BestSeller BestSellers = new BestSeller(driver);
			BestSellers.VerifyAmazonHomePage();
			BestSellers.BestSellers();
			// Electronics
			driver.get("https://www.amazon.in/");
			SelectElectronics SelectElectronics = new SelectElectronics(driver);
			SelectElectronics.VerifyAmazonHomePage();
			SelectElectronics.Electronics();
			SelectElectronics.Accessories();
			SelectElectronics.CameraAccessories();
			SelectElectronics.CameraFilm();
			SelectElectronics.SelectBrand();
			// Choose Location
			driver.get("https://www.amazon.in/");
			ChooseLocation ChooseLocation = new ChooseLocation(driver);
			ChooseLocation.Location();
			ChooseLocation.PinCode();
			ChooseLocation.Apply();
			// Click_AllDropDown
			ClickAllDropDown ClickAllDropDown = new ClickAllDropDown(driver);
			ClickAllDropDown.All();
			// ChangeLanguageIndia
			ChangeLanguage ChangeLanguageIndia = new ChangeLanguage(driver);
			ChangeLanguageIndia.Language1();
			ChangeLanguageIndia.Language2();
			ChangeLanguageIndia.Language3();
			// ChangeCountry
			ChangeCountry ChangeCountry = new ChangeCountry(driver);
			ChangeCountry.ChangeCountry();
			ChangeCountry.Country1();
			ChangeCountry.Country2();
			ChangeCountry.Country3();
			// BirthDayStore
			driver.get(url);
			BirthDayStore BirthDayStore = new BirthDayStore(driver);
			BirthDayStore.BirthdayDeals();
			BirthDayStore.BirthDayCards();
			BirthDayStore.Product1();
			// About Us
			driver.get(url);
			AboutUs AboutUs = new AboutUs(driver);
			AboutUs.FooterElement();
			AboutUs.AboutUs();
			AboutUs.Careers();
			// Connect With Us Page
			driver.get(url);
			ConnectWithUs ConnectWithUs = new ConnectWithUs(driver);
			ConnectWithUs.FooterElement();
			ConnectWithUs.Facebook();
			ConnectWithUs.Twitter();
			ConnectWithUs.Instagram();
			// New Launch Page
			driver.get(url);
			NewLaunch NewLaunch = new NewLaunch(driver);
			NewLaunch.NewLaunchTab();
			NewLaunch.NewSmartPhone();
			NewLaunch.NewLaptopLaunch();
			// Todays Deals Page
			driver.get(url);
			TodaysDeals TodaysDeals = new TodaysDeals(driver);
			TodaysDeals.SeeAllDeals();
			TodaysDeals.DealsOnFootwear();
			TodaysDeals.DealOfDay();
			TodaysDeals.Clothing();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


