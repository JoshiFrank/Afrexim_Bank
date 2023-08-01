package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Careers_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Careers_Steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_OurBank_Careers_pages cp;

	@When("Click the Careers link")
	public void click_the_careers_link() {

		cp.Click_the_Careers_link();

	}

	@Then("Validate the Careers page is Displayed")
	public void validate_the_careers_page_is_displayed() {

		cp.Validate_Careers_page_isDisplayed();

	}

	@When("Click the Check Vacancies Option")
	public void click_the_check_vacancies_option() {

		cp.Click_Check_Vacancies_Option();

	}

	@When("Select the type of the job in All Vacancies Dropdown")
	public void select_the_type_of_the_job_in_all_vacancies_dropdown() {

		cp.Select_typeofjob(0);

	}

	@When("select the job location in the location Dropdown")
	public void select_the_job_location_in_the_location_dropdown() {

		cp.select_joblocation(0);

	}

	@When("Select the Expected expiry limitation in limitation Dropdown")
	public void select_the_expected_expiry_limitation_in_limitation_dropdown() {

		cp.Select_expiry_limitation(0);

	}

	@When("Click the Filter Button")
	public void click_the_filter_button() {
		cp.Click_Filter_Button();
	}

	@Then("Validate the job search results")
	public void validate_the_job_search_results() throws InterruptedException {

		cp.Validate_jobsearchresults();

		Thread.sleep(3000);
	}

	@Then("Click desired job")
	public void click_desired_job() throws InterruptedException {

		cp.Click_desired_job(2);
	}

	@Then("Validate selected job details")
	public void validate_selected_job_details() throws InterruptedException {

		cp.Validate_selected_jobdetails();

		Thread.sleep(3000);
	}
	
	
	
	
	
	// Validate the Dropdowns of Vacancies
	//_________________________________________
	
	
	
	
	@When("Click the All Vacancies Dropdown")
	public void click_the_all_vacancies_dropdown() throws InterruptedException {
		
		
		
	    cp.Click_All_Vacancies();
	    
	    
	}

	@Then("All types of vacancies should be presented in the Dropdown")
	public void all_types_of_vacancies_should_be_presented_in_the_dropdown() {
		
		
	    cp.Validate_All_vacancies_Dropdown();	    
	   
	}

	@When("Click the job location Dropdown")
	public void click_the_job_location_dropdown() {
		
	 cp.Click_Location_Dropdown();
	}

	@Then("Required location should be presented in the Dropdown")
	public void required_location_should_be_presented_in_the_dropdown() {
		
		cp.Validate_Location_Dropdown();
	   
	}

	@When("Click the Expiry limitation Dropdown")
	public void click_the_expiry_limitation_dropdown() {
		
		
	  cp.Click_Expiry_Limitation_Dropdown();
	}

	@Then("Required Expiry limitations should be presented in the Dropdown")
	public void required_expiry_limitations_should_be_presented_in_the_dropdown() {
		
		
		cp.Validate_Expiry_Limitation_Dropdown();
	
	}

	
	
	
	
	
	
	
	

}
