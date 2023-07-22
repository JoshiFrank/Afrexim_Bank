package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Contactus_Givefeedback_pages extends PageObject {

	// Click Read more in Give us a Feedback
	@Step
	public void Click_Read_more_GiveFeedback() {

		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}

	// Validate Give us a feedback page
	@Step
	public void Validate_Giveusafeedbackpage() {

		$(By.xpath("//h1[text()='Give Us a Feedback']")).isDisplayed();

	}

	// Enter organization name
	@Step
	public void Enter_organizationname(String orgname) {

		$(By.xpath("//input[@id='input_29_2']")).typeAndTab(orgname);

	}

	// Select Title
	@Step
	public void Select_Title(int index) {

		$(By.xpath("//select[@id='input_29_15']")).selectByIndex(index);

	}

	// Enter Full Contact name
	@Step
	public void Enter_FullContactname(String name) {

		$(By.xpath("//input[@id='input_29_1']")).typeAndTab(name);

	}

	// Enter contact number with country code
	@Step
	public void Enter_contactnumber(String number) {

		$(By.xpath("//input[@id='input_29_12']")).typeAndTab(number);

	}

	// Enter email address
	@Step
	public void Enter_emailaddress(String email) throws InterruptedException {

		Thread.sleep(2000);
		
		$(By.xpath("//input[@name='input_13']")).typeAndTab(email);

	}

	// Enter confirm email address
	@Step
	public void Enter_confirmemailaddress(String confirmemail) {

		$(By.xpath("//input[@id='input_29_13_2']")).typeAndTab(confirmemail);

	}

	// Select country name
	@Step
	public void Select_countryname(int index) {

		$(By.xpath("//select[@id='input_29_3']")).selectByIndex(index);

	}

	// Click existing customer
	@Step
	public void Click_existingcustomer() {

		$(By.xpath("//input[@id='choice_29_8_0']")).click();

	}

	// Click preferred contact method
	@Step
	public void Click_preferred_contactmethod() {

		$(By.xpath("//input[@id='choice_29_9_1']")).click();

	}

	// Enter preferred contact time

	@Step
	public void Enter_preferred_contacttime(String time, String time1, int timedetails) {

		$(By.xpath("//label[text()='FROM']/../input")).typeAndTab(time);
		$(By.xpath("//input[@id='input_29_16_2']")).typeAndTab(time1);
		$(By.xpath("//select[@id='input_29_16_3']")).selectByIndex(timedetails);

	}

	// Select feedback type
	@Step
	public void Select_feedback_type(int index) {

		$(By.xpath("//select[@id='input_29_4']")).selectByIndex(index);

	}

	// Enter comments
	@Step
	public void Enter_comments(String comments) {

		$(By.xpath("//textarea[@id='input_29_5']")).typeAndTab(comments);

	}

	// Click consent agree box
	@Step
	public void Click_consent_agreebox() {

		$(By.xpath("//input[@type='checkbox']")).click();

	}

	// Click submit
	@Step
	public void Click_submit() {

		$(By.xpath("//input[@id='gform_submit_button_29']")).click();

	}

	// Validate Thanks for contacting us page
	@Step
	public void Validate_Thanksforcontactingus_page() {

		$(By.xpath("//div[text()='Thanks for contacting us! We will get in touch with you shortly.']")).isDisplayed();

	}

}
