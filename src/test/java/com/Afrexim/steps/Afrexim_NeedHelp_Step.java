package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_NeedHelp_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_NeedHelp_Step {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_NeedHelp_Pages nhp;

    @When("Mouse-hover to Need help and click Submit your request")
    public void mouse_hover_to_need_help_and_click_submit_your_request() throws AWTException, InterruptedException {
    	
    	nhp.Click_Submit_Request();
    
	}
    

	@When("Select Entity")
	public void select_entity() {

		nhp.Select_Entity();

	}

	@When("Select Oppurtunities")
	public void select_oppurtunities() {
		
		nhp.Select_Oppurtunities();

	}

	@When("Type request {string}")
	public void type_request(String string) {
		
		nhp.Type_request(string);

	}

	@When("Select prefix title")
	public void select_prefix_title() {
		
		nhp.Select_prefix_title(5);

	}

	@When("Enter first name {string}")
	public void enter_first_name(String firstname) {
		
		nhp.Type_first_name(firstname);

	}

	@When("Enter last name {string}")
	public void enter_last_name(String lastname) {
		
		nhp.Type_Last_Name(lastname);

	}

	@When("Type the function {string}")
	public void type_the_function(String function) {
		
		nhp.Type_Function(function);

	}

	@When("Type organisation {string}")
	public void type_organisation(String organisation) {
		
		nhp.Type_organisation(organisation);

	}

	@When("Type country of operation {string}")
	public void type_country_of_operation(String country) {
		
		nhp.Type_country_of_operation(country);

	}

	@When("Type email {string}")
	public void type_email(String email) {
		
		nhp.Type_email(email);

	}

	@When("Type phone {string}")
	public void type_phone(String phone) {
		
		nhp.Type_phone(phone);

	}

	@When("Click Submit button")
	public void click_submit_button() {
		
		nhp.Click_submit_button();

	}

	@Then("Verify Thanks for contacting us page")
	public void verify_thanks_for_contacting_us_page() {
		
		nhp.Verify_thanks_for_contacting_page();

	}
}
