package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Aboutus_pages;
import com.Afrexim.pages.Afrexim_OurBank_Careers_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Aboutus_Steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_OurBank_Aboutus_pages ap;

	@When("To click the Our Bank Option")
	public void to_click_the_our_bank_option() {

		ap.To_click_the_Our_Bank_Option();

	}

	@When("To Select the About Us Functionality")
	public void to_select_the_about_us_functionality() {

		ap.To_Select_the_About_Us_Functionality();

	}

	@Then("To validate the About us page")
	public void to_validate_the_about_us_page() {

		ap.To_validate_the_About_us_page();

	}

	@When("To scroll down the entire page")
	public void to_scroll_down_the_entire_page() throws AWTException {
		ap.To_scroll_down_the_entire_page();
	}

	@When("To click the Read more option in Corporate Governance")
	public void to_click_the_read_more_option_in_corporate_governance() {

		ap.Click_Read_more_option_in_Corporate_Governance();

	}

	@Then("Validate the Corporate Governance page")
	public void validate_the_corporate_governance_page() throws InterruptedException {

		ap.Validate_the_Corporate_Governance_page();

		
		
		Thread.sleep(4000);
		
	}
	
	
}
	

	

