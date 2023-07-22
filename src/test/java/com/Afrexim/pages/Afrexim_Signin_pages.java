package com.Afrexim.pages;

import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Signin_pages extends PageObject{
	
    //Click apply for facility
	@Step
	public void Click_applyfacility() {
		
		$(By.xpath("(//a[text()='Apply for facility'])[1]")).click();

	}
	
	//Enter User name
	@Step
	public void Enter_username(String username) {
		
		$(By.xpath("(//input[@class='pt-form-control'])[1]")).type(username);

	}
	
	//Enter password
	@Step
	public void Enter_password(String Password) {
		
		$(By.xpath("(//input[@class='pt-form-control'])[2]")).type(Password);

	}
	
	
	//click Sign in button
	@Step
	public void Click_Signinbutton() {
		
		$(By.xpath("//input[@value='SIGN IN']")).click();

	}
	
	//Validate error credentials page
	@Step
	public void Verify_error_credentials_page() throws InterruptedException {
		
        boolean errorpage = $(By.xpath("//p[text()='Please fill in the required fields.']")).isDisplayed();
		
		Assert.assrt("True", errorpage);

	Thread.sleep(3000);
	}
	
	

}
