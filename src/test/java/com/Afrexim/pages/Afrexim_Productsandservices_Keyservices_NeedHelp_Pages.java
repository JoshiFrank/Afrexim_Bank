package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Productsandservices_Keyservices_NeedHelp_Pages extends PageObject {

	@Step
	// Click the submit your request link
	public void Click_Submit_Request() throws AWTException, InterruptedException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);

		Actions ac = new Actions(getDriver());

		ac.moveToElement($(By.xpath("(//li[@class='color01'])[2]"))).perform();

		$(By.partialLinkText("Submit")).click();

	}

	// select the Entity
	@Step

	public void Select_Entity() {

		$(By.xpath("//label[text()='Financial Institution - Central Bank']")).click();
		

	}

	// select opportunities

	@Step

	public void Select_Oppurtunities() {

		$(By.xpath("//label[text()='Intra-African Trade']")).click();

	}

	// Enter the Request
	@Step

	public void Type_request(String request) {

		$(By.xpath("//textarea[@id='input_19_6']")).typeAndTab(request);

	}

	// Select the Prefix

	@Step

	public void Select_prefix_title(int index) {

		$(By.xpath("//select[@id='input_19_18_2']")).selectByIndex(index);

	}

    //Enter the first name
	@Step
	
	public void Type_first_name(String FirstName) {

		$(By.xpath("//input[@id='input_19_18_3']")).typeAndTab(FirstName);

	}
	
	//Enter last name
	
	@Step

	public void Type_Last_Name(String LastName) {

		$(By.xpath("//input[@id='input_19_18_6']")).typeAndTab(LastName);

	}

    //Enter the Function
	
	@Step

	public void Type_Function(String function) {

		$(By.xpath("//input[@id='input_19_12']")).typeAndTab(function);

	}
	
	//Enter organization
	
	@Step
	
	public void Type_organisation(String organisation) {
		
		$(By.xpath("//input[@id='input_19_13']")).typeAndTab(organisation);

	}
	
	//Enter country of operation
	
	@Step
	
	public void Type_country_of_operation(String country) {
		
		$(By.xpath("//input[@id='input_19_14']")).typeAndTab(country);

	}
	
	//Type email
	
	@Step
	
	public void Type_email(String email) {
		
		$(By.xpath("//input[@id='input_19_16']")).typeAndTab(email);

	}
	
	//Type phone
	
	@Step
	
	public void Type_phone(String phone) {
		
		$(By.xpath("//input[@id='input_19_17']")).typeAndTab(phone);

	}
	
	//Click submit button
	
	@Step
	
	public void Click_submit_button() {
		
		$(By.xpath("//input[@id='gform_submit_button_19']")).click();

	}
	
	//Verify thanks for contact page
	
	@Step
	
	public void Verify_thanks_for_contacting_page() {
		
		$(By.xpath("//div[text()='Thanks for contacting us! We will get in touch with you shortly.']")).isDisplayed();

	}

}
