package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Contactus_Givefeedback_pages;
import com.Afrexim.pages.Afrexim_OurBank_Contactus_Sendmessage_pages;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Contactus_Sendmessage_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_OurBank_Contactus_Sendmessage_pages gp;
	
	
	@Then("Click Readmore option in send us a message")
	public void click_readmore_option_in_send_us_a_message() {
		
		gp.Click_Readmoreoption_sendusamessage();
	    
	}

	@Then("Validate Send us a message")
	public void validate_send_us_a_message() {
		
		gp.Validate_Sendusamessage();
	    
	}
	
	@Then("Select Entity title")
	public void select_entity_title() {
		
		gp.Select_Entitytitle(3);
	    
	}

	@Then("Select interested in")
	public void select_interested_in() {
		
		gp.Select_interestedin(3);
	    
	}

	@Then("Type company name {string}")
	public void type_company_name(String companyname) {
		
		gp.Type_companyname(companyname);
	    
	}


	@Then("Select title name")
	public void select_title_name() {
		
		gp.Select_titlename(2);
	    
	}

	@Then("Enter first and last names {string}")
	public void enter_first_and_last_names(String names) {
		
		gp.Enter_firstlastnames(names);
	    
	}

	@Then("Enter telephone with area code {string}")
	public void enter_telephone_with_area_code(String number) throws InterruptedException {
		
		Thread.sleep(2000);
		
		gp.Enter_telephoneareacode(number);
	    
	}

	@Then("Enter email address functionality {string}")
	public void enter_email_address_functionality(String string) {
	    
		gp.Enter_emailaddress(string);
	}

	@Then("Enter function {string}")
	public void enter_function(String function) {
		
		gp.Enter_function(function);
	    
	}

	@Then("Enter organisation {string}")
	public void enter_organisation(String string) {
		
		gp.Enter_organisation(string);
	    
	}

	@Then("Enter country of operation {string}")
	public void enter_country_of_operation(String string) {
	    
		gp.Enter_countryofoperation(string);
		
	}

	@Then("Enter requests here {string}")
	public void enter_requests_here(String string) {
		
		
		gp.Enter_requestshere(string);
	    
	}


	@Then("Click confirm check box")
	public void click_confirm_check_box() throws InterruptedException {
	    
		Thread.sleep(2000);
		
		gp.Click_confirmcheckbox();
	}

	@Then("click robot check box")
	public void click_robot_check_box() throws InterruptedException, AWTException {
	    
		
		gp.click_robotcheckbox();
	}
	
	@Then("Click Submit button option")
	public void click_submit_button_option() {
	    
		
		gp.Click_Submitbuttonoption();
	}


	@Then("Validate Submission Confirmation page")
	public void validate_submission_confirmation_page() {
	    
		
		gp.Validate_SubmissionConfirmationpage();
	}


}
