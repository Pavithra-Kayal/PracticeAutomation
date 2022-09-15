package stepDefinitions;

import Pages.PageSlideCheck;

import Utils.PageObjectUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterByPrice {
	
	TestContext context;
	PageObjectUtils pageObjectUtils;
	PageSlideCheck slideCheck;	 
	 
	//Dependency Injection through Constructor
	public FilterByPrice(TestContext context) {
		
		this.context = context;
		this.pageObjectUtils = this.context.pageObjectUtils;
		this.slideCheck = this.context.pageObjectManager.getHomeSlider();
		
	}
	
	 @Given("^User should be on Practice Automation Testing Testcases page$")
	    public void user_should_be_on_practice_automation_testing_testcases_page() {
		 pageObjectUtils.openLandingPage(); 
	   
	}
	 @When("^User clicks on the shop menu$")
	    public void user_clicks_on_the_shop_menu() throws Throwable {
		
		 slideCheck.clickShop();
	   
	}
	 @Then("^Adjust the filter by price range between rupees \"([^\"]*)\" to \"([^\"]*)\"$")
	    public void adjust_the_filter_by_price_range_between_rupees_something_to_something(String strArg1, String strArg2) throws Throwable {
		 context.pageObjectManager.getPriceSlider().FilterPrice(Integer.valueOf(strArg1), Integer.valueOf(strArg2));
	}
	 @Then("^Click on the Filter button$")
	    public void click_on_the_filter_button() throws Throwable{
		 context.pageObjectManager.getPriceSlider().FilterButton();
	}
	    @Then("^User should view books only between the range \"([^\"]*)\" to \"([^\"]*)\"$")
	    public void user_should_view_books_only_between_the_range_something_to_something(String strArg1, String strArg2)throws Throwable {
	    	context.pageObjectManager.getPriceSlider().BooksPrice(Integer.valueOf(strArg1), Integer.valueOf(strArg2)); 
	}

}