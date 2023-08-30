package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_HomePage_Bottom_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_HomePage_Bottom_Steps {

	
	
	
	
	
	@Managed
	WebDriver driver;

	@Steps
	Afrexim_HomePage_Bottom_Pages hb;
	
	@When("mouse hover on Trade & Project Financing Solutions")
	public void mouse_hover_on_trade_project_financing_solutions() {

		hb.mouse_hover_on_TradeProjectFinancingSolutions();
	}

	@Then("Trade Finance Programs and Project-Related Financing options should be displayed")
	public void trade_finance_programs_and_project_related_financing_options_should_be_displayed() {

		hb.TradeFinanceProgramsOptionsDisplayed();
	}

	@When("mouse hover on Guarantees Solutions")
	public void mouse_hover_on_guarantees_solutions() {
		hb.mouse_hover_on_GuaranteesSolutions();
	
	}

	@Then("Short Term Trade Guarantee Products, Working Capital Guarantee Programme, Medium and Long-Term Guarantee Products, Bonding Facilitie, Other Uniques Guarantee Products, How to Apply options should be displayed")
	public void short_term_trade_guarantee_products_working_capital_guarantee_programme_medium_and_long_term_guarantee_products_bonding_facilitie_other_uniques_guarantee_products_how_to_apply_options_should_be_displayed() {

		hb.ShortTermTradeGuaranteeProductsOptionsDisplayed();
	}

	@When("mouse hover on Trade Information and Advisory Services")
	public void mouse_hover_on_trade_information_and_advisory_services() {

		hb.mouse_hover_on_TradeInformationandAdvisoryServices();
	}

	@Then("Trade Information and Advisory Products option should be displayed")
	public void trade_information_and_advisory_products_option_should_be_displayed() {
		hb.TradeInformationAndAdvisoryProductsOptionDisplayed();
	}

	@When("click on Export Development")
	public void click_on_export_development() {
		hb.click_on_ExportDevelopment();
	}

	@Then("Export Development page should be displayed")
	public void export_development_page_should_be_displayed() {
		hb.ExportDevelopmentPageDisplayed();
	}

	@When("mouse hover on Need Help Lets guide you through everything")
	public void mouse_hover_on_need_help_lets_guide_you_through_everything() {
		hb.mouse_hover_on_NeedHelp();
	}

	@Then("Submit your request option should be displayed")
	public void submit_your_request_option_should_be_displayed() {
		hb.Submit_your_request_optionDisplayed();
	}

}
	
	
	
	

