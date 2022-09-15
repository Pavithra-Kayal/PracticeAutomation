package stepDefinitions;

import Pages.PageSlideCheck;
import Utils.PageObjectUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortbyPopularity {
	
	TestContext context;
	PageObjectUtils pageObjectUtils;
	PageSlideCheck slideCheck;	 
	 
	//Dependency Injection through Constructor
	public SortbyPopularity(TestContext context) {
		
		this.context = context;
		this.pageObjectUtils = this.context.pageObjectUtils;
		this.slideCheck = this.context.pageObjectManager.getHomeSlider();
		
	}
 

	 @Given("^Open the Practice Automation Landing page$")
	    public void open_the_practice_automation_landing_page() throws Throwable {
		 pageObjectUtils.openLandingPage();
	    }

	 @When("^Click on the shop menu for popular products$")
	    public void click_on_the_shop_menu_for_popular_products() throws Throwable {
		 slideCheck.clickShop();
	    }

	 @Then("^Click on \"([^\"]*)\" item in default sorting dropdown$")
	    public void click_on_something_item_in_default_sorting_dropdown(String strArg1) throws Throwable {
		 context.pageObjectManager.sortByPopularity().sortByPopularPro(strArg1);
	    }

	 @Then("^Now user can view the popular products only$")
	    public void now_user_can_view_the_popular_products_only() throws Throwable {
		 context.pageObjectManager.sortByPopularity().viewByPopularity();
	    }

}
