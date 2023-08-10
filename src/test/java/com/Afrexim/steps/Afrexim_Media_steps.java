package com.Afrexim.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Afrexim.pages.Afrexim_Media_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Media_steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_Media_pages mp;

	@When("To click the Media option")
	public void to_click_the_media_option() {

		mp.click_Mediaoption();

	}

	@Then("To validate the media dropdown")
	public void to_validate_the_media_dropdown() {

		mp.validate_mediadropdown();

	}

	// news option

	@When("To click the news option")
	public void to_click_the_news_option() {

		mp.click_newsoption();

	}

	@Then("To validate the News Articles page")
	public void to_validate_the_news_articles_page() {

		mp.validate_NewsArticlespage();

	}

	@Then("To click right arrow and check whether years from twenty- twenty three to twenty-eight are present")
	public void to_click_right_arrow_and_check_whether_years_from_twenty_twenty_three_to_twenty_eight_are_present()
			throws InterruptedException {

		mp.validate_rightarrow_yearspresent();

	}

	@Then("To click and check left arrow")
	public void to_click_and_check_left_arrow() throws InterruptedException {

		mp.click_check_leftarrow();

	}

	@Then("To click twenty-twenty three year")
	public void to_click_twenty_twenty_three_year() {

		mp.click_twentytwentythreeyear();

	}

	@Then("Scroll down and click Load more")
	public void scroll_down_and_click_load_more() throws InterruptedException {

		Thread.sleep(3000);
		mp.Scrolldown_clickLoadmore();
	}

	@Then("Validate twenty-twenty three news results")
	public void validate_twenty_twenty_three_news_results() {

		mp.Validate_twentytwentythree_newsresults();

	}

	@Then("To click twenty-twenty two year")
	public void to_click_twenty_twenty_two_year() {

		mp.click_twentytwentytwoyear();
	}

	@Then("Validate twenty-twenty two news results")
	public void validate_twenty_twenty_two_news_results() {

		mp.Validate_twentytwentytwo_newsresults();
	}

	@Then("To click twenty-twenty one year")
	public void to_click_twenty_twenty_one_year() {

		mp.click_twentytwentyoneyear();

	}

	@Then("Validate twenty-twenty one news results")
	public void validate_twenty_twenty_one_news_results() {

		mp.Validate_twentytwentyone_newsresults();

	}

	@Then("To click twenty-twenty year")
	public void to_click_twenty_twenty_year() {

		mp.click_twentytwentyyear();

	}

	@Then("Validate twenty-twenty news results")
	public void validate_twenty_twenty_news_results() {

		mp.Validate_twentytwenty_newsresults();
	}

	@Then("To click twenty-nineteen year")
	public void to_click_twenty_nineteen_year() {

		mp.click_twentynineteen_year();
	}

	@Then("Validate twenty-nineteen news results")
	public void validate_twenty_nineteen_news_results() {

		mp.Validate_twentynineteen_newsresults();

	}

	@Then("To click twenty-eighteen year")
	public void to_click_twenty_eighteen_year() {

		mp.click_twentyeighteen_year();
	}

	@Then("Validate twenty-eighteen news results")
	public void validate_twenty_eighteen_news_results() {

		mp.Validate_twentyeighteen_newsresults();

	}

	@Then("To click twenty-seventeen year")
	public void to_click_twenty_seventeen_year() {

		mp.click_twentyseventeen_year();

	}

	@Then("Validate twenty-seventeen news results")
	public void validate_twenty_seventeen_news_results() {

		mp.Validate_twentyseventeen_newsresults();

	}

	@Then("To click twenty-sixteen year")
	public void to_click_twenty_sixteen_year() {

		mp.click_twentysixteen_year();

	}

	@Then("Validate twenty-sixteen news results")
	public void validate_twenty_sixteen_news_results() {

		mp.Validate_twentysixteen_newsresults();

	}

	@Then("To click twenty-fifteen year")
	public void to_click_twenty_fifteen_year() {

		mp.click_twentyfifteenyear();

	}

	@Then("Validate twenty-fifteen news results")
	public void validate_twenty_fifteen_news_results() {

		mp.Validate_twentyfifteen_newsresults();

	}

	@Then("To click twenty-fourteen year")
	public void to_click_twenty_fourteen_year() {

		mp.click_twentyfourteenyear();

	}

	@Then("Validate twenty-fourteen news results")
	public void validate_twenty_fourteen_news_results() {

		mp.Validate_twentyfourteen_newsresults();

	}

	@Then("To click twenty-thirteen year")
	public void to_click_twenty_thirteen_year() {

		mp.click_twentythirteenyear();

	}

	@Then("Validate twenty-thirteen news results")
	public void validate_twenty_thirteen_news_results() {

		mp.Validate_twentythirteen_newsresults();

	}

	@Then("To click twenty-twelve year")
	public void to_click_twenty_twelve_year() {

		mp.click_twentytwelveyear();
	}

	@Then("Validate twenty-twelve news results")
	public void validate_twenty_twelve_news_results() {

		mp.Validate_twentytwelve_newsresults();
	}

	@Then("To click twenty-eleven year")
	public void to_click_twenty_eleven_year() {

		mp.click_twentyelevenyear();
	}

	@Then("Validate twenty-eleven news results")
	public void validate_twenty_eleven_news_results() {

		mp.Validate_twentyeleven_newsresults();
	}

	@Then("To click twenty-ten year")
	public void to_click_twenty_ten_year() {
		
		mp.click_twentyten_year();
	}

	@Then("Validate twenty-ten news results")
	public void validate_twenty_ten_news_results() {
		
		mp.Validate_twentyten_newsresults();
	}

	@Then("To click twenty-nine year")
	public void to_click_twenty_nine_year() {
		
		mp.click_twentynineyear();
	}

	@Then("Validate twenty-nine news results")
	public void validate_twenty_nine_news_results() {
		
		
		mp.Validate_twentynine_newsresults();
	}

	@Then("To click twenty-eight year")
	public void to_click_twenty_eight_year() {
		
		
		mp.click_twentyeightyear();
	}

	@Then("Validate twenty-eight news results")
	public void validate_twenty_eight_news_results() 
	{
		mp.Validate_twentyeight_newsresults();
	}
	
	
	
	
	// To validate the Press Releases Functionalty
	//----------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	

