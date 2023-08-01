package com.Afrexim.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Productsandservices_pages extends PageObject {

	// To click Products and services option
	@Step
	public void Toclick_Productsandservicesoption() {

		$(By.xpath("(//span[text()='Products & Services'])[1]")).click();

	}

	// To validate products and services dropdown
	@Step
	public void validate_ProductsandServicesDropdown() {

		boolean a = $(By.xpath("(//ul[@class='sub-menu'])[4]")).isDisplayed();
		System.out.println(a);
		Assert.assertTrue(a);

	}

	// To click Who we serve option
	@Step
	public void Toclick_Whoweserveoption() {

		$(By.xpath("//a[text()='Who We Serve']")).click();

	}

	// Validate Who we serve page
	@Step
	public void Validate_Whoweservepage() {

		boolean c = $(By.xpath("//h1[text()='Who we serve']")).isDisplayed();
		System.out.println(c);
		Assert.assertTrue(c);

	}

	// Click Readmore in Large Corporates option
	@Step
	public void Click_Readmore_LargeCorporates() {

		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}

	// Validate Large corporates page
	@Step
	public void Validate_Largecorporatespage() {

		boolean d = $(By.xpath("//h1[text()='Large Corporates']")).isDisplayed();
		System.out.println(d);
		Assert.assertTrue(d);

	}

	// Click Readmore in Governments option
	@Step
	public void Click_Readmore_Governmentsoption() {

		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}

	// Validate Governments page
	@Step
	public void Validate_Governmentspage() {

		boolean b = $(By.xpath("//h1[text()='Governments']")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);

	}

	// Click Readmore in Financial Institutions
	@Step
	public void Click_Readmore_FinancialInstitutions() {

		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}

	// Validate Financial Institutions Page
	@Step
	public void Validate_FinancialInstitutions_Page() {

		boolean e = $(By.xpath("//h1[text()='Financial Institutions']")).isDisplayed();
		System.out.println(e);
		Assert.assertTrue(e);

	}

	// Click Readmore in Our Clients
	@Step
	public void Click_Readmore_OurClients() {

		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}

	// Validate Our Clients Page
	@Step
	public void Validate_OurClientsPage() {

		boolean f = $(By.xpath("//h1[text()='Other Clients']")).isDisplayed();
		System.out.println(f);
		Assert.assertTrue(f);

	}

//---------------------------------------------------------------------------------------------

	// Our key services pages

	//Click our services option
	@Step
	public void click_our_key_services() {

		$(By.xpath("//li[@id='menu-item-2130']/a")).click();
	}
	
	//Validate our key services page
	@Step
	public void validate_our_key_services() {

		boolean key = $(By.xpath("//h1[text()='Our Key Services']")).isDisplayed();
		System.out.println(key);
		Assert.assertTrue(key);

	}

	//Click Trade Project
	@Step
	public void click_trade_project() {

		$(By.xpath("//li[@id='parent-342']/a")).click();

	}

	//Validate trade project page
	@Step
	public void validate_trade_project() {

		String text = $(By.xpath("//h1[text()='Trade & Project Financing']")).getText();
		
		Assert.assertEquals(text, "Trade & Project Financing");
	}
	
	//To click Trade Finance Programmes link
	@Step
	public void click_TradeFinanceProgrammeslink() {
		
		$(By.xpath("//li[@id='parent-7914']/a")).click();

	}
	
	//Validate the Trade Finance Programmes page
	@Step
	public void Validate_TradeFinanceProgrammespage() {
		
		boolean aa = $(By.xpath("//h1[text()='Trade Finance Programmes']")).isDisplayed();
		System.out.println(aa);
		Assert.assertTrue(aa);

	}
	
	//To click Structured Trade Finance link
	@Step
	public void click_StructuredTradeFinancelink() {
		
		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}
	
	//Validate the Structured Trade Finance page
	@Step
	public void Validate_StructuredTradeFinancepage() {
		
		boolean bb = $(By.xpath("//h1[text()='Structured Trade Finance']")).isDisplayed();
		System.out.println(bb);
		Assert.assertTrue(bb);

	}
	
	//To click the Dual Recourse Facilities link
	@Step
	public void click_DualRecourseFacilitieslink() {
		
		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}
	
	//Validate the Dual Recourse Facilities page
	@Step
	public void Validate_DualRecourseFacilitiespage() {
		
		boolean cc = $(By.xpath("//h1[text()='Dual Recourse Facilities']")).isDisplayed();
		System.out.println(cc);
		Assert.assertTrue(cc);

	}
	
	//To click Non-Dual Recourse Facilities link
	@Step
	public void click_NonDual_RecourseFacilitieslink() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate the Non-Dual Recourse Facilities page
	@Step
	public void Validate_theNonDualRecourseFacilities_page() {
		
		boolean ab = $(By.xpath("//h1[text()='Non-Dual Recourse Facilities']")).isDisplayed();
		System.out.println(ab);
		Assert.assertTrue(ab);

	}
	
	//To click Trade Finance Intermediaries (TFI’s) link
	@Step
	public void click_TradeFinanceIntermediaries_link() {
		
		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}
	
	//Validate the Trade Finance Intermediaries (TFI’s) page
	@Step
	public void Validate_TradeFinanceIntermediaries_page() {
		
		boolean bb = $(By.xpath("//h1[text()='Trade Finance Intermediaries (TFI’s)']")).isDisplayed();
		System.out.println(bb);
		Assert.assertTrue(bb);
	}
	
	//To click the Food Emergency Contingent Financing Facility link
	@Step
	public void click_FoodEmergencyContingentFinancingFacility() {
		
		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}
	
	//Validate the Food Emergency Contingent Financing Facility page
	@Step
	public void Validate_FoodEmergencyContingentFinancingFacilitypage() {
		
		boolean cc = $(By.xpath("//h1[text()='Food Emergency Contingent Financing Facility (FECONTRAF)']")).isDisplayed();
		System.out.println(cc);
		Assert.assertTrue(cc);
	}
	
	//To click the Afreximbank Trade Facilitation Programme link
	@Step
	public void click_AfreximbankTradeFacilitationProgramme() {
		
		$(By.xpath("(//span[text()='Read more'])[5]")).click();

	}
	
	//Validate the Afreximbank Trade Facilitation Programme page
	@Step
	public void Validate_AfreximbankTradeFacilitationProgrammepage() {
		
		boolean ac = $(By.xpath("//h1[text()='Afreximbank Trade Facilitation Programme (AFTRAF)']")).isDisplayed();
		System.out.println(ac);
		Assert.assertTrue(ac);

	}
	
	//To click the Note Purchase Program link
	@Step
	public void click_NotePurchaseProgramlink() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate the Note Purchase Program page
	@Step
	public void Validate_NotePurchaseProgrampage() {
		
		boolean ad = $(By.xpath("//h1[text()='Note Purchase Program']")).isDisplayed();
		System.out.println(ad);
		Assert.assertTrue(ad);
		
	}
	
	//To click the Receivables Purchase&Discounting Program link
	@Step
	public void click_ReceivablesPurchaseandDiscountingProgram() {
		
		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}
	
	//Validate the Receivables Purchase page
	@Step
	public void Validate_ReceivablesPurchasepage() {
		
		boolean cc = $(By.xpath("//h1[text()='Receivables Purchase / Discounting Program']")).isDisplayed();
		System.out.println(cc);
		Assert.assertTrue(cc);

	}
	
	//To click the Asset-Backed Lending Program link
	@Step
	public void click_AssetBackedLendingProgram() {
		
		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}
	
	//Validate the Asset-Backed Lending Program page
	@Step
	public void Validate_AssetBackedLendingProgrampage() {
		
		boolean cd = $(By.xpath("//h1[text()='Asset-Backed Lending Program']")).isDisplayed();
		System.out.println(cd);
		Assert.assertTrue(cd);

	}
	
	//To click the Country Programs link
	@Step
	public void click_CountryProgramslink() {
		
		$(By.xpath("(//span[text()='Read more'])[5]")).click();

	}
	
	//Validate the Country Programs page
	@Step
	public void Validate_CountryProgramspage() {
		
		boolean s = $(By.xpath("//h1[text()='Country Programs']")).isDisplayed();
		System.out.println(s);
		Assert.assertTrue(s);

	}
	
	//To click the Factoring link
	@Step
	public void click_Factoringlink() {
		
		$(By.xpath("(//span[text()='Read more'])[6]")).click();

	}
	
	//Validate the Factoring page
	@Step
	public void Validate_Factoringpage() {
		
		boolean t = $(By.xpath("//h1[text()='Factoring']")).isDisplayed();
		System.out.println(t);
		Assert.assertTrue(t);

	}
	
	//To click the Project–Related Financing link
	@Step
	public void click_ProjectRelatedFinancinglink() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate the Project–Related Financing page
	@Step
	public void Validate_ProjectRelatedFinancingpage() {
		
		boolean q = $(By.xpath("//h1[text()='Project–Related Financing']")).isDisplayed();
		System.out.println(q);
		Assert.assertTrue(q);
		
		

	}
	
	//To click the Export Development link
	@Step
	public void click_ExportDevelopmentlink() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate the Export Development page
	@Step
	public void Validate_ExportDevelopmentpage() {
		
		boolean p = $(By.xpath("//h1[text()='Export Development']")).isDisplayed();
		System.out.println(p);
		Assert.assertTrue(p);
		
	}
	
	//To click the Guarantees link
	@Step
	public void click_Guaranteeslink() {
		
		$(By.xpath("(//span[text()='Read more'])[3]")).click();


	}
	
	//Validate the Guarantees page
	@Step
	public void Validate_Guaranteespage() {
		
		boolean u = $(By.xpath("//h1[text()='Guarantees']")).isDisplayed();
		System.out.println(u);
		Assert.assertTrue(u);

	}
	
	//click the Short Term Trade Guarantee Products link
	@Step
	public void click_ShortTermTradeGuaranteeProducts() {
		
		$(By.xpath("(//span[text()='Read more'])[1]")).click();

	}
	
	//Validate the Short Term Trade Guarantee Products page
	@Step
	public void Validate_ShortTermTradeGuaranteeProductspage() {
		
		boolean v = $(By.xpath("//h1[text()='Short Term Trade Guarantee Products']")).isDisplayed();
		System.out.println(v);
		Assert.assertTrue(v);

	}
	
	//To click Working Capital Guarantee Programme link
	@Step
	public void click_WorkingCapitalGuaranteeProgrammelink() {
		
		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}
	
	//Validate the Working Capital Guarantee Programme page
	@Step
	public void Validate_WorkingCapitalGuaranteeProgrammepage() {
		
		boolean x = $(By.xpath("//h1[text()='Working Capital Guarantee Programme (WORKAP)']")).isDisplayed();
		System.out.println(x);
		Assert.assertTrue(x);

	}
	
	//To click the Medium and Long-Term Guarantee Products
	@Step
	public void click_MediumLongTermGuaranteeProducts() {
		
		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}
	
	//Validate the Medium and Long-Term Guarantee page
	@Step
	public void Validate_MediumLongTermGuaranteepage() {
		
		boolean y = $(By.xpath("//h1[text()='Medium and Long-Term Guarantee Products']")).isDisplayed();
		System.out.println(y);
		Assert.assertTrue(y);

	}
	
	//To click the Bonding Facilities link
	@Step
	public void click_BondingFacilitieslink() {
		
		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}
	
	//Validate the Bonding Facilities page
	@Step
	public void Validate_BondingFacilitiespage() {
		
		boolean uu = $(By.xpath("//h1[text()='Bonding Facilities']")).isDisplayed();
		System.out.println(uu);
		Assert.assertTrue(uu);

	}
	
	//To click the Other Unique Guarantee Products link
	@Step
	public void click_OtherUniqueGuaranteeProductslink() {
		
		$(By.xpath("(//span[text()='Read more'])[5]")).click();

	}
	
	//Validate the Other Unique Guarantee Products page
	@Step
	public void Validate_OtherUniqueGuaranteeProductspage() {
		
		boolean vv = $(By.xpath("//h1[text()='Other Unique Guarantee Products']")).isDisplayed();
		System.out.println(vv);
		Assert.assertTrue(vv);

	}
	
	//To click the How to Apply link
	@Step
	public void click_HowtoApplylink() {
		
		$(By.xpath("(//span[text()='Read more'])[6]")).click();

	}
	
	//Validate the How to Apply page
	@Step
	public void Validate_HowtoApplypage() {
		
		boolean xy = $(By.xpath("//h1[text()='How to Apply']")).isDisplayed();
		System.out.println(xy);
		Assert.assertTrue(xy);

	}
	
	//To click the Trade Information & Advisory link
	@Step
	public void click_TradeInformationandAdvisorylink() {
		
		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}
	
	//Validate the Trade Information & Advisory page
	@Step
	public void Validate_TradeInformationAdvisorypage() {
		
		boolean yx = $(By.xpath("//h1[text()='Trade Information & Advisory']")).isDisplayed();
		System.out.println(yx);
		Assert.assertTrue(yx);

	}

	

	
	
	
	

}
