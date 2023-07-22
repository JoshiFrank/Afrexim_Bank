package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Contactus_Givefeedback_pages;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Contactus_Givefeedback_steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_OurBank_Contactus_Givefeedback_pages ccp;

	@Then("Click Read more in Give us a Feedback")
	public void click_read_more_in_give_us_a_feedback() {
		
		ccp.Click_Read_more_GiveFeedback();
		
	}

	@Then("Validate Give us a feedback page")
	public void validate_give_us_a_feedback_page() {
		
		ccp.Validate_Giveusafeedbackpage();
		
	}

	@Then("Enter organization name {string}")
	public void enter_organization_name(String orgname) {
		
		ccp.Enter_organizationname(orgname);
	    
	}

	@Then("Select Title")
	public void select_title() {
		
		ccp.Select_Title(3);
		
	}

	@Then("Enter Full Contact name {string}")
	public void enter_full_contact_name(String name) {
		
		ccp.Enter_FullContactname(name);
	    
	}

	@Then("Enter contact number with country code {string}")
	public void enter_contact_number_with_country_code(String number) {
		
		ccp.Enter_contactnumber(number);
	    
	}

	@Then("Enter email address {string}")
	public void enter_email_address(String email) throws InterruptedException {
		
		ccp.Enter_emailaddress(email);
	    
	}


	@Then("Enter confirm email address {string}")
	public void enter_confirm_email_address(String confirmemail) {
		
		ccp.Enter_confirmemailaddress(confirmemail);
	   
	}
	@Then("Select country name")
	public void select_country_name() {
		
		ccp.Select_countryname(5);
		
	}

	@Then("Click existing customer")
	public void click_existing_customer() {
		
		ccp.Click_existingcustomer();
		
	}

	@Then("Click preferred contact method")
	public void click_preferred_contact_method() {
		
		ccp.Click_preferred_contactmethod();
	}

	@Then("Enter preferred contact {string} {string} time")
	public void enter_preferred_contact_time(String fromtime, String totime) {
		
		ccp.Enter_preferred_contacttime(fromtime,totime,1);
	    
	}

	@Then("Select feedback type")
	public void select_feedback_type() {
		
		ccp.Select_feedback_type(3);
		
	}

	@Then("Enter comments {string}")
	public void enter_comments(String comments) {
		
		ccp.Enter_comments(comments);
	    
	}

	@Then("Click consent agree box")
	public void click_consent_agree_box() {
		
		ccp.Click_consent_agreebox();
		
	}

	@Then("Click submit")
	public void click_submit() {
		
		ccp.Click_submit();
		
	}

	@Then("Validate Thanks for contacting us page")
	public void validate_thanks_for_contacting_us_page() {
		
		ccp.Validate_Thanksforcontactingus_page();
		
	}

}
