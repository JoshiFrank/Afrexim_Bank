package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Productsandservices_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Productsandservices_steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_Productsandservices_pages pp;

	@When("To click Products and services option")
	public void to_click_products_and_services_option() {

		pp.Toclick_Productsandservicesoption();

	}

	@Then("To validate Products and Services Dropdown")
	public void to_validate_products_and_services_dropdown() {

		pp.validate_ProductsandServicesDropdown();

	}
	
	//Who we serve

	@When("To click Who we serve option")
	public void to_click_who_we_serve_option() {

		pp.Toclick_Whoweserveoption();

	}

	@Then("Validate Who we serve page")
	public void validate_who_we_serve_page() {

		pp.Validate_Whoweservepage();

	}
	
	//Large Corporates

	@Then("Click Readmore in Large Corporates option")
	public void click_readmore_in_large_corporates_option() {

		pp.Click_Readmore_LargeCorporates();

	}

	@Then("Validate Large corporates page")
	public void validate_large_corporates_page() {

		pp.Validate_Largecorporatespage();

	}

	// Government

	@Then("Click Readmore in Governments option")
	public void click_readmore_in_governments_option() {
		
		pp.Click_Readmore_Governmentsoption();

	}

	@Then("Validate Governments page")
	public void validate_governments_page() {
		
		pp.Validate_Governmentspage();

	}
	
	//Financal Institutions 

	@When("Click Readmore in Financial Institutions")
	public void click_readmore_in_financial_institutions() {
		
		pp.Click_Readmore_FinancialInstitutions();

	}

	@Then("Validate Financial Institutions Page")
	public void validate_financial_institutions_page() {
		
		pp.Validate_FinancialInstitutions_Page();

	}
	
	//Our Clients

	@When("Click Readmore in Our Clients")
	public void click_readmore_in_our_clients() {
		
		pp.Click_Readmore_OurClients();

	}

	@Then("Validate Our Clients Page")
	public void validate_our_clients_page() {
		
		pp.Validate_OurClientsPage();

	}
	
