package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_ForgotPassword_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_ForgotPassword_Steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_ForgotPassword_pages fp;

	@When("Click the Forgot Password link")
	public void click_the_forgot_password_link() {

		fp.Click_the_Forgot_Password_link();

	}

	@When("Validate the Reset Password pop-up page")
	public void validate_the_reset_password_pop_up_page() {

		fp.Validate_the_Reset_Password_popup_page();

	}

	@When("Enter valid and invalid email credentials {string}")
	public void enter_valid_and_invalid_email_credentials(String email) {

		fp.Enter_valid_and_invalid_email_credentials(email);

                   
	}

	@When("Click Submit button for reset page")
	public void click_submit_button_for_reset_page() {

		fp.Click_Submit_button_for_reset_page();

	}

	@Then("Validate positive and negative status message using respective credentials")
	public void validate_positive_and_negative_status_message_using_respective_credentials() throws InterruptedException {

		fp.Validate_positive_and_negative_status_message();
		
		
	

	}

}
