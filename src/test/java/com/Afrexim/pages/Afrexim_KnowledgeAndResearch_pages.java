package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Afrexim_KnowledgeAndResearch_pages extends PageObject {

	// To click the Knowledge&Research option
	@Step
	public void To_click_theKnowledgeResearchOption() {

		$(By.xpath("(//span[text()='Knowledge & Research'])[1]")).click();

		// $(By.xpath("//*[@id='menu-item-20402']/span")).click();
	}

	// To validate the Knowledge&Research dropdown
	@Step
	public void To_validate_the_KnowledgeResearchDropdown() {

		boolean displayed = $(By.xpath("//*[@id='menu-item-20402']/ul")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// To click About us option

	@Step
	public void To_click_AboutUsOption() {

		$(By.xpath("(//a[text()='About us'])[1]")).click();
	}

	// To validate the About us option page
	@Step
	public void To_validate_theAboutUsOptionPage() {

		boolean displayed = $(By.xpath("//h1[text()='About us']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click on Research and Statistics
	@Step
	public void Click_on_ResearchAndStatistics() {

		$(By.xpath("(//a[text()='Research & Statistics'])[2]")).click();

	}

	// Validate Research and Statistics page
	@Step
	public void Validate_ResearchAndStatisticsPage() {

		boolean displayed = $(By.xpath("//h1[text()='Research & Statistics']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click on Internation Cooperation
	@Step
	public void Click_on_InternationCooperation() {

		$(By.xpath("(//a[text()='International Cooperation'])[2]")).click();

	}

	// Validate Internation Cooperation page
	@Step
	public void Validate_InternationCooperationPage() {

		boolean displayed = $(By.xpath("//h1[text()='International Cooperation']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click on Trade Policy and Market access
	@Step
	public void Click_on_TradePolicyAnd_MarketAccess() {

		$(By.xpath("(//a[text()='Trade Policy and Market Access'])[2]")).click();

	}

	// Validate Trade Policy and Market access page
	@Step
	public void Validate_TradePolicyAndMarketAccessPage() {

		boolean displayed = $(By.xpath("//h1[text()='Trade Policy and Market Access']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click Library & Knowledge Centre
	@Step
	public void Click_LibraryKnowledgeCentre() {

		$(By.xpath(" (//a[text()='Library & Knowledge Centre'])[2]")).click();

	}

	// Validate Library & Knowledge Centre page
	@Step
	public void Validate_Library_KnowledgeCentrePage() {

		boolean displayed = $(By.xpath("//h1[text()='Library & Knowledge Centre']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click Afreximbank Library Online Public Access Catalogue
	@Step
	public void Click_Afreximbank_LibraryOnlinePublicAccessCatalogue() {

		$(By.xpath("(//a[text()='Afreximbank Library Online Public Access Catalogue'])[2]")).click();

	}

	// Validate Afreximbank Library Online Public Access Catalogue page
	@Step
	public void Validate_Afreximbank_LibraryOnlinePublicAccessCataloguePage() {

		boolean displayed = $(By.xpath("//h1[text()='Afreximbank Library Online Public Access Catalogue']"))
				.isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click Call for papers -CIAT
	@Step
	public void Click_Call_forPapersCIAT() {

		$(By.xpath("(//a[text()='Call for papers -CIAT'])[2]")).click();
	}

	// Validate Call for papers -CIAT page
	@Step

	public void Validate_Call_forPapersCIATPage() {

		boolean displayed = $(By.xpath("//h1[text()='Call for papers -CIAT']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Enter first name in ciat page
	@Step

	public void Enter_firstNameInCiatPage(String fname) {

		$(By.xpath("//input[@id='input_21_1' and @name='input_1']")).typeAndTab(fname);

	}

	// Enter last name in ciat page
	@Step

	public void Enter_lastNameInCiatPage(String lname) {

		$(By.xpath("//input[@id='input_21_2' and @name='input_2']")).typeAndTab(lname);

	}

	// Enter email address in ciat page
	@Step

	public void Enter_emailAddressInCiatPage(String email) {

		$(By.xpath("//input[@id='input_21_7' and @name='input_7']")).typeAndTab(email);

	}

	// Enter institution in ciat page
	@Step

	public void Enter_institutionInCiatPage(String institution) {

		$(By.xpath("//input[@id='input_21_3' and @name='input_3']")).typeAndTab(institution);

	}

	// Enter description in ciat page
	@Step

	public void Enter_descriptionInCiatPage(String description) {

		$(By.xpath("//textarea[@id='input_21_4' and @name='input_4']")).typeAndTab(description);

	}

	// To upload document in ciat page
	@Step

	public void To_upload_documentInCiatPage() {

		$(By.xpath("//button[text()='Select files']")).click();

	}

	// To validate document uploaded successfully in ciat page
	@Step

	public void To_validate_documentUploadedSuccessfullyInCiatPage() {

	}

	// To select check box in ciat page
	@Step

	public void To_select_checkBoxInCiatPage() throws InterruptedException, AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	// To click submit button in ciat page
	@Step

	public void To_click_submitButtonInCiatPage() {

		$(By.xpath("//input[@value='Submit']")).click();

	}

	// Validate Submission Confirmation in ciat page
	@Step

	public void Validate_Submission_ConfirmationInCiatPage() {

	}

	// Click Call for papers � AWPS
	@Step

	public void Click_Call_for_papersAWPS() {

		$(By.xpath("(//a[text()='Call for papers – AWPS'])[2]")).click();

	}

	// Validate Call for papers � AWPS
	@Step

	public void Validate_callForPapersAWPS() {

		$(By.xpath("//h1[text()='Call for papers – AWPS']")).click();

	}

	// Enter first name in awps page
	@Step

	public void Enter_firstNameInAwpsPage(String FName) {

		$(By.xpath("//input[@id='input_26_1' and @name='input_1']")).typeAndTab(FName);

	}

	// Enter last name in awps page
	@Step

	public void Enter_lastNameInAwpsPage(String LName) {

		$(By.xpath("//input[@id='input_26_2' and @name='input_2']")).typeAndTab(LName);

	}

	// Enter email in awps page
	@Step

	public void Enter_emailIn_awpsPage(String Email) {

		$(By.xpath("//input[@id='input_26_7' and @name='input_7']")).typeAndTab(Email);

	}

	// Enter institution in awps page
	@Step

	public void Enter_institutionInAwpsPage(String Institution) {

		$(By.xpath("//input[@id='input_26_3' and @name='input_3']")).typeAndTab(Institution);

	}

	// Enter description in awps page
	@Step

	public void Enter_descriptionInAwpsPage(String Description) {

		$(By.xpath("//textarea[@id='input_26_4' and @name='input_4']")).typeAndTab(Description);

	}

	// Upload document in awps page
	@Step

	public void Upload_documentInAwpsPage() {

		$(By.xpath("//button[text()='Select files']")).click();

	}

	// Validate Document Uploaded successfully in awps page
	@Step

	public void Validate_Document_UploadedSuccessfullyInAwpsPage() {

	}

	// Click checkbox in awps page
	@Step

	public void Click_checkboxInAwpsPage() throws AWTException, InterruptedException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	// Click submit in awps page
	@Step

	public void Click_submitInAwpsPage() {

		$(By.xpath("//input[@value='Submit']")).click();

	}

	// Validate Submission Confirmation in awps page
	@Step

	public void Validate_SubmissionConfirmationInAwpsPage() {

	}

	// Click JAT � Submission of papers
	@Step

	public void Click_JATSubmissionOfPapers() {

		$(By.xpath("(//a[text()='JAT – Submission of papers'])[2]")).click();

	}

	// Validate JAT � Submission of papers page
	@Step

	public void Validate_JATSubmissionOfPapersPage() {

		$(By.xpath("//h1[text()='JAT – Submission of papers']")).click();

	}

//-------------------------------------------------------------------------------------------------------------------------------------

	// publications

	// To click Publications option
	@Step
	public void Toclick_Publicationsoption() {

		$(By.xpath("(//a[text()='Publications'])[1]")).click();

	}

	// To validate the publications page
	@Step
	public void Tovalidate_publicationspage() {

		boolean displayed = $(By.xpath("//h1[text()='Publications']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click dropdown down arrow button in box
	@Step
	public void Click_dropdowndownarrowbuttoninbox() {

		$(By.xpath("//select[@id='publication_categories_select' and @class='form-control']")).click();

	}

	// Validate dropdown results
	@Step
	public void Validate_dropdownresults() {

		WebElementFacade drop = $(By.xpath("//select[@id='publication_categories_select']"));

		String text = "";
		Select s = new Select(drop);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			text = options.get(i).getText();

			System.out.println("Dropdown text:" + text);

		}

	}

	// Click Publications
	@Step
	public void Click_Publications() throws InterruptedException {

		$(By.xpath("//option[text()='All publications']")).click();
		Thread.sleep(5000);

	}

	// Click Filter button
	@Step
	public void Click_Filterbutton() throws InterruptedException {

		$(By.xpath("//button[text()='Filter']")).click();
		Thread.sleep(5000);

	}

	// Scroll down and click View all
	@Step
	public void Scrolldown_clickViewall() throws InterruptedException {

		$(By.xpath("//a[text()='View all']")).click();
		Thread.sleep(5000);

	}

	// Click African trade Report document
	@Step
	public void Click_AfricantradeReportdocument() {

		$(By.xpath("//*[@id=\"afrexim_reports_entries\"]/div[1]/div[2]/p[1]/a")).click();

	}

	// Validate African trade Report document page
	@Step
	public void Validate_AfricantradeReport_documentpage() {

		boolean displayed = $(By.xpath("//h1[@class='entry-title']")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click Download button
	@Step
	public void Click_Downloadbutton() throws InterruptedException {

		$(By.xpath("//a[text()='Download']")).click();

		Thread.sleep(2000);

	}

	// Validate African trade Report Download pdf
	@Step
	public void Validate_AfricantradeReport_Downloadpdf() {

		$(By.xpath("//*[@id=\"plugin\"]")).isDisplayed();

	}

	// Click Africa Growth Prospects document
	@Step
	public void Click_AfricaGrowthProspectsdocument() throws InterruptedException {

		Thread.sleep(2000);

		$(By.partialLinkText("Africa’s 2023 Growth Prospects:")).click();

	}

	// Validate Africa Growth Prospects document page
	@Step
	public void Validate_AfricaGrowthProspectsdocumentpage() {

		boolean displayed = $(By.xpath("//h1[@class='entry-title']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Afrexim Commodity Index document
	@Step
	public void Click_AfreximCommodityIndexdocument() {

		$(By.partialLinkText("The Afreximbank Commodity Index AACI 2022")).click();

	}

	// Validate Afrexim Commodity Index document page
	@Step
	public void Validate_AfreximCommodityIndexdocumentpage() {

		boolean displayed = $(By.xpath("//h1[@class='entry-title']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// Click Journal of African Trade document
	@Step
	public void Click_JournalofAfricanTradedocument() {

		$(By.xpath("(//div[@class='block02'])[5]")).click();

	}

	// Validate Journal of African Trade document page
	@Step
	public void Validate_JournalofAfricanTradedocumentpage() {

		boolean displayed = $(By.xpath("//h1[@class='entry-title']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click Country at a glance
	@Step
	public void click_country_at_a_glance() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Country at a Glance - East Africa Region']")).click();

	}

	// Validate Country at a glance page
	@Step
	public void validate_country_at_a_glance_page() {

		boolean displayed = $(By.xpath("//h1[text()='Country at a Glance – East Africa Region']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Egypt Country Brief
	@Step
	public void click_egypt_country_brief() {

		$(By.xpath("//a[text()='Egypt Country Brief']")).click();

	}

	// Validate Egypt country brief page
	@Step
	public void validate_egypt_country_brief_page() {

		boolean displayed = $(By.xpath("//h1[text()='Egypt Country Brief']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Annual Trade Development Effectiveness Report
	@Step
	public void click_annualtradedevelopment_effectivenessreport() {

		$(By.linkText("Annual Trade Development Effectiveness Report 2021")).click();

	}

	// Validate Annual Trade Development Effectiveness Report page
	@Step
	public void validate_annualtradedevelopment_effectivenessreport_page() throws InterruptedException {

		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Annual Trade Development Effectiveness Report 2021']"))
				.isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click Annual Report twenty twenty one
	@Step
	public void click_annualreport_twentytwentyone() {

		$(By.xpath("//a[text()='Annual Report 2021']")).click();

	}

	// Validate Annual report page
	@Step
	public void validate_annualreportpage() {

		boolean displayed = $(By.xpath("//h1[text()='Annual Report 2021']")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click Tunisia Country brief
	@Step
	public void click_tunisiacountrybrief() {

		$(By.xpath("//a[text()='Tunisia Country Brief']")).click();

	}

	// Validate Tunisia Country brief page
	@Step
	public void validate_tunisiacountrybriefpage() {

		boolean displayed = $(By.xpath("//h1[text()='Tunisia Country Brief']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Mauritius Country brief
	@Step
	public void click_mauritiuscountrybrief() {

		$(By.xpath("//a[text()='Mauritius Country Brief']")).click();

	}

	// Validate Mauritius Country brief page
	@Step
	public void validate_mauritiuscountrybrief_page() {

		boolean displayed = $(By.xpath("//h1[text()='Mauritius Country Brief']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Afreximbank Trade and Development Finance Brief
	@Step
	public void click_afreximbanktradeanddevelopment_financebrief() {

		$(By.xpath(
				"//a[text()='Afreximbank Trade and Development Finance Brief (ATDFB) Volume 3 Issue 1 November 2019']"))
				.click();

	}

	// Validate Afreximbank Trade and Development Finance Brief page
	@Step
	public void validate_afreximbanktradeanddevelopment_financebrief_page() {

		boolean displayed = $(By.xpath(
				"//h1[text()='Afreximbank Trade and Development Finance Brief (ATDFB) Volume 3 Issue 1 November 2019']"))
				.isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Trade and market update
	@Step
	public void click_tradeandmarketupdate() {

		$(By.xpath("//a[text()='Trade and Market Update']")).click();

	}

	// Validate Trade and market update page
	@Step
	public void validate_tradeandmarketupdate_page() {

		boolean displayed = $(By.xpath("//h1[text()='Trade and Market Update']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Annual report twenty eighteen
	@Step
	public void click_annualreport_twentyeighteen() {

		$(By.xpath("//a[text()='2018']")).click();

	}

	// Validate Annual report twenty eighteen page
	@Step
	public void validate_annualreport_twentyeighteen_page() {

		boolean displayed = $(By.xpath("//a[text()='Annual Report 2018']")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click Trade & Development Finance Brief Volume two
	@Step
	public void click_tradedevelopment_financebrief_volumetwo() {

		$(By.partialLinkText("Trade & Development Finance")).click();

	}

	// Validate Trade & Development Finance Brief Volume two page
	@Step
	public void validate_tradedevelopment_financebrief_volumetwo_page() {

		String text = $(By.xpath("//h1[text()='Trade & Development Finance Brief Volume 2 Issue 3 December 2018']"))
				.getText();

		Assert.assertEquals("Trade & Development Finance Brief Volume 2 Issue 3 December 2018", text);
	}

	// Click Annual report twenty seventeen
	@Step
	public void click_annualreport_twentyseventeen() {

		$(By.xpath("//a[text()='2017']")).click();

	}

	// Validate Annual report twenty seventeen page
	@Step
	public void validate_annualreport_twentyseventeen_page() {

		boolean displayed = $(By.xpath("(//p[@class='title'])[2]")).isDisplayed();

		Assert.assertTrue(displayed);
	}

	// Click Contemporary Issues in African Trade
	@Step
	public void click_contemporaryissuesinafricantrade() {

		$(By.partialLinkText("Contemporary Issues in African")).click();

	}

	// Validate Contemporary Issues in African Trade page
	@Step
	public void validate_contemporaryissuesinafricantrade_page() throws InterruptedException {

		Thread.sleep(2000);

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Contemporary Issues in African Trade and Trade Finance (CIAT) Vol.3 No.1", text);

	}

	// To click right arrow for twenty sixteen year
	@Step
	public void toclick_rightarrow_for_twentysixteen_year() throws InterruptedException {

		for (int i = 0; i < 1; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click Annual report twenty sixteen
	@Step
	public void click_annualreport_twentysixteen() {

		$(By.xpath("//a[text()='2016']")).click();
	}

	// Validate Annual report twenty sixteen page
	@Step
	public void validate_annualreport_twentysixteen_page() {

		boolean displayed = $(By.xpath("//*[@id='afrexim_reports_entries']/div[2]/div[2]/p[1]/a")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click From Entrepreneur to Corporation
	@Step
	public void click_fromentrepreneurtocorporation() {

		$(By.partialLinkText("ADLS 1/16 From Entrepreneur to Corporation")).click();

	}

	// Validate From Entrepreneur to Corporation page
	@Step
	public void validate_fromentrepreneurtocorporation_page() throws InterruptedException {

		Thread.sleep(2000);

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(
				"ADLS 1/16 From Entrepreneur to Corporation: An Examination of Critical Success Factors and Implications for Access to Credit",
				text);

	}

	// To click right arrow for twenty fifteen year
	@Step
	public void toclick_rightarrow_for_twentyfifteen_year() throws InterruptedException {

		for (int i = 0; i <= 1; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click Annual report twenty fifteen
	@Step
	public void click_annualreport_twentyfifteen() {

		$(By.xpath("//a[text()='2015']")).click();
	}

	// Validate Annual report twenty fifteen page
	@Step
	public void validate_annualreport_twentyfifteen_page() {

		boolean displayed = $(By.xpath("//a[text()='Annual Report 2015']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// Click The Role of China in Africa Development
	@Step
	public void click_roleofchinainafricadevelopment() {

		$(By.partialLinkText("ADLS 1/15 The Role of China in Africa's")).click();

	}

	// Validate The Role of China in Africa Development page
	@Step
	public void validate_roleofchinainafricadevelopment_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "ADLS 1/15 The Role of China in Africa’s Development");

	}

	// To click right arrow for twenty fourteen year
	@Step
	public void toclick_rightarrow_for_twentyfourteen_year() throws InterruptedException {

		for (int i = 0; i <= 2; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click Trade And Development at the dawn
	@Step
	public void click_tradeanddevelopmentatthedawn() {

		$(By.partialLinkText("TRADE AND DEVELOPMENT AT THE DAWN OF")).click();

	}

	// Validate Trade And Development at the dawn page
	@Step
	public void validate_tradeanddevelopmentatthedawn_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "TRADE AND DEVELOPMENT AT THE DAWN OF A NEW MILLENNIUM");

	}

	// Click Leading issues in african trade
	@Step
	public void click_leadingissuesinafricantrade() {

		$(By.partialLinkText("LEADING ISSUES IN AFRICAN TRADE")).click();
	}

	// Validate Leading issues in african trade
	@Step
	public void validate_leadingissuesinafricantrade() {

		boolean displayed = $(By.xpath("//h1[text()='LEADING ISSUES IN AFRICAN TRADE']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To click right arrow for twenty thirteen year
	@Step
	public void toclick_rightarrowfortwentythirteen_year() throws InterruptedException {

		for (int i = 0; i <= 3; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click Statement by Jean Louis Ekra
	@Step
	public void click_statementbyjeanlouisekra() {

		$(By.partialLinkText("Statement by Jean-Louis Ekra")).click();

	}

	// Validate Statement by Jean Louis Ekra
	@Step
	public void validate_statementbyjeanlouisekra() {

		boolean displayed = $(By.xpath("//h1[@class='entry-title']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Annual report twenty thirteen
	@Step
	public void click_annualreport_twentythirteen() {
		$(By.partialLinkText("Annual Report 2013")).click();

	}

	// Validate Annual report twenty thirteen page
	@Step
	public void validate_annualreport_twentythirteen_page() {
		boolean displayed = $(By.xpath("//h1[text()='Annual Report 2013']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To click right arrow for twenty twelve year
	@Step
	public void toclick_rightarrow_for_twentytwelve_year() throws InterruptedException {

		for (int i = 0; i <= 4; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click African trade report twenty twelve
	@Step
	public void click_africantradereport_twentytwelve() {

		$(By.xpath("//a[text()='2012']")).click();

	}

	// Validate African trade report twenty twelve page
	@Step
	public void validate_africantradereport_twentytwelve_page() {

		boolean displayed = $(By.xpath("//a[text()='AFRICAN TRADE REPORT 2012']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Presentation by Jean Louis Ekra
	@Step
	public void click_presentationbyjeanlouisekra() {
		$(By.partialLinkText("Presentation by Jean-Louis Ekra")).click();

	}

	// Validate Presentation by Jean Louis Ekra page
	@Step
	public void validate_presentationbyjeanlouisekra_page() {
		boolean displayed = $(By.partialLinkText("Presentation by Jean-Louis Ekra, President")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click right arrow for twenty eleven year
	@Step
	public void toclick_rightarrow_for_twentyeleven_year() throws InterruptedException {
		for (int i = 0; i <= 5; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click African Trade report twenty eleven
	@Step
	public void click_africantradereport_twentyeleven() {
		$(By.xpath("//a[text()='2011']")).click();
	}

	// Validate African Trade report twenty eleven page
	@Step
	public void validate_africantradereport_twentyeleven_page() {

		boolean displayed = $(By.partialLinkText("AFRICAN TRADE REPORT 2011")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// Click Linking Africa Enclave Extractive Sector
	@Step
	public void click_linkingafricaenclaveextractive_sector() {

		$(By.partialLinkText("ADLS 1/11 Linking Africa's Enclave Extractive Sector to Domestic Economy:")).click();
	}

	// Validate Linking Africa Enclave Extractive Sector page
	@Step
	public void validate_linkingafricaenclaveextractivesector_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text,
				"ADLS 1/11 Linking Africa’s Enclave Extractive Sector to Domestic Economy: Is Local Content Promotion a Panacea? by Mike Morris");

	}

	// To click right arrow for twenty ten year
	@Step
	public void toclick_rightarrow_for_twentyten_year() throws InterruptedException {

		for (int i = 0; i <= 6; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click African Trade report twenty ten
	@Step
	public void click_africantradereport_twentyten() {

		$(By.linkText("AFRICAN TRADE REPORT 2010")).click();
	}

	// Validate African Trade report twenty ten page
	@Step
	public void validate_africantradereport_twentyten_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "AFRICAN TRADE REPORT 2010");

	}

	// Click Annual report twenty ten
	@Step
	public void click_annualreport_twentyten() {

		$(By.linkText("Annual Report 2010")).click();
	}

	// Validate Annual report twenty ten page
	@Step
	public void validate_annualreport_twentyten_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "Annual Report 2010");

	}

	// To click right arrow for twenty nine year
	@Step
	public void toclick_rightarrow_for_twentynine_year() throws InterruptedException {

		for (int i = 0; i <= 7; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// Click African Trade report twenty nine
	@Step
	public void click_africantradereport_twentynine() {

		$(By.linkText("AFRICAN TRADE REPORT 2009")).click();

	}

	// Validate African Trade report twenty nine page
	@Step
	public void validate_africantradereport_twentynine_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "AFRICAN TRADE REPORT 2009");

	}

	// Click Annual report twenty nine
	@Step
	public void clickannualreport_twentynine() {

		$(By.linkText("Annual Report 2009")).click();

	}

	// Validate Annual report twenty nine page
	@Step
	public void validate_annualreport_twentynine_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "Annual Report 2009");
	}

	// ---------------------------------------------------------------------------------------------------

	// Libor_Transition

	// To click Libor Transition option
	@Step
	public void To_click_LiborTransitionOption() {

		$(By.xpath("(//a[text()='Libor Transition'])[1]")).click();
	}

	// To validate the Libor transition page
	@Step

	public void To_validate_the_LiborTransitionPage() {

		$(By.xpath("//h1[text()='Libor Transition']")).isDisplayed();

	}

	// Click Notice: Libor transition link
	@Step

	public void Click_NoticeLiborTransitionLink() {

		$(By.xpath("//a[text()='NOTICE: LIBOR TRANSITION']")).click();

	}

	// Validate the Notice Libor Transition page
	@Step
	public void Validate_the_Notice_LiborTransitionPage() {

		$(By.xpath("//h1[text()='NOTICE: LIBOR TRANSITION']")).isDisplayed();

	}

	// Validate the Notice Libor Transition pdf
	@Step
	public void Validate_the_Notice_LiborTransitionPdf() {

	}

	// Click LIBOR REFORM WEBINAR\\(February) link
	@Step
	public void Click_LiborReformWebinarFebruarylink() {

		$(By.xpath("//a[text()='LIBOR REFORM WEBINAR (February 2022)']")).click();

	}

	// Validate the LIBOR REFORM WEBINAR\\(February) page
	@Step
	public void Validate_the_Libor_ReformWebinarFebruaryPage() {

		$(By.xpath("//h1[text()='LIBOR REFORM WEBINAR (February 2022)']")).isDisplayed();

	}

	// Validate the LIBOR REFORM WEBINAR\\(February) pdf
	@Step
	public void Validate_the_LiborReformWebinarFebruaryPdf() {

	}

	// Click Libor Transition Notice-July link
	@Step
	public void Click_Libor_Transition_Notice_JulyLink() {

		$(By.xpath("//a[text()='Libor Transition Notice-July 2022']")).click();

	}

	// Validate the Libor Transition Notice-July page
	@Step
	public void Validate_the_Libor_Transition_Notice_JulyPage() {

		$(By.xpath("//h1[text()='Libor Transition Notice-July 2022']")).isDisplayed();

	}

	// Validate the Libor Transition Notice-July pdf
	@Step
	public void Validate_the_LiborTransitionNotice_JulyPdf() {

	}

}
