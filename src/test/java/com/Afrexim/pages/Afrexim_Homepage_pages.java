package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Homepage_pages extends PageObject{
	
	//To validate the Afrexim bank Logo
	@Step
	public void validate_AfreximbankLogo() {
		
		$(By.xpath("//a[text()='African Export-Import Bank']")).isDisplayed();

	}
	
	//Validate the required Homepage options
	@Step
	public void Validate_requiredHomepageoptions() {
		
		$(By.xpath("(//span[text()='Our Bank'])[1]")).isDisplayed();
		$(By.xpath("(//span[text()='Products & Services'])[1]")).isDisplayed();
		$(By.xpath("(//span[text()='Media'])[1]")).isDisplayed();
		$(By.xpath("(//span[text()='Knowledge & Research'])[1]")).isDisplayed();
		$(By.xpath("(//span[text()='Investors'])[1]")).isDisplayed();
		$(By.xpath("(//a[text()='Apply for facility'])[1]")).isDisplayed();
		$(By.xpath("(//a[text()='Français'])[1]")).isDisplayed();
		$(By.xpath("//div[@class='search01']")).isDisplayed();

	}

}
