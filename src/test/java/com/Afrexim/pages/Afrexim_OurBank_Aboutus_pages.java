package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Aboutus_pages extends PageObject {
	
	//To click the Our Bank Option
	@Step
	public void To_click_the_Our_Bank_Option() {
		
		$(By.xpath("(//span[text()='Our Bank'])[1]")).click();

	}
	
	//To Select the About Us Functionality
	@Step
	public void To_Select_the_About_Us_Functionality() {
		
		$(By.xpath("(//a[text()='About Us'])[1]")).click();

	}
	
	//To validate the About us page
	@Step
	public void To_validate_the_About_us_page() {
		
		$(By.xpath("//h1[text()='About Us']")).isDisabled();

	}
	
	//To scroll down the entire page
	@Step
	public void To_scroll_down_the_entire_page() throws AWTException {
		Robot r = new Robot();
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	//To click the Read more option in Corporate Governance
	@Step
	public void Click_Read_more_option_in_Corporate_Governance() {
		
		$(By.xpath("(//span[text()='Read more'])[6]")).click();
		

	}
	
	//Validate the Corporate Governance page
	@Step
	public void Validate_the_Corporate_Governance_page() {
		
		$(By.xpath("(//h1[text()='Corporate Governance'])")).isDisabled();

	}
	
	

}