@When("To click the Press Releases link")
public void to_click_the_press_releases_link() {
    
	mp.click_press_releases_link();
	
	
	
}

@When("TO click the first link")
public void to_click_the_first_link() throws InterruptedException {
    
	
	
	Thread.sleep(3000);
	mp.click_the_first_link();
	
}

@Then("Validate the first link details should be displayed")
public void validate_the_first_link_details_should_be_displayed() throws InterruptedException {
    
	Thread.sleep(2000);
	
	mp.validate_the_first_link_details();
	
}

@When("To click the second link")
public void to_click_the_second_link() throws InterruptedException {
    
	
	Thread.sleep(3000);
	mp.click_the_second_link();
	
}

@Then("Validate the second link details should be displayed")
public void validate_the_second_link_details_should_be_displayed() throws InterruptedException {
    
	
	Thread.sleep(2000);
	
	mp.validate_the_second_link_details();
	
}

@When("To click third link")
public void to_click_third_link() throws InterruptedException {
    
	
	Thread.sleep(3000);
	mp.click_third_link();
	
}

@Then("Validate the third link details should be displayed")
public void validate_the_third_link_details_should_be_displayed() throws InterruptedException {
    
	Thread.sleep(2000);
	
	mp.validate_the_third_link();
	
	
}

@When("To click fourth link")
public void to_click_fourth_link() throws InterruptedException {
    
	Thread.sleep(3000);
	mp.click_fourth_link();
	
}

@Then("Validate the fourth link details should be displayed")
public void validate_the_fourth_link_details_should_be_displayed() throws InterruptedException {
    
	Thread.sleep(2000);
	mp.validate_the_fourth_link();
	
}

@When("To click fifth link")
public void to_click_fifth_link() throws InterruptedException {
    
	Thread.sleep(3000);
	mp.click_fifth_link();
	
}

@Then("Validate the fifth link details should be displayed")
public void validate_the_fifth_link_details_should_be_displayed() {
    
	
	mp.validate_the_fifth_link();
	
	
}

@When("To click sixth link")
public void to_click_sixth_link() throws InterruptedException {
   
	Thread.sleep(3000);
	mp.click_sixth_link();
}

@Then("Valiadate the sixth link details should be displayed")
public void valiadate_the_sixth_link_details_should_be_displayed() {
    
	mp.valiadate_the_sixth_link();
	
}

@When("To click seventh link")
public void to_click_seventh_link() throws InterruptedException {
   
	Thread.sleep(3000);
	mp.click_seventh_link();
	
}

@Then("Validate the seventh link details should be displayed")
public void validate_the_seventh_link_details_should_be_displayed() {
    
	mp.validate_the_seventh_link_details();
	
	
}

@When("To click Eighth link")
public void to_click_Eighth_link() throws InterruptedException {
    
	
	Thread.sleep(3000);
	mp. click_Eighth_link();
	
	
}

@Then("Validate the Eighth link details should be displayed")
public void validate_the_Eighth_link_details_should_be_displayed() {
    
	
	mp.validate_the_Eighth_link_details();
	
}

@When("To click nineth link")
public void to_click_nineth_link() throws InterruptedException {
	Thread.sleep(3000);
	mp.click_nineth_link();
	
}

@Then("Validate the nineth link details should be displayed")
public void validate_the_nineth_link_details_should_be_displayed() {
    
	mp.validate_the_nineth_link_details();
	
	
}

@When("To click tenth link")
public void to_click_tenth_link() throws InterruptedException {
    
	
	Thread.sleep(3000);
	mp.click_tenth_link();
	
}

@Then("Validate the tenth link details should be displayed")
public void validate_the_tenth_link_details_should_be_displayed() {
    
	mp.validate_the_tenth_link();
	
}

@When("To click Eleventh link")
public void to_click_eleventh_link() throws InterruptedException {
  
	
	Thread.sleep(3000);
	mp.click_eleventh_link();
	
	
}

@Then("Validate the eleventh link details should be displayed")
public void validate_the_eleventh_link_details_should_be_displayed() {
    
	mp.validate_the_eleventh_link();
	
}

@When("To click Twelth link")
public void to_click_twelth_link() throws InterruptedException {
    Thread.sleep(3000);
	mp.click_twelth_link();
	
	
}

@Then("Valiadate the  Twelth link details should be displayed")
public void valiadate_the_twelth_link_details_should_be_displayed() {
    
	
	mp.valiadate_the_twelth_link_details();
	
}

//-----------------------------------------------------------------------------------------------------------------

//validate the Insights functionalty



@When("To click the Insights link")
public void to_click_the_insights_link() throws InterruptedException {
	
	mp.click_the_insights_link();
   
}
@When("To click link in Insights page")
public void to_click_link_in_insights_page() {
	
	mp.click_link_in_insights();
    
}
@Then("Validate the trade page")
public void validate_the_trade_page() {
	
	
	mp.validate_the_trade_page();
    
}

	
	
	
	
	
	
	
	

}
