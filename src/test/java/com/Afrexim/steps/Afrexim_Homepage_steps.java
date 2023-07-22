package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Homepage_pages;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Homepage_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_Homepage_pages hp;
	
	@Then("To validate the Afrexim bank Logo")
	public void to_validate_the_afrexim_bank_logo() {
	    
		hp.validate_AfreximbankLogo();
	}
	
	//Afrexim homepage options
	
	@Then("Validate the required Homepage options")
	public void validate_the_required_homepage_options() {
		
		hp.Validate_requiredHomepageoptions();
	    
	}

}


