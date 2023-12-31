package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Investors_pages extends PageObject {

	// To click Investors option
	@Step
	public void Click_Investors_option() {

		$(By.xpath("(//span[text()='Investors'])[1]")).click();

	}

	// To validate the Investors dropdown
	@Step
	public void To_validate_theInvestorsDropdown() {
		boolean displayed = $(By.xpath("//*[@id='menu-item-20582']/ul")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// --------------------------------------------------------------------------------------------
	// Financial Information

	// Clicks on the Financial Information under Investors
	@Step
	public void Click_on_theFinancialInformationUnderInvestors() {

		$(By.xpath("(//a[text()='Financial Information'])[1]")).click();

	}

	// Validate the Youtube video
	@Step
	public void Validate_theYoutubeVideo() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		$(By.xpath("//div[@class='video-container03']")).isDisplayed();

	}

	// Validate the image
	@Step
	public void Validate_theImage() {

		$(By.xpath("//h2[text()='Key Facts and Figures as at 30 June 2023']")).isDisplayed();

	}

	// To click right arrow and check whether years from twenty- twenty three to
	// Nineteen ninety five are present")

	@Step
	public void To_click_right_arrow_and_check_whether_years_from_twenty_twenty_three_to_NineteenNinetyFiveArePresent() {

	}

	// Click Afreximbank Abridged Unaudited Financial Statements document
	@Step
	public void Click_Afreximbank_Abridged_Unaudited_FinancialStatementsDocument() {

		$(By.partialLinkText("Afreximbank Abridged Unaudited")).click();
	}

	// Validate Afreximbank Abridged Unaudited Financial Statements document")
	@Step
	public void Validate_Afreximbank_Abridged_Unaudited_FinancialStatementsDocument() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Afreximbank Abridged Unaudited Financial Statements – H1 30 June 2023", text);
	}

	// Validate Afreximbank Abridged Unaudited Financial Statements download pdf
	@Step
	public void Validate_Afreximbank_Abridged_Unaudited_FinancialStatementsDownloadPdf() {

	}

	// Click Annual report twenty twenty two document
	@Step
	public void Click_Annual_report_TwentyTwentyTwoDocument() {

		$(By.linkText("Annual report 2022")).click();

	}

	// Validate Annual report twenty twenty two document
	@Step
	public void Validate_Annual_report_TwentyTwentyTwoDocument() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Annual report 2022", text);

	}

	// Validate Annual report twenty twenty two download pdf
	@Step
	public void Validate_Annual_report_TwentyTwentyTwoDownloadPdf() {

	}

	// Click Annual Report twenty twenty one document
	@Step
	public void Click_Annual_Report_TwentyTwentyOneDocument() {

		$(By.linkText("Annual Report 2021")).click();
	}

	// Validate Annual Report twenty twenty one document
	@Step
	public void Validate_Annual_Report_TwentyTwentyOneDocument() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Annual Report 2021", text);
		
	}

	// Validate Annual Report twenty twenty one download pdf
	@Step
	public void Validate_Annual_Report_TwentyTwentyOneDownloadPdf() {

	}

	// Click Afreximbank Nine Months twenty twenty Results Presentation document
	@Step
	public void Click_Afreximbank_Nine_Months_TwentyTwentyResultsPresentationDocument() {

		
		$(By.linkText("Afreximbank Nine Months 2020 Results Presentation")).click();
	}

	// Validate Afreximbank Nine Months twenty twenty Results Presentation document
	@Step
	public void Validate_Afreximbank_Nine_MonthsTwentyTwentyResultsPresentationDocument() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Afreximbank Nine Months 2020 Results Presentation", text);
		
	}

	// Validate Afreximbank Nine Months twenty twenty Results Presentation download
	// pdf
	@Step
	public void Validate_Afreximbank_Nine_Months_TwentyTwentyResultsPresentationDownloadPdf() {

	}

	// Click ANNUAL REPORT twenty nineteen document
	@Step
	public void Click_ANNUAL_REPORT_TwentyNineteenDocument() {

		$(By.linkText("ANNUAL REPORT 2019")).click();
	}

	// Validate ANNUAL REPORT twenty nineteen document
	@Step
	public void Validate_ANNUAL_REPORT_TwentyNineteenDocument() {

		
		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("ANNUAL REPORT 2019",text);
	}

	// Validate ANNUAL REPORT twenty nineteen download pdf
	@Step
	public void Validate_ANNUAL_REPORT_TwentyNineteenDownloadPdf() {

	}

	// Click Moody s rating report twenty eighteen document
	@Step
	public void Click_Moody_s_rating_report_twentyEighteenDocument() {
		
$(By.linkText("Moody's rating report 2018")).click();

	}

	// Validate Moody s rating report twenty eighteen document
	public void Validate_Moody_s_rating_report_twentyEighteenDocument() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals("Moody’s rating report 2018",text);
	}

	// Validate Moody s rating report twenty eighteen download pdf
	public void Validate_Moody_s_rating_report_twentyeighteenDownloadPdf() {

	}

	// To click IPO link
	@Step
	public void Click_IPO_link() {

		$(By.xpath("(//a[text()='IPO'])[1]")).click();

	}

	// Select the country and jurisdication
	@Step
	public void Select_the_country_and_jurisdication() {

		$(By.xpath("//select[@id='input_23_1']")).selectByIndex(2);

		$(By.xpath("//select[@id='input_23_1']")).sendKeys(Keys.TAB);

		$(By.xpath("//select[@id='input_23_2']")).selectByIndex(2);

	}

	// Click Submit button
	@Step
	public void Click_Submit_Button() {

		$(By.xpath("//input[@id='gform_submit_button_23']")).click();

	}

	// Verify IPO Disclaimer page
	@Step
	public void Verify_IPO_disclaimer_page() {

		$(By.xpath("//h1[text()='IPO Disclaimer']")).isDisplayed();

	}

	// Scroll down and click I AGREE check box
	@Step
	public void Scroll_down_and_click_IAGREE_checkbox() {

		$(By.id("input_24_1_1")).click();

	}

	// Click I agree button
	@Step
	public void Click_Iagree_button() {

		$(By.xpath("//input[@id='gform_submit_button_24']")).click();

	}

	// Verify IPO Documents page
	@Step
	public void Verify_IPO_Documents_page() {

		$(By.xpath("//h1[text()='IPO Documents']")).isDisplayed();

	}

	// Click Registration document for open
	@Step
	public void Click_Registration_document_for_open() {

		$(By.xpath("//*[text()='REGISTRATION DOCUMENT']")).click();

	}

	// Registration Document open as pdf
	@Step
	public void Registration_Document() {

		$(By.xpath("//*[@type='application/x-google-chrome-pdf']")).isDisplayed();

	}

	// -----------------------------------------------------------------
	// Credit Ratings Reports

	// Clicks on the Credit Ratings Reports under Investors
	@Step
	public void Clicks_on_theCreditRatingsReportsUnderInvestors() {
		$(By.xpath("(//a[text()='Credit Ratings Reports'])[1]")).click();
	}

	// Validate the Credit Ratings Reports page
	@Step
	public void Validate_theCreditRatingsReportsPage() {
		$(By.xpath("//h1[text()='Credit Ratings Reports']")).isDisplayed();

	}

	// Click Moody’s Rating Report TwentyTwentyThree link
	@Step
	public void Click_MoodysRatingReportTwentyTwentyThreeLink() {
		$(By.xpath("//a[text()='Moody’s Rating Report 2023']")).click();

	}

	// Validate Moody’s Rating Report TwentyTwentyThree download pdf
	@Step
	public void ValidateMoodysRatingReportTwentyTwentyThreeDownloadPdf() {

	}

	// Click Fitch Rating Report TwentyTwentyThree link
	@Step
	public void ClickFitchRatingReportTwentyTwentyThreeLink() {
		$(By.xpath("//a[text()='Fitch Rating Report 2023']")).click();

	}

	// Validate Fitch Rating Report TwentyTwentyThree download pdf
	@Step
	public void ValidateFitchRatingReportTwentyTwentyThreeDownloadPdf() {

	}

	// Click GCR Rating Report TwentyTwentyThree link
	@Step
	public void ClickGCRRatingReportTwentyTwentyThreeLink() {
		$(By.xpath("//a[text()='GCR Rating Report 2023']")).click();

	}

	// Validate GCR Rating Report TwentyTwentyThree download pdf
	@Step
	public void ValidateGCRRatingReportTwentyTwentyThreeDownloadPdf() {

	}

	// Click JCR Rating Report TwentyTwentyThree link
	@Step
	public void ClickJCRRatingReportTwentyTwentyThreeLink() {
		$(By.xpath("//a[text()='Moody’s Rating Report 2023']")).click();

	}

	// Validate JCR Rating Report TwentyTwentyThree download pdf
	@Step
	public void ValidateJCRRatingReportTwentyTwentyThreedownloadPdf() {

	}
//-------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	//Click FAQs Option
		@Step
		public void click_faqs_option() {
			
			$(By.xpath("(//a[text()='FAQs'])[1]")).click();
		    
		}

		//Validate FAQs page
		@Step
		public void validate_faqs_page() {
			
			boolean displayed = $(By.xpath("//h1[contains(text(),'Frequently Asked Questions')]")).isDisplayed();
			Assert.assertTrue(displayed);
		    
		}

		//Click General capital increase FAQs
		@Step
		public void click_general_capital_increase_faqs() {
			
			$(By.xpath("//a[contains(text(),'General Capital Increase')]")).click();
		    
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
