package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Media_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

}
