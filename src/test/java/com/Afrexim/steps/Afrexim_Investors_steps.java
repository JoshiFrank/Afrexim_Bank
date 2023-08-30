package com.Afrexim.steps;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Investors_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Investors_steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_Investors_pages inp;

	@When("Select the Investers option")
	public void select_the_investers_option() {

		inp.Click_Investors_option();

	}
	
	
	@Then("To validate the Investors dropdown")
	public void to_validate_the_investors_dropdown() {

	
	}
//-------------------------------------------------------------------------------------------
	
	//Financial Information functionality

		@When("Clicks on the Financial Information under Investors")
		public void clicks_on_the_financial_information_under_investors() {

		
		}

		@Then("Validate the Youtube video")
		public void validate_the_youtube_video() {

		
		}

		@Then("Validate the image")
		public void validate_the_image() {

		
		}

		@When("To click right arrow and check whether years from twenty- twenty three to Nineteen ninety five are present")
		public void to_click_right_arrow_and_check_whether_years_from_twenty_twenty_three_to_nineteen_ninety_five_are_present() {

		
		}

		@When("Click Afreximbank Abridged Unaudited Financial Statements document")
		public void click_afreximbank_abridged_unaudited_financial_statements_document() {

		
		}
	
	
		@Then("Validate Afreximbank Abridged Unaudited Financial Statements document")
		public void validate_afreximbank_abridged_unaudited_financial_statements_document() {

		}

		@Then("Validate Afreximbank Abridged Unaudited Financial Statements download pdf")
		public void validate_afreximbank_abridged_unaudited_financial_statements_download_pdf() {

		
		}

		@Then("Click Annual report twenty twenty two document")
		public void click_annual_report_twenty_twenty_two_document() {

		
		}

		@Then("Validate Annual report twenty twenty two document")
		public void validate_annual_report_twenty_twenty_two_document() {

		
		}

		@Then("Validate Annual report twenty twenty two download pdf")
		public void validate_annual_report_twenty_twenty_two_download_pdf() {

		
		}

		@Then("Click Annual Report twenty twenty one document")
		public void click_annual_report_twenty_twenty_one_document() {

		
		}
	
		@Then("Validate Annual Report twenty twenty one document")
		public void validate_annual_report_twenty_twenty_one_document() {

		
		}

		@Then("Validate Annual Report twenty twenty one download pdf")
		public void validate_annual_report_twenty_twenty_one_download_pdf() {

		
		}

		@Then("Click Afreximbank Nine Months twenty twenty Results Presentation document")
		public void click_afreximbank_nine_months_twenty_twenty_results_presentation_document() {

		
		}

		@Then("Validate Afreximbank Nine Months twenty twenty Results Presentation document")
		public void validate_afreximbank_nine_months_twenty_twenty_results_presentation_document() {

		
		}
	
	
	
		@Then("Validate Afreximbank Nine Months twenty twenty Results Presentation download pdf")
		public void validate_afreximbank_nine_months_twenty_twenty_results_presentation_download_pdf() {

		
		}

		@Then("Click ANNUAL REPORT twenty nineteen document")
		public void click_annual_report_twenty_nineteen_document() {

		
		}

		@Then("Validate ANNUAL REPORT twenty nineteen document")
		public void validate_annual_report_twenty_nineteen_document() {

		
		}

		@Then("Validate ANNUAL REPORT twenty nineteen download pdf")
		public void validate_annual_report_twenty_nineteen_download_pdf() {

		
		}
		@Then("Click Moody s rating report twenty eighteen document")
		public void click_moody_s_rating_report_twenty_eighteen_document() {

		
		}

		@Then("Validate Moody s rating report twenty eighteen document")
		public void validate_moody_s_rating_report_twenty_eighteen_document() {

		
		}

		@Then("Validate Moody s rating report twenty eighteen download pdf")
		public void validate_moody_s_rating_report_twenty_eighteen_download_pdf() {

		}
	
	
		
		
		
		
		//-----
	
	
	

	@When("Click IPO link under Investers")
	public void click_ipo_link_under_investers() {

		inp.Click_IPO_link();

	}

	@When("Select the country and jurisdication")
	public void select_the_country_and_jurisdication() {

		inp.Select_the_country_and_jurisdication();

	}

	@When("Click Submit")
	public void click_submit() {

		inp.Click_Submit_Button();

	}

	@When("Verify IPO disclaimer page")
	public void verify_ipo_disclaimer_page() {

		inp.Verify_IPO_disclaimer_page();
	}

	@When("Scroll down and click I AGREE check box")
	public void scroll_down_and_click_i_agree_check_box() {

		inp.Scroll_down_and_click_IAGREE_checkbox();

	}

	@When("Click I agree button")
	public void click_i_agree_button() {

		inp.Click_Iagree_button();

	}

	@When("Verify IPO Documents page")
	public void verify_ipo_documents_page() {

		inp.Verify_IPO_Documents_page();

	}

	@When("Click Registration document for open")
	public void click_registration_document_for_open() {

		inp.Click_Registration_document_for_open();

	}

	@Then("Registration Document open as pdf")
	public void registration_document_open_as_pdf() throws InterruptedException {

		
		Thread.sleep(3000);

	}
	//-----------------------------------------------------------------------------------------------------------------
	
	//Credit Ratings Reports
		@When("Clicks on the Credit Ratings Reports under Investors")
		public void clicks_on_the_credit_ratings_reports_under_investors() {
			inp.Clicks_on_theCreditRatingsReportsUnderInvestors();
		}

		@Then("Validate the Credit Ratings Reports page")
		public void validate_the_credit_ratings_reports_page() {
			inp.Validate_theCreditRatingsReportsPage();

		}

		@When("Click Moody’s Rating Report TwentyTwentyThree link")
		public void click_moody_s_rating_report_twenty_twenty_three_link() {

			inp.Click_MoodysRatingReportTwentyTwentyThreeLink();
		}

		@Then("Validate Moody’s Rating Report TwentyTwentyThree download pdf")
		public void validate_moody_s_rating_report_twenty_twenty_three_download_pdf() {

			
		}

		@When("Click Fitch Rating Report TwentyTwentyThree link")
		public void click_fitch_rating_report_twenty_twenty_three_link() {
			inp.ClickFitchRatingReportTwentyTwentyThreeLink();
		
		}

		@Then("Validate Fitch Rating Report TwentyTwentyThree download pdf")
		public void validate_fitch_rating_report_twenty_twenty_three_download_pdf() {

		
		}

		@When("Click GCR Rating Report TwentyTwentyThree link")
		public void click_gcr_rating_report_twenty_twenty_three_link() {

		inp.ClickGCRRatingReportTwentyTwentyThreeLink();
		}

		@Then("Validate GCR Rating Report TwentyTwentyThree download pdf")
		public void validate_gcr_rating_report_twenty_twenty_three_download_pdf() {

		
		}

		@When("Click JCR Rating Report TwentyTwentyThree link")
		public void click_jcr_rating_report_twenty_twenty_three_link() {

			inp.ClickJCRRatingReportTwentyTwentyThreeLink();
		}

		@Then("Validate JCR Rating Report TwentyTwentyThree download pdf")
		public void validate_jcr_rating_report_twenty_twenty_three_download_pdf() {

		
		}
	


}
