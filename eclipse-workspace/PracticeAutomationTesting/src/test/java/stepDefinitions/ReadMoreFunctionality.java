package stepDefinitions;

import Pages.PageSlideCheck;
import Utils.PageObjectUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadMoreFunctionality {
	TestContext context;
	PageObjectUtils pageObjectUtils;
	PageSlideCheck slideCheck;	 
	 
	//Dependency Injection through Constructor
	public ReadMoreFunctionality(TestContext context) {
		
		this.context = context;
		this.pageObjectUtils = this.context.pageObjectUtils;
		this.slideCheck = this.context.pageObjectManager.getHomeSlider();
		
	}

	@Given("^Open the Practice automation landing page$")
    public void open_the_practice_automation_landing_page() throws Throwable {
		pageObjectUtils.openLandingPage();
    }

    @When("^Ckick on the Shop menu$")
    public void ckick_on_the_shop_menu() throws Throwable {
    	slideCheck.clickShop();
    }

    @Then("^Click on the read more button in the home page$")
    public void click_on_the_read_more_button_in_the_home_page() throws Throwable {
    	context.pageObjectManager.getReadMoreFun().checkOutofStock();
    }

    @Then("^Read more options indicates the Out of Stock$")
    public void read_more_options_indicates_the_out_of_stock() throws Throwable {
    	context.pageObjectManager.getReadMoreFun().productOutofStock();
    }

    @Then("^User cannot add the product which has read more option as it was out of stock$")
    public void user_cannot_add_the_product_which_has_read_more_option_as_it_was_out_of_stock() throws Throwable {
    	context.pageObjectManager.getReadMoreFun().productOutofStock(); 
    }

}