//----------------------------------------------------------------------------------------------
	
	//Key services 
	
	@When("To click the Our key services link")
	public void to_click_the_our_key_services_link() {
		
		pp.click_our_key_services();
	    
	}

	@Then("Validate the Our key services page")
	public void validate_the_our_key_services_page() {
		
		pp.validate_our_key_services();
	    
	}
	
	//Trade & Project Financing

	@When("To click the Trade & Project Financing link")
	public void to_click_the_trade_project_financing_link() {
		
		pp.click_trade_project();
	   
	}

	@Then("Validate the Trade & Project Financing page")
	public void validate_the_trade_project_financing_page() {
		
		pp.validate_trade_project();
	    
	}
	
	//Trade Finance Programmes

	@When("To click Trade Finance Programmes link")
	public void to_click_trade_finance_programmes_link() {
		
		pp.click_TradeFinanceProgrammeslink();
	    
	}

	@Then("Validate the Trade Finance Programmes page")
	public void validate_the_trade_finance_programmes_page() {
		
		pp.Validate_TradeFinanceProgrammespage();
	    
	}
	
	//Structured Trade Finance

	@When("To click Structured Trade Finance link")
	public void to_click_structured_trade_finance_link() {
		
		pp.click_StructuredTradeFinancelink();
	    
	}

	@Then("Validate the Structured Trade Finance page")
	public void validate_the_structured_trade_finance_page() {
		
		pp.Validate_StructuredTradeFinancepage();
	    
	}
	
	//Dual Recourse Facilities

	@When("To click the Dual Recourse Facilities link")
	public void to_click_the_dual_recourse_facilities_link() {
		
		pp.click_DualRecourseFacilitieslink();
	    
	}

	@Then("Validate the Dual Recourse Facilities page")
	public void validate_the_dual_recourse_facilities_page() {
		
		pp.Validate_DualRecourseFacilitiespage();
	    
	}
	
	//Non-Dual Recourse Facilities

	@When("To click Non-Dual Recourse Facilities link")
	public void to_click_non_dual_recourse_facilities_link() {
		
		pp.click_NonDual_RecourseFacilitieslink();
	    
	}

	@Then("Validate the Non-Dual Recourse Facilities page")
	public void validate_the_non_dual_recourse_facilities_page() {
		
		pp.Validate_theNonDualRecourseFacilities_page();
	    
	}
	
	//Trade Finance Intermediaries

	@When("To click Trade Finance Intermediaries \\(TFI’s) link")
	public void to_click_trade_finance_intermediaries_tfi_s_link() {
		
		pp.click_TradeFinanceIntermediaries_link();
	   
	}

	@Then("Validate the Trade Finance Intermediaries \\(TFI’s) page")
	public void validate_the_trade_finance_intermediaries_tfi_s_page() {
		
		pp.Validate_TradeFinanceIntermediaries_page();
	    
	}
	
	//Food Emergency Contingent Financing

	@When("To click the Food Emergency Contingent Financing Facility link")
	public void to_click_the_food_emergency_contingent_financing_facility_link() {
		
		pp.click_FoodEmergencyContingentFinancingFacility();
	    
	}

	@Then("Validate the Food Emergency Contingent Financing Facility page")
	public void validate_the_food_emergency_contingent_financing_facility_page() {
		
		pp.Validate_FoodEmergencyContingentFinancingFacilitypage();
	    
	}
	
	//Afreximbank Trade Facilitation Programme

	@When("To click the Afreximbank Trade Facilitation Programme link")
	public void to_click_the_afreximbank_trade_facilitation_programme_link() {
		
		pp.click_AfreximbankTradeFacilitationProgramme();
	   
	}

	@Then("Validate the Afreximbank Trade Facilitation Programme page")
	public void validate_the_afreximbank_trade_facilitation_programme_page() {
		
		pp.Validate_AfreximbankTradeFacilitationProgrammepage();
	   
	}
	
	//Note Purchase Program

	@When("To click the Note Purchase Program link")
	public void to_click_the_note_purchase_program_link() {
		
		pp.click_NotePurchaseProgramlink();
	    
	}

	@Then("Validate the Note Purchase Program page")
	public void validate_the_note_purchase_program_page() {
		
		pp.Validate_NotePurchaseProgrampage();
	    
	}
	
	//Receivables Purchase&Discounting Program link

	@When("To click the Receivables Purchase&Discounting Program link")
	public void to_click_the_receivables_purchase_discounting_program_link() {
		
		pp.click_ReceivablesPurchaseandDiscountingProgram();
	    
	}

	@Then("Validate the Receivables Purchase page")
	public void validate_the_receivables_purchase_page() {
		
		pp.Validate_ReceivablesPurchasepage();
	    
	}
	
	//Asset-Backed Lending Program 

	@When("To click the Asset-Backed Lending Program link")
	public void to_click_the_asset_backed_lending_program_link() {
		
		pp.click_AssetBackedLendingProgram();
	   
	}

	@Then("Validate the Asset-Backed Lending Program page")
	public void validate_the_asset_backed_lending_program_page() {
		
		pp.Validate_AssetBackedLendingProgrampage();
	   
	}
	
	//click the Country Programs link

	@When("To click the Country Programs link")
	public void to_click_the_country_programs_link() {
		
		pp.click_CountryProgramslink();
	    
	}

	@Then("Validate the Country Programs page")
	public void validate_the_country_programs_page() {
		
		pp.Validate_CountryProgramspage();
	    
	}
	
	//click the Factoring link

	@When("To click the Factoring link")
	public void to_click_the_factoring_link() {
		
		pp.click_Factoringlink();
	   
	}

	@Then("Validate the Factoring page")
	public void validate_the_factoring_page() {
		
		pp.Validate_Factoringpage();
	    
	}
	
	//Project–Related Financing link

	@When("To click the Project–Related Financing link")
	public void to_click_the_project_related_financing_link() {
		
		pp.click_ProjectRelatedFinancinglink();
	    
	}

	@Then("Validate the Project–Related Financing page")
	public void validate_the_project_related_financing_page() {
		
		pp.Validate_ProjectRelatedFinancingpage();
	    
	}
	
	//Export Development link

	@When("To click the Export Development link")
	public void to_click_the_export_development_link() {
		
		pp.click_ExportDevelopmentlink();
	    
	}

	@Then("Validate the Export Development page")
	public void validate_the_export_development_page() {
		
		pp.Validate_ExportDevelopmentpage();

	}
	
	//Guarantees link

	@When("To click the Guarantees link")
	public void to_click_the_guarantees_link() {
		
		pp.click_Guaranteeslink();
	    
	}

	@Then("Validate the Guarantees page")
	public void validate_the_guarantees_page() {
		
		pp.Validate_Guaranteespage();
	    
	}
	
	//Short Term Trade Guarantee Products link

	@When("To click the Short Term Trade Guarantee Products link")
	public void to_click_the_short_term_trade_guarantee_products_link() {
		
		pp.click_ShortTermTradeGuaranteeProducts();
	    
	}

	@Then("Validate the Short Term Trade Guarantee Products page")
	public void validate_the_short_term_trade_guarantee_products_page() {
		
		pp.Validate_ShortTermTradeGuaranteeProductspage();
	    
	}
	
	//Working Capital Guarantee Programme link

	@When("To click Working Capital Guarantee Programme link")
	public void to_click_working_capital_guarantee_programme_link() {
		
		pp.click_WorkingCapitalGuaranteeProgrammelink();
	    
	}

	@Then("Validate the Working Capital Guarantee Programme page")
	public void validate_the_working_capital_guarantee_programme_page() {
		
		pp.Validate_WorkingCapitalGuaranteeProgrammepage();
	}
	
	//Medium and Long-Term Guarantee Products

	@When("To click the Medium and Long-Term Guarantee Products")
	public void to_click_the_medium_and_long_term_guarantee_products() {
		
		pp.click_MediumLongTermGuaranteeProducts();
	    
	}

	@Then("Validate the Medium and Long-Term Guarantee page")
	public void validate_the_medium_and_long_term_guarantee_page() {
		
		pp.Validate_MediumLongTermGuaranteepage();
	    
	}
	
	//click the Bonding Facilities link

	@When("To click the Bonding Facilities link")
	public void to_click_the_bonding_facilities_link() {
		
		pp.click_BondingFacilitieslink();
	    
	}

	@Then("Validate the Bonding Facilities page")
	public void validate_the_bonding_facilities_page() {
		
		pp.Validate_BondingFacilitiespage();
	    
	}
	
	//Other Unique Guarantee Products link

	@When("To click the Other Unique Guarantee Products link")
	public void to_click_the_other_unique_guarantee_products_link() {
		
		pp.click_OtherUniqueGuaranteeProductslink();
	    
	}

	@Then("Validate the Other Unique Guarantee Products page")
	public void validate_the_other_unique_guarantee_products_page() {
		
		pp.Validate_OtherUniqueGuaranteeProductspage();
	    
	}
	
	//click the How to Apply link

	@When("To click the How to Apply link")
	public void to_click_the_how_to_apply_link() {
		
		pp.click_HowtoApplylink();
	    
	}

	@Then("Validate the How to Apply page")
	public void validate_the_how_to_apply_page() {
		
		pp.Validate_HowtoApplypage();
	    
	}
	
	//click the Trade Information & Advisory link

	@When("To click the Trade Information & Advisory link")
	public void to_click_the_trade_information_advisory_link() {
		
		pp.click_TradeInformationandAdvisorylink();
	    
	}

	@Then("Validate the Trade Information & Advisory page")
	public void validate_the_trade_information_advisory_page() {
		
		pp.Validate_TradeInformationAdvisorypage();
	    
	}


}
