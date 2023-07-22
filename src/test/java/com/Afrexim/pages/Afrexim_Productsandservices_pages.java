package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Productsandservices_pages extends PageObject {
	
	//To click Products and services option
	@Step
	public void Toclick_Productsandservicesoption() {
		
		$(By.xpath("(//span[text()='Products & Services'])[1]")).click();

	}
	
	//To click Who we serve option
	@Step
	public void Toclick_Whoweserveoption() {
		
		$(By.xpath("//a[text()='Who We Serve']")).click();

	}
	
	//Validate Who we serve page
	@Step
	public void Validate_Whoweservepage() {
		
		$(By.xpath("//h1[text()='Who we serve']")).isDisplayed();

	}
	
	//Click Readmore in Large Corporates option
	@Step
	public void Click_Readmore_LargeCorporates() {
		
		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}
	
	//Validate Large corporates page
	@Step
	public void Validate_Largecorporatespage() {
		
		$(By.xpath("//h1[text()='Large Corporates']")).isDisplayed();

	}

}
