package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	
	
//-----------------------------------------------------------------------------------------------------------
	
	
	
	

	//Click Afreximbank Products brouchers
	@Step
	public void click_afreximbank_products_brouchers() {
		
		$(By.xpath("//a[text()='Afreximbank’s Products Brochures']")).click();
	    
	}

	//Validate Afreximbank Products brouchers page
	@Step
	public void validate_afreximbank_products_brouchers_page() {
		
		boolean displayed = $(By.xpath("//h1[text()='rghattas']")).isDisplayed();
		junit.framework.Assert.assertTrue(displayed);
	    
	}

	//Click Load more in brouchers page
	@Step
	public void click_loadmore_brouchers_page() throws InterruptedException {
		
		
		
		for (int i = 0; i <=3; i++) {
			$(By.xpath("//button[text()='Load More']")).click();
		}
		
		Thread.sleep(3000);
		
	}

	//Click The Afreximbanker newsletter Edition two
	@Step
	public void click_afreximbanker_newsletter_edition_two() {
		
		$(By.xpath("//small[text()='Published on Aug 30, 2023']")).click();
	    
	}

	//Validate The Afreximbanker newsletter Edition two
	@Step
	public void validate_afreximbanker_newsletter_edition_two() throws InterruptedException {
		
		$(By.xpath("//h1[text()='The AFREXIMBANKER NEWSLETTER ISSUE 7 Edition 2']")).isDisplayed();
	    Thread.sleep(3000);
	}

	//Click right arrow in brouchers page
	@Step
	public void click_rightarrow_brouchers_page() throws InterruptedException, AWTException {
		
		Thread.sleep(2000);
		$(By.xpath("//button[@aria-label='Next page button']")).click();
		
		for (int i = 0; i <= 5; i++) {
			
		Robot r= new Robot();	
	
		
		r.keyPress(KeyEvent.VK_RIGHT);
		
		r.keyRelease(KeyEvent.VK_RIGHT);
			
				}
	    
	}

	//Click African Quality Assurance centres
	@Step
	public void click_africanquality_assurancecentres() {
		
		$(By.xpath("(//small[text()='Published on Aug 29, 2023'])[1]")).click();
	    
	}

	//Validate African Quality Assurance centres page
	@Step
	public void validate_africanquality_assurancecentres_page() {
		
		$(By.xpath("//h1[text()='African Quality Assurance Centers (AQACs)']")).isDisplayed();
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
