package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectStorage {
	WebDriver driver;
	
	By FourGbStorage = By.xpath("//*[@id=\"p_n_feature_twenty-nine_browse-bin/44349050031\"]/span/a/span");
	By EightGbStorage = By.xpath("//*[@id=\"p_n_feature_twenty-nine_browse-bin/44349047031\"]/span/a/div/label/i");
	By SixteenGbStorage = By.xpath("//*[@id=\"p_n_feature_twenty-nine_browse-bin/44349052031\"]/span/a/div/label/i");
	
	public SelectStorage(WebDriver d) {
		driver = d;
		
	}
	public void FourGbStorage() {
		driver.findElement(FourGbStorage).click();
		System.out.println("4 Gb Storage is Selected");
	}
    public void EightGbStorage() {
    	driver.findElement(EightGbStorage).click();
    	System.out.println("8 Gb Storage is Selected");
    }
    public void SixteenGbStorage() {
    	driver.findElement(SixteenGbStorage).click();
    	System.out.println("16 Gb Storage is Selected");
    }
}


