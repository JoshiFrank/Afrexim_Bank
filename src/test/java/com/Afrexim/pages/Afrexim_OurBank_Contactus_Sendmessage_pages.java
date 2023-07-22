package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Contactus_Sendmessage_pages extends PageObject{
	
	//Click Readmore option in send us a message
	@Step
	public void Click_Readmoreoption_sendusamessage() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate Send us a message
	@Step
	public void Validate_Sendusamessage() {
		
		$(By.xpath("//h1[text()='Send Us a Message']")).isDisplayed();

	}
	
	//Select Entity title
	@Step
	public void Select_Entitytitle(int entity) {
		
		$(By.xpath("//select[@id='input_4_19']")).selectByIndex(entity);

	}
	
	//Select interested in
	@Step
	public void Select_interestedin(int interests) {
		
		$(By.xpath("//select[@id='input_4_2']")).selectByIndex(interests);

	}
	
	//Type company name
	@Step
	public void Type_companyname(String companyname) {
		
		$(By.xpath("//input[@id='input_4_6']")).typeAndTab(companyname);

	}
	
	//Select title name
	@Step
	public void Select_titlename(int title) {
		
		$(By.xpath("//select[@id='input_4_24']")).selectByIndex(title);

	}
	
	//Enter first and last names
	@Step
	public void Enter_firstlastnames(String names) {
		
		$(By.xpath("//input[@id='input_4_14']")).typeAndTab(names);

	}
	
	//Enter telephone with area code
	@Step
	public void Enter_telephoneareacode(String telephone) {
		
		$(By.xpath("//div/input[@id='input_4_15']")).typeAndTab(telephone);

	}
	
	//Enter email address
	@Step
	public void Enter_emailaddress(String email) {
		
		$(By.xpath("//input[@id='input_4_16']")).typeAndTab(email);

	}
	
	//Enter function
	@Step
	public void Enter_function(String function) {
		
		$(By.xpath("//input[@id='input_4_30']")).typeAndTab(function);

	}
	
	//Enter organisation
	@Step
	public void Enter_organisation(String organisation) {
		
		$(By.xpath("//input[@id='input_4_34']")).typeAndTab(organisation);

	}
	
	//Enter country of operation
	@Step
	public void Enter_countryofoperation(String country) {
		
		$(By.xpath("//input[@id='input_4_26']")).typeAndTab(country);

	}
	
	//Enter requests here
	@Step
	public void Enter_requestshere(String requests) {
		
		$(By.xpath("//textarea[@id='input_4_17']")).typeAndTab(requests);

	}
	
	//Click confirm check box
	@Step
	public void Click_confirmcheckbox() {
		
		$(By.xpath("//label[text()='I hereby confirm that all my provided information is correct *']")).click();

	}
	
	//click robot check box
	@Step
	public void click_robotcheckbox() throws AWTException, InterruptedException {
		
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    
    r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Click Submit button option
	@Step
	public void Click_Submitbuttonoption() {
		
		$(By.xpath("//input[@type='submit']")).click();

	}
	
	//Validate Submission Confirmation page
	@Step
	public void Validate_SubmissionConfirmationpage() {
		
		$(By.xpath("//h1[text()='Submission Confirmation']")).isDisplayed();

	}

}
