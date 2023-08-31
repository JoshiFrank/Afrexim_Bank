package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Mediacoverage_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Media_Coverage_Steps {

	
	
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	Afrexim_Mediacoverage_pages mcp;
	
	
	@When("To click News function")
	public void to_click_news_function() {
		
		mcp.toclick_news_function();
	    
	}

	@Then("To get the news results")
	public void to_get_the_news_results() throws InterruptedException, AWTException {
		
		mcp.toget_the_news_results();
	    
	}

	
}
