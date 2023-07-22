package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Contactus_pages extends PageObject {
	
	//Find a branch
	
	//Click Contact us page
	@Step
	public void Click_Contactus_page() {
		
		$(By.xpath("(//a[text()='Contact Us'])[1]")).click();

	}
	
	//Validate Contact us page
	@Step
	public void Validate_Contactus_page() {
		
		$(By.xpath("//h1[text()='Contact Us']")).isDisabled();

	}
	
	//Click Read more in Find Branch
	@Step
	public void Click_Read_more_FindBranch() {
		
		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}
	
	//Validate Find a Branch page is displayed
	@Step
	public void Validate_Find_Branch_pageisdisplayed() {
		
		$(By.xpath("//h1[text()='Find a Branch']")).isDisplayed();

	}


}
