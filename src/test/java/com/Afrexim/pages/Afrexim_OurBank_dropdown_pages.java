package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_dropdown_pages extends PageObject {
	
	//To validate Our Bank dropdown
	@Step
	public void Validate_OurBank_dropdown() {
		
		$(By.xpath("//ul[@class='sub-menu']")).isDisplayed();

	}

}
