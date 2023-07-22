package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_dropdown_pages;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_dropdown_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_OurBank_dropdown_pages dp;
	
	@Then("To validate Our Bank dropdown")
	public void to_validate_our_bank_dropdown() {
	    
	}
	

}
