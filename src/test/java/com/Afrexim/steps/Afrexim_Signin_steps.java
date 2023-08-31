package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Afrexim.pages.Afrexim_Signin_pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Signin_steps {

	@Managed
	WebDriver driver;

	@Steps

	Afrexim_Signin_pages sp;

	@Given("To open the Afrexim application")
	public void to_open_the_afrexim_application() {

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.afreximbank.com/");

		driver.manage().window().maximize();

	}

	@When("To click the Apply for facility option")
	public void to_click_the_apply_for_facility_option() {

		sp.Click_applyfacility();

	}

	@When("To enter username {string}")
	public void to_enter_username(String name) {

		sp.Enter_username(name);

	}

	@When("To enter password {string}")
	public void to_enter_password(String password) {

		sp.Enter_password(password);

	}

	@When("To click Sign in button")
	public void to_click_sign_in_button() {

		sp.Click_Signinbutton();

	}

	@Then("Application should show error credentials")
	public void application_should_show_error_credentials() throws InterruptedException {

		sp.Verify_error_credentials_page();

	}
	
	
	//--------------------------------------------------------------------------------------------------
	
	
	//Afrexim bank products brouchers
	
	
	
	
	
	
	
	
	@When("Click Afreximbank Products brouchers")
	public void click_afreximbank_products_brouchers() {
		
		sp.click_afreximbank_products_brouchers();
	    
	}

	@Then("Validate Afreximbank Products brouchers page")
	public void validate_afreximbank_products_brouchers_page() {
		
		sp.validate_afreximbank_products_brouchers_page();
	    
	}

	@Then("Click Load more in brouchers page")
	public void click_load_more_in_brouchers_page() throws InterruptedException {
		
		sp.click_loadmore_brouchers_page();
	    
	}

	@Then("Click The Afreximbanker newsletter Edition two")
	public void click_the_afreximbanker_newsletter_edition_two() {
		
		sp.click_afreximbanker_newsletter_edition_two();
	    
	}

	@Then("Validate The Afreximbanker newsletter Edition two")
	public void validate_the_afreximbanker_newsletter_edition_two() throws InterruptedException {
		
		sp.validate_afreximbanker_newsletter_edition_two();
	    
	}

	@Then("Click right arrow in brouchers page")
	public void click_right_arrow_in_brouchers_page() throws InterruptedException, AWTException {
		
		sp.click_rightarrow_brouchers_page();
	    
	}

	@When("Click African Quality Assurance centres")
	public void click_african_quality_assurance_centres() {
		
		sp.click_africanquality_assurancecentres();
	    
	}

	@Then("Validate African Quality Assurance centres page")
	public void validate_african_quality_assurance_centres_page() {
		
		sp.validate_africanquality_assurancecentres_page();
	    
	}
	
	
	
	
	
	
	
	
	
	
	

}
