package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortbyPopularity {

WebDriver driver;
	
	
	By productSort = By.xpath("//select[@name='orderby']");

	public SortbyPopularity(WebDriver driver) {
		this.driver= driver; 
	}
	public void sortByPopularPro(String productName) {
		
		String proName = productName;
		WebElement proSort= driver.findElement(productSort);
		Select popularPro = new Select(proSort);
		popularPro.selectByVisibleText(proName);
		
		
		
	}
	
	
	public void viewByPopularity() {
		
		String currentURL = driver.getCurrentUrl();
        assertTrue(currentURL.contains("orderby=popularity"));
        
	}

}
