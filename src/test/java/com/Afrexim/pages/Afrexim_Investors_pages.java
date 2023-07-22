package com.Afrexim.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Investors_pages extends PageObject{
	
	//To click Investors option
	@Step
	public void Click_Investors_option() {
		
		$(By.xpath("(//span[text()='Investors'])[1]")).click();

	}
	
	//To click IPO link
	@Step
	public void Click_IPO_link() {
		
		$(By.xpath("(//a[text()='IPO'])[1]")).click();

	}
	
	//Select the country and jurisdication
	@Step
	public void Select_the_country_and_jurisdication() {
		
		$(By.xpath("//select[@id='input_23_1']")).selectByIndex(2);
		
		$(By.xpath("//select[@id='input_23_1']")).sendKeys(Keys.TAB);
		
		$(By.xpath("//select[@id='input_23_2']")).selectByIndex(2);
		

	}
	
	//Click Submit button
	@Step
	public void Click_Submit_Button() {
		
		$(By.xpath("//input[@id='gform_submit_button_23']")).click();

	}
	
	//Verify IPO Disclaimer page
	@Step
	public void Verify_IPO_disclaimer_page() {
		
		$(By.xpath("//h1[text()='IPO Disclaimer']")).isDisplayed();

	}
	
	//Scroll down and click I AGREE check box
	@Step
	public void Scroll_down_and_click_IAGREE_checkbox() {
		
		$(By.id("input_24_1_1")).click();

	}
	
	//Click I agree button
	@Step
	public void Click_Iagree_button() {
		
		$(By.xpath("//input[@id='gform_submit_button_24']")).click();

	}
	
	//Verify IPO Documents page
	@Step
	public void Verify_IPO_Documents_page() {
		
		$(By.xpath("//h1[text()='IPO Documents']")).isDisplayed();

	}
	
	//Click Registration document for open
	@Step
	public void Click_Registration_document_for_open() {
		
		$(By.xpath("//*[text()='REGISTRATION DOCUMENT']")).click();
		

	}
	
	//Registration Document open as pdf
	@Step
	public void Registration_Document() {
		

		$(By.xpath("//*[@type='application/x-google-chrome-pdf']")).isDisplayed();

	}

}
