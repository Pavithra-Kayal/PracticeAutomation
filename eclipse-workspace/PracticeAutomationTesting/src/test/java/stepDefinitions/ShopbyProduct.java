package stepDefinitions;

import Pages.PageSlideCheck;
import Utils.PageObjectUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopbyProduct {
	TestContext context;
	PageObjectUtils pageObjectUtils;
	PageSlideCheck slideCheck;	 
	 

	public ShopbyProduct(TestContext context) {
		
		this.context = context;
		this.pageObjectUtils = this.context.pageObjectUtils;
		this.slideCheck = this.context.pageObjectManager.getHomeSlider();
		
	}
	 
	@Given("^Open the Practice Automation Testing page$")
	    public void open_the_practice_automation_testing_page() throws Throwable {
			pageObjectUtils.openLandingPage(); 
	    }

	@When("^Click on the shop menu for different product$")
    public void click_on_the_shop_menu_for_different_product() throws Throwable {
    		slideCheck.clickShop();
	    }

	@Then("^click any of the product links available in the product category \"([^\"]*)\"$")
	    public void click_any_of_the_product_links_available_in_the_product_category_something(String strArg1) throws Throwable {
			context.pageObjectManager.getProductCategory().selectProductCategory(strArg1);
	    }

	@Then("^User can view only that particular product \"([^\"]*)\"$")
	    public void user_can_view_only_that_particular_product_something(String strArg1) throws Throwable {
			context.pageObjectManager.getProductCategory().verifyProductCategory(strArg1);
	    }

}



