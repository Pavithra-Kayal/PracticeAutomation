package stepDefinitions;

import Pages.PageSlideCheck;
import Utils.PageObjectUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopSaleFunctionality {
	
	TestContext context;
	PageObjectUtils pageObjectUtils;
	PageSlideCheck slideCheck;	 
	 
	//Dependency Injection through Constructor
	public ShopSaleFunctionality(TestContext context) {
		
		this.context = context;
		this.pageObjectUtils = this.context.pageObjectUtils;
		this.slideCheck = this.context.pageObjectManager.getHomeSlider();
		
	}

	@Given("^Open the Practice Automation testing page$")
    public void open_the_practice_automation_testing_pabe() throws Throwable {
		pageObjectUtils.openLandingPage();
    }

	@When("^Click on the Shop menu for price details$")
    public void click_on_the_shop_menu_for_price_details() throws Throwable {
    	slideCheck.clickShop();
    }

    @Then("^Click on Sale written product in home page$")
    public void click_on_sale_written_product_in_home_page() throws Throwable {
    	context.pageObjectManager.getShopSalePro().getSaleProduct();
    }

    @Then("^User can clearly view the actual price with old price striken for the sale written products$")
    public void user_can_clearly_view_the_actual_price_with_old_price_striken_for_the_sale_written_products() throws Throwable {
    	 context.pageObjectManager.getShopSalePro().verifyOldAndSalePrice();
    }
}
