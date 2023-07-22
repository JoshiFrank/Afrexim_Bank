package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Contactus_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Contactus_steps {
	
	//Find a Branch option
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_OurBank_Contactus_pages fp;
	
	@When("Click Contact us page")
	public void click_contact_us_page() {
		
		fp.Click_Contactus_page();
	   
	}

	@Then("Validate Contact us page")
	public void validate_contact_us_page() {
		
		fp.Validate_Contactus_page();
	  
	}

	@Then("Click Read more in Find Branch")
	public void click_read_more_in_find_branch() {
		
		fp.Click_Read_more_FindBranch();
	    
	}

	@Then("Validate Find a Branch page is displayed")
	public void validate_find_a_branch_page_is_displayed() throws InterruptedException {
		
		fp.Validate_Find_Branch_pageisdisplayed();
		
		
		
		Thread.sleep(3000);
	    
	}

}
