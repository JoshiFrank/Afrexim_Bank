package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_ForgotPassword_pages extends PageObject{
	
	
	
	//Click the Forgot Password link
	@Step
	public void Click_the_Forgot_Password_link() {
		
		$(By.xpath("//a[text()='Forgot Password']")).click();

	}
	
	//Validate the Reset Password pop-up page
	@Step
	public void Validate_the_Reset_Password_popup_page() {
		
		$(By.xpath("//h1[text()='Reset Password']")).isDisplayed();
	}
	
	//Enter valid and invalid email credentials
	@Step
	public void Enter_valid_and_invalid_email_credentials(String Email) {
		
 $(By.xpath("//input[@class='pt-form-control']")).sendKeys(Email);
		
	
	
	

	}
	
	//Click Submit button for reset page
	@Step
	public void Click_Submit_button_for_reset_page() {
		
		$(By.xpath("//input[@type='button']")).click();

	}
	
	//Validate positive and negative status message using respective credentials
	@Step
	public void Validate_positive_and_negative_status_message() {

	}
}
