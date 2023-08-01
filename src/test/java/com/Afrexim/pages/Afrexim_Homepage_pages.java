package com.Afrexim.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Homepage_pages extends PageObject{
	
	//To validate the Afrexim bank Logo
	@Step
	public void validate_AfreximbankLogo() {
		
		boolean logo = $(By.xpath("//a[text()='African Export-Import Bank']")).isDisplayed();
		System.out.println(logo);
		
		Assert.assertTrue(logo);
	}
	
	//Validate the required Homepage options
	@Step
	public void Validate_requiredHomepageoptions() {
		
		boolean bank = $(By.xpath("(//span[text()='Our Bank'])[1]")).isDisplayed();
		System.out.println(bank);
		Assert.assertTrue(bank);
		
		boolean products = $(By.xpath("(//span[text()='Products & Services'])[1]")).isDisplayed();
		System.out.println(products);
		Assert.assertTrue(products);
		
		boolean media = $(By.xpath("(//span[text()='Media'])[1]")).isDisplayed();
		System.out.println(media);
		Assert.assertTrue(media);
		
		boolean knowledge = $(By.xpath("(//span[text()='Knowledge & Research'])[1]")).isDisplayed();
		System.out.println(knowledge);
		Assert.assertTrue(knowledge);
		
		boolean investors = $(By.xpath("(//span[text()='Investors'])[1]")).isDisplayed();
		System.out.println(investors);
		Assert.assertTrue(investors);
		
		boolean applyfacility = $(By.xpath("(//a[text()='Apply for facility'])[1]")).isDisplayed();
		System.out.println(applyfacility);
		Assert.assertTrue(applyfacility);
		
		boolean lang = $(By.xpath("(//a[text()='Français'])[1]")).isDisplayed();
		System.out.println(lang);
		Assert.assertTrue(lang);
		
		boolean search = $(By.xpath("//div[@class='search01']")).isDisplayed();
		System.out.println(search);
		Assert.assertTrue(search);

	}

}
