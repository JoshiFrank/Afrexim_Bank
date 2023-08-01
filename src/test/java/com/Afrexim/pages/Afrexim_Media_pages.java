package com.Afrexim.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Media_pages extends PageObject{
	
	//To click the Media option
	@Step
	public void click_Mediaoption() {
		
		$(By.xpath("(//span[text()='Media'])[1]")).click();

	}
	
	//To validate the media dropdown
	@Step
	public void validate_mediadropdown() {
		
		boolean displayed = $(By.xpath("//*[@id=\"menu-item-52\"]/ul")).isDisplayed();
		
		
		Assert.assertTrue(displayed);

	}

}
