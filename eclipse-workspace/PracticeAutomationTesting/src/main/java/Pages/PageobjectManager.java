package Pages;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	WebDriver driver;
	PageSlideCheck  HPageSlider;
	PriceFilter priceSlider;
	ShopbyProduct shopProductCate;
	SortbyPopularity sortByPopularity;
	ReadMoreFunctionality readMorefun;
	ShopSaleFunctionality shopSalePro;
	
	
	
	public PageobjectManager (WebDriver driver) {
		this.driver = driver;
	}
	
	public PageSlideCheck getHomeSlider() {
		HPageSlider = new PageSlideCheck(driver);
		return HPageSlider ;
	
	}

	public PriceFilter getPriceSlider() {
		priceSlider = new PriceFilter(driver);
		return priceSlider;
	}
	
	public ShopbyProduct getProductCategory() {
		
		shopProductCate = new ShopbyProduct(driver);
		return shopProductCate;
		
	}
	
	public SortbyPopularity sortByPopularity() {
		
		sortByPopularity = new SortbyPopularity(driver);
		return sortByPopularity;
		
	}
	
	public ReadMoreFunctionality getReadMoreFun() {
		
		readMorefun = new ReadMoreFunctionality(driver);
		return readMorefun;
		
	}
	
   public ShopSaleFunctionality getShopSalePro() {
	    shopSalePro = new ShopSaleFunctionality(driver);
		return shopSalePro;
		
	}
}

