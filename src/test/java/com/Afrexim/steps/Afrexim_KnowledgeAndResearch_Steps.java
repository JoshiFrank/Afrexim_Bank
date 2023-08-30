package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_KnowledgeAndResearch_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_KnowledgeAndResearch_Steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_KnowledgeAndResearch_pages kr;

	@When("To click the Knowledge&Research option")
	public void to_click_the_knowledge_research_option() {

		kr.To_click_theKnowledgeResearchOption();
	}

	@Then("To validate the Knowledge&Research dropdown")
	public void to_validate_the_knowledge_research_dropdown() {

		kr.To_validate_the_KnowledgeResearchDropdown();
	}

	@When("To click About us option")
	public void to_click_about_us_option() {

		kr.To_click_AboutUsOption();
	}

	@Then("To validate the About us option page")
	public void to_validate_the_about_us_option_page() {

		kr.To_validate_theAboutUsOptionPage();
	}

	@Then("Click on Research and Statistics")
	public void click_on_research_and_statistics() {

		kr.Click_on_ResearchAndStatistics();
	}

	@Then("Validate Research and Statistics page")
	public void validate_research_and_statistics_page() {

		kr.Validate_ResearchAndStatisticsPage();
	}

	@Then("Click on Internation Cooperation")
	public void click_on_internation_cooperation() {

		kr.Click_on_InternationCooperation();
	}

	@Then("Validate Internation Cooperation page")
	public void validate_internation_cooperation_page() {

		kr.Validate_InternationCooperationPage();
	}

	@Then("Click on Trade Policy and Market access")
	public void click_on_trade_policy_and_market_access() {

		kr.Click_on_TradePolicyAnd_MarketAccess();
	}

	@Then("Validate Trade Policy and Market access page")
	public void validate_trade_policy_and_market_access_page() {

		kr.Validate_TradePolicyAndMarketAccessPage();
	}

	@Then("Click Library & Knowledge Centre")
	public void click_library_knowledge_centre() {

		kr.Click_LibraryKnowledgeCentre();
	}

	@Then("Validate Library & Knowledge Centre page")
	public void validate_library_knowledge_centre_page() {

		kr.Validate_Library_KnowledgeCentrePage();

	}

	@Then("Click Afreximbank Library Online Public Access Catalogue")
	public void click_afreximbank_library_online_public_access_catalogue() {

		kr.Click_Afreximbank_LibraryOnlinePublicAccessCatalogue();
	}

	@Then("Validate Afreximbank Library Online Public Access Catalogue page")
	public void validate_afreximbank_library_online_public_access_catalogue_page() {

		kr.Validate_Afreximbank_LibraryOnlinePublicAccessCataloguePage();
	}

	@Then("Click Call for papers -CIAT")
	public void click_call_for_papers_ciat() {

		kr.Click_Call_forPapersCIAT();
	}

	@Then("Validate Call for papers -CIAT page")
	public void validate_call_for_papers_ciat_page() {

		kr.Validate_Call_forPapersCIATPage();
	}

	@Then("Enter first name in ciat page {string}")
	public void enter_first_name_in_ciat_page(String string) {

		kr.Enter_firstNameInCiatPage(string);
	}

	@Then("Enter last name in ciat page {string}")
	public void enter_last_name_in_ciat_page(String string) {

		kr.Enter_lastNameInCiatPage(string);
	}

	@Then("Enter email address in ciat page {string}")
	public void enter_email_address_in_ciat_page(String string) {

		kr.Enter_emailAddressInCiatPage(string);
	}

	@Then("Enter institution in ciat page {string}")
	public void enter_institution_in_ciat_page(String string) {

		kr.Enter_institutionInCiatPage(string);
	}

	@Then("Enter description in ciat page {string}")
	public void enter_description_in_ciat_page(String string) {

		kr.Enter_descriptionInCiatPage(string);
	}

	@Then("To upload document in ciat page")
	public void to_upload_document_in_ciat_page() {

		kr.To_upload_documentInCiatPage();
	}

	@Then("To validate document uploaded successfully in ciat page")
	public void to_validate_document_uploaded_successfully_in_ciat_page() {

	}

	@Then("To select check box in ciat page")
	public void to_select_check_box_in_ciat_page() throws InterruptedException, AWTException {

		kr.To_select_checkBoxInCiatPage();
	}

	@Then("To click submit button in ciat page")
	public void to_click_submit_button_in_ciat_page() {

		kr.To_click_submitButtonInCiatPage();

	}

	@Then("Validate Submission Confirmation in ciat page")
	public void validate_submission_confirmation_in_ciat_page() {

	}

	@Then("Click Call for papers –AWPS")
	public void click_call_for_papers_awps() {

		kr.Click_Call_for_papersAWPS();

	}

	@Then("Validate Call for papers –AWPS")
	public void validate_call_for_papers_awps() {

		kr.Validate_callForPapersAWPS();

	}

	@Then("Enter first name in awps page {string}")
	public void enter_first_name_in_awps_page(String string) {

		kr.Enter_firstNameInAwpsPage(string);

	}

	@Then("Enter last name in awps page {string}")
	public void enter_last_name_in_awps_page(String string) {

		kr.Enter_lastNameInAwpsPage(string);

	}

	@Then("Enter email in awps page {string}")
	public void enter_email_in_awps_page(String string) {

		kr.Enter_emailIn_awpsPage(string);
	}

	@Then("Enter institution in awps page {string}")
	public void enter_institution_in_awps_page(String string) {

		kr.Enter_institutionInAwpsPage(string);
	}

	@Then("Enter description in awps page {string}")
	public void enter_description_in_awps_page(String string) {

		kr.Enter_descriptionInAwpsPage(string);

	}

	@Then("Upload document in awps page")
	public void upload_document_in_awps_page() {

		kr.Upload_documentInAwpsPage();

	}

	@Then("Validate Document Uploaded successfully in  awps page")
	public void validate_document_uploaded_successfully_in_awps_page() {

	}

	@Then("Click checkbox in awps page")
	public void click_checkbox_in_awps_page() throws AWTException, InterruptedException {

		kr.Click_checkboxInAwpsPage();
	}

	@Then("Click submit in awps page")
	public void click_submit_in_awps_page() {

		kr.Click_submitInAwpsPage();
	}

	@Then("Validate Submission Confirmation in awps page")
	public void validate_submission_confirmation_in_awps_page() {

	}

	@Then("Click JAT – Submission of papers")
	public void click_jat_submission_of_papers() {

		kr.Click_JATSubmissionOfPapers();
	}

	@Then("Validate JAT – Submission of papers page")
	public void validate_jat_submission_of_papers_page() {

		kr.Validate_JATSubmissionOfPapersPage();

	}

	
	
	//---------------------------------------------------------------------------------------------------
	
	//Publications
	
	@When("To click Publications option")
	public void to_click_publications_option() throws InterruptedException {
		Thread.sleep(3000);
		kr.Toclick_Publicationsoption();
	   
	}

	@Then("To validate the publications page")
	public void to_validate_the_publications_page() {
		
		kr.Tovalidate_publicationspage();
	  
	}
	
	@Then("Click dropdown down arrow button in box")
	public void click_dropdown_down_arrow_button_in_box() {
		
		kr.Click_dropdowndownarrowbuttoninbox();
	   
	}
	
	@Then("Validate dropdown results")
	public void validate_dropdown_results() {
		
		kr.Validate_dropdownresults();
	    
	}

	@Then("Click Publications")
	public void click_publications() throws InterruptedException {
		
		kr.Click_Publications();
	   
	}

	@Then("Click Filter button")
	public void click_filter_button() throws InterruptedException {
		
		kr.Click_Filterbutton();
	    
	}

	@Then("Scroll down and click View all")
	public void scroll_down_and_click_view_all() throws InterruptedException {
		
		kr.Scrolldown_clickViewall();
	   
	}

	@Then("Click African trade Report document")
	public void click_african_trade_report_document() {
		
		kr.Click_AfricantradeReportdocument();
	   
	}

	@Then("Validate African trade Report document page")
	public void validate_african_trade_report_document_page() {
		
		kr.Validate_AfricantradeReport_documentpage();
	}

	@Then("Click Download button")
	public void click_download_button() throws InterruptedException {
		
		kr.Click_Downloadbutton();
	    
	}

	@Then("Validate African trade Report Download pdf")
	public void validate_african_trade_report_download_pdf() {
		
		kr.Validate_AfricantradeReport_Downloadpdf();
	   
	}
	
	@When("Click Africa Growth Prospects document")
	public void click_africa_growth_prospects_document() throws InterruptedException {
		
		kr.Click_AfricaGrowthProspectsdocument();
	    
	}

	@Then("Validate Africa Growth Prospects document page")
	public void validate_africa_growth_prospects_document_page() {
		
		kr.Validate_AfricaGrowthProspectsdocumentpage();
	    
	}

	@When("Click Afrexim Commodity Index document")
	public void click_afrexim_commodity_index_document() {
		
		kr.Click_AfreximCommodityIndexdocument();
	    
	}

	@Then("Validate Afrexim Commodity Index document page")
	public void validate_afrexim_commodity_index_document_page() {
		
		kr.Validate_AfreximCommodityIndexdocumentpage();
	    
	}

	@When("Click Journal of African Trade document")
	public void click_journal_of_african_trade_document() {
		
		kr.Click_JournalofAfricanTradedocument();
	    
	}

	@Then("Validate Journal of African Trade document page")
	public void validate_journal_of_african_trade_document_page() {
		
		kr.Validate_JournalofAfricanTradedocumentpage();
	   
	}
	
	
	@Then("Click Country at a glance")
	public void click_country_at_a_glance() throws InterruptedException {
		
	    kr.click_country_at_a_glance();
	}

	@Then("Validate Country at a glance page")
	public void validate_country_at_a_glance_page() {
		
	    kr.validate_country_at_a_glance_page();
	}

	@When("Click Egypt Country Brief")
	public void click_egypt_country_brief() {
		
	    kr.click_egypt_country_brief();
	}

	@Then("Validate Egypt country brief page")
	public void validate_egypt_country_brief_page() {
	    
		kr.validate_egypt_country_brief_page();
	}

	@When("Click Annual Trade Development Effectiveness Report")
	public void click_annual_trade_development_effectiveness_report() {
		
		
	    kr.click_annualtradedevelopment_effectivenessreport();
	}

	@Then("Validate Annual Trade Development Effectiveness Report page")
	public void validate_annual_trade_development_effectiveness_report_page() throws InterruptedException {
		
		kr.validate_annualtradedevelopment_effectivenessreport_page();
	    
	}

	@When("Click Annual Report twenty twenty one")
	public void click_annual_report_twenty_twenty_one() {
	    
		kr.click_annualreport_twentytwentyone();
	}

	@Then("Validate Annual report page")
	public void validate_annual_report_page() {
		
	    kr.validate_annualreportpage();
		
	}

	@When("Click Tunisia Country brief")
	public void click_tunisia_country_brief() {
		
	    kr.click_tunisiacountrybrief();
	}

	@Then("Validate Tunisia Country brief page")
	public void validate_tunisia_country_brief_page() {
	    
		kr.validate_tunisiacountrybriefpage();
	}

	@When("Click Mauritius Country brief")
	public void click_mauritius_country_brief() {
	    
		
		kr.click_mauritiuscountrybrief();
	}

	@Then("Validate Mauritius Country brief page")
	public void validate_mauritius_country_brief_page() {
	    
		
		kr.validate_mauritiuscountrybrief_page();
	}

	@When("Click Afreximbank Trade and Development Finance Brief")
	public void click_afreximbank_trade_and_development_finance_brief() {
	    
		kr.click_afreximbanktradeanddevelopment_financebrief();
	}

	@Then("Validate Afreximbank Trade and Development Finance Brief page")
	public void validate_afreximbank_trade_and_development_finance_brief_page() {
	    
		
		kr.validate_afreximbanktradeanddevelopment_financebrief_page();
	}

	@When("Click Trade and market update")
	public void click_trade_and_market_update() {
	    
		
		kr.click_tradeandmarketupdate();
	}

	@Then("Validate Trade and market update page")
	public void validate_trade_and_market_update_page() {
	    
		
		kr.validate_tradeandmarketupdate_page();
	}

	@When("Click Annual report twenty eighteen")
	public void click_annual_report_twenty_eighteen() {
	    
		kr.click_annualreport_twentyeighteen();
	}

	@Then("Validate Annual report twenty eighteen page")
	public void validate_annual_report_twenty_eighteen_page() {
	    
		
		kr.validate_annualreport_twentyeighteen_page();
	}

	@When("Click Trade & Development Finance Brief Volume two")
	public void click_trade_development_finance_brief_volume_two() {
	    
		
		kr.click_tradedevelopment_financebrief_volumetwo();
	}

	@Then("Validate Trade & Development Finance Brief Volume two page")
	public void validate_trade_development_finance_brief_volume_two_page() {
	    
		
		//kr.validate_trade_development_finance_brief_volume_two_page();
	}

	@When("Click Annual report twenty seventeen")
	public void click_annual_report_twenty_seventeen() {
		
		
		
		kr.click_annualreport_twentyseventeen();
		
	    
	}

	@Then("Validate Annual report twenty seventeen page")
	public void validate_annual_report_twenty_seventeen_page() {
	    
		kr.validate_annualreport_twentyseventeen_page();
	}

	@When("Click Contemporary Issues in African Trade")
	public void click_contemporary_issues_in_african_trade() {
	    
		
		kr.click_contemporaryissuesinafricantrade();
	}

	@Then("Validate Contemporary Issues in African Trade page")
	public void validate_contemporary_issues_in_african_trade_page() throws InterruptedException {
	    
		
		kr.validate_contemporaryissuesinafricantrade_page();
	}

	@When("To click right arrow for twenty sixteen year")
	public void to_click_right_arrow_for_twenty_sixteen_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentysixteen_year();
	}

	@When("Click Annual report twenty sixteen")
	public void click_annual_report_twenty_sixteen() {
	    
		
		kr.click_annualreport_twentysixteen();
	}

	@Then("Validate Annual report twenty sixteen page")
	public void validate_annual_report_twenty_sixteen_page() {
	    
		
		kr.validate_annualreport_twentysixteen_page();
	}

	@When("Click From Entrepreneur to Corporation")
	public void click_from_entrepreneur_to_corporation() {
	    
		
		kr.click_fromentrepreneurtocorporation();
	}

	@Then("Validate From Entrepreneur to Corporation page")
	public void validate_from_entrepreneur_to_corporation_page() throws InterruptedException {
	    
		
		kr.validate_fromentrepreneurtocorporation_page();
	}

	@When("To click right arrow for twenty fifteen year")
	public void to_click_right_arrow_for_twenty_fifteen_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentyfifteen_year();
	}

	@When("Click Annual report twenty fifteen")
	public void click_annual_report_twenty_fifteen() {
	    
		kr.click_annualreport_twentyfifteen();
		
	}

	@Then("Validate Annual report twenty fifteen page")
	public void validate_annual_report_twenty_fifteen_page() {
	    
		
		kr.validate_annualreport_twentyfifteen_page();
		
	}

	@When("Click The Role of China in Africa Development")
	public void click_the_role_of_china_in_africa_development() {
	    
		
		kr.click_roleofchinainafricadevelopment();
	}

	@Then("Validate The Role of China in Africa Development page")
	public void validate_the_role_of_china_in_africa_development_page() {
	    
		
		kr.validate_roleofchinainafricadevelopment_page();
	}

	@When("To click right arrow for twenty fourteen year")
	public void to_click_right_arrow_for_twenty_fourteen_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentyfourteen_year();
	}

	@When("Click Trade And Development at the dawn")
	public void click_trade_and_development_at_the_dawn() {
	    
		
		kr.click_tradeanddevelopmentatthedawn();
	}

	@Then("Validate Trade And Development at the dawn page")
	public void validate_trade_and_development_at_the_dawn_page() {
	    
		
		kr.validate_tradeanddevelopmentatthedawn_page();
	}

	@When("Click Leading issues in african trade")
	public void click_leading_issues_in_african_trade() {
	    
		
		kr.click_leadingissuesinafricantrade();
	}

	@Then("Validate Leading issues in african trade")
	public void validate_leading_issues_in_african_trade() {
	   
		
		kr.validate_leadingissuesinafricantrade();
	}

	@When("To click right arrow for twenty thirteen year")
	public void to_click_right_arrow_for_twenty_thirteen_year() throws InterruptedException {
	    
		
	kr.toclick_rightarrowfortwentythirteen_year();
	
	}

	@When("Click Statement by Jean Louis Ekra")
	public void click_statement_by_jean_louis_ekra() {
		
		kr.click_statementbyjeanlouisekra();
	    
	}

	@Then("Validate Statement by Jean Louis Ekra")
	public void validate_statement_by_jean_louis_ekra() {
	    		
		kr.validate_statementbyjeanlouisekra();
	}

	@When("Click Annual report twenty thirteen")
	public void click_annual_report_twenty_thirteen() {
	    
		
		kr.click_annualreport_twentythirteen();
	}

	@Then("Validate Annual report twenty thirteen page")
	public void validate_annual_report_twenty_thirteen_page() {
	    
		kr.validate_annualreport_twentythirteen_page();
		
	}

	@When("To click right arrow for twenty twelve year")
	public void to_click_right_arrow_for_twenty_twelve_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentytwelve_year();
	}

	@When("Click African trade report twenty twelve")
	public void click_african_trade_report_twenty_twelve() {
	    
		
		kr.click_africantradereport_twentytwelve();
	}

	@Then("Validate African trade report twenty twelve page")
	public void validate_african_trade_report_twenty_twelve_page() {
	    
		
		kr.validate_africantradereport_twentytwelve_page();
	}

	@When("Click Presentation by Jean Louis Ekra")
	public void click_presentation_by_jean_louis_ekra() {
	    
		
		kr.click_presentationbyjeanlouisekra();
	}

	@Then("Validate Presentation by Jean Louis Ekra page")
	public void validate_presentation_by_jean_louis_ekra_page() {
	    
		
		kr.validate_presentationbyjeanlouisekra_page();
	}

	@When("To click right arrow for twenty eleven year")
	public void to_click_right_arrow_for_twenty_eleven_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentyeleven_year();
	}

	@When("Click African Trade report twenty eleven")
	public void click_african_trade_report_twenty_eleven() {
	    
		
		kr.click_africantradereport_twentyeleven();
	}

	@Then("Validate African Trade report twenty eleven page")
	public void validate_african_trade_report_twenty_eleven_page() {
	    
		
		kr.validate_africantradereport_twentyeleven_page();
	}

	@When("Click Linking Africa Enclave Extractive Sector")
	public void click_linking_africa_enclave_extractive_sector() {
	    
		
		kr.click_linkingafricaenclaveextractive_sector();
	}

	@Then("Validate Linking Africa Enclave Extractive Sector page")
	public void validate_linking_africa_enclave_extractive_sector_page() {
	    
		
		kr.validate_linkingafricaenclaveextractivesector_page();
	}

	@When("To click right arrow for twenty ten year")
	public void to_click_right_arrow_for_twenty_ten_year() throws InterruptedException {
		
		
	    kr.toclick_rightarrow_for_twentyten_year();
	}

	@When("Click African Trade report twenty ten")
	public void click_african_trade_report_twenty_ten() {
	    
		
		kr.click_africantradereport_twentyten();
	}

	@Then("Validate African Trade report twenty ten page")
	public void validate_african_trade_report_twenty_ten_page() {
	    
		
		kr.validate_africantradereport_twentyten_page();
	}

	@When("Click Annual report twenty ten")
	public void click_annual_report_twenty_ten() {
	    
		
		kr.click_annualreport_twentyten();
	}

	@Then("Validate Annual report twenty ten page")
	public void validate_annual_report_twenty_ten_page() {
	    
		
		kr.validate_annualreport_twentyten_page();
	}

	@When("To click right arrow for twenty nine year")
	public void to_click_right_arrow_for_twenty_nine_year() throws InterruptedException {
	    
		
		kr.toclick_rightarrow_for_twentynine_year();
	}

	@When("Click African Trade report twenty nine")
	public void click_african_trade_report_twenty_nine() {
	    
		
		kr.click_africantradereport_twentynine();
	}

	@Then("Validate African Trade report twenty nine page")
	public void validate_african_trade_report_twenty_nine_page() {
	    
		
		kr.validate_africantradereport_twentynine_page();
	}

	@When("Click Annual report twenty nine")
	public void click_annual_report_twenty_nine() {
	    
		
		kr.click_africantradereport_twentynine();
	}

	@Then("Validate Annual report twenty nine page")
	public void validate_annual_report_twenty_nine_page() {
	    
		
		kr.validate_annualreport_twentynine_page();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//--------------------------------------------------------------------------------------
	//Libor_Transition
	
	@When("To click Libor Transition option")
	public void to_click_libor_transition_option() {

		kr.To_click_LiborTransitionOption();
	
	}

	@Then("To validate the Libor transition page")
	public void to_validate_the_libor_transition_page() {

		kr.To_validate_the_LiborTransitionPage();
	
	}

	@When("Click Notice: Libor transition link")
	public void click_notice_libor_transition_link() {

		kr.Click_NoticeLiborTransitionLink();
	
	}

	@Then("Validate the Notice Libor Transition page")
	public void validate_the_notice_libor_transition_page() {

		kr.Validate_the_Notice_LiborTransitionPage();
	
	}

	@Then("Validate the Notice Libor transition pdf")
	public void validate_the_notice_libor_transition_pdf() {

	
		kr.Validate_the_Notice_LiborTransitionPdf();
	}

	@When("Click LIBOR REFORM WEBINAR\\(February) link")
	public void click_libor_reform_webinar_february_link() {

	
		kr.Click_LiborReformWebinarFebruarylink();
	}

	@Then("Validate the LIBOR REFORM WEBINAR\\(February) page")
	public void validate_the_libor_reform_webinar_february_page() {

	
		kr.Validate_the_Libor_ReformWebinarFebruaryPage();
	}

	@Then("Validate the LIBOR REFORM WEBINAR\\(February) pdf")
	public void validate_the_libor_reform_webinar_february_pdf() {

	
		kr.Validate_the_LiborReformWebinarFebruaryPdf();
	}

	@When("Click Libor Transition Notice-July link")
	public void click_libor_transition_notice_july_link() {

	
		kr.Click_Libor_Transition_Notice_JulyLink();
	}
	
	@Then("Validate the Libor Transition Notice-July page")
	public void validate_the_libor_transition_notice_july_page() {

		kr.Validate_the_Libor_Transition_Notice_JulyPage();
	
	}

	@Then("Validate the Libor Transition Notice-July pdf")
	public void validate_the_libor_transition_notice_july_pdf() {

	
		kr.Validate_the_LiborTransitionNotice_JulyPdf();
	}

}
