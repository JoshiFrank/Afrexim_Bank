package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Productsandservices_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Productsandservices_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_Productsandservices_pages pp;
	
	@When("To click Products and services option")
	public void to_click_products_and_services_option() {
		
		pp.Toclick_Productsandservicesoption();
	    
	}

	@When("To click Who we serve option")
	public void to_click_who_we_serve_option() {
		
		pp.Toclick_Whoweserveoption();
	    
	}

	@Then("Validate Who we serve page")
	public void validate_who_we_serve_page() {
		
		pp.Validate_Whoweservepage();
	    
	}

	@Then("Click Readmore in Large Corporates option")
	public void click_readmore_in_large_corporates_option() {
		
		pp.Click_Readmore_LargeCorporates();
	    
	}

	@Then("Validate Large corporates page")
	public void validate_large_corporates_page() {
		
		pp.Validate_Largecorporatespage();
	    
	}
	
	
	
	
	
	
	// Goverments
	
	
	
	
	
	@Then("Click Readmore in Governments option")
	public void click_readmore_in_governments_option() {
	  
		
		
	}

	@Then("Validate Governments page")
	public void validate_governments_page() {
	  
		
		
	}
	
	

}
