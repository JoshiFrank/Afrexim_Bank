package com.Afrexim.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_OurBank_Aboutus_pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_OurBank_Aboutus_Steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_OurBank_Aboutus_pages ap;

	// organisational structure
	// bug found

	// Vision and Mission

	@Then("To click Read more in Vision and Mission")
	public void to_click_read_more_in_vision_and_mission() {
		
		ap.Toclick_Readmore_VisionandMission();

	}

	@Then("To validate Vision and Mission page")
	public void to_validate_vision_and_mission_page() {
		
		ap.validate_VisionandMissionpage();
		
		

	}

	@When("Navigate to back")
	public void navigate_to_back() throws InterruptedException {

		Thread.sleep(3000);
		driver.navigate().back();
	
	}

	// Our Strategy

	@When("To click Read more in Our Strategy")
	public void to_click_read_more_in_our_strategy() {
		
		ap.Toclick_Readmore_OurStrategy();

	}

	@Then("Validate Our Strategy page")
	public void validate_our_strategy_page() {
		
		ap.Validate_OurStrategypage();

	}

	// Board of Directors

	@When("To click Readmore in Board of Directors")
	public void to_click_readmore_in_board_of_directors() {
		
		ap.Toclick_Readmore_BoardofDirectors();

	}

	@Then("Validate Board of Directors page")
	public void validate_board_of_directors_page() {
		
		ap.Validate_BoardofDirectorspage();

	}

	// Management team

	@When("To click Readmore in Mnagement Team")
	public void to_click_readmore_in_mnagement_team() {
		
		ap.Toclick_Readmore_MnagementTeam();

	}

	@Then("Validate Management Team page")
	public void validate_management_team_page() {
		
		ap.Validate_ManagementTeampage();

	}

	// corporate governance

	@When("To click the Our Bank Option")
	public void to_click_the_our_bank_option() {

		ap.To_click_the_Our_Bank_Option();

	}

	@When("To Select the About Us Functionality")
	public void to_select_the_about_us_functionality() {

		ap.To_Select_the_About_Us_Functionality();

	}

	@Then("To validate the About us page")
	public void to_validate_the_about_us_page() {

		ap.To_validate_the_About_us_page();

	}

	@When("To scroll down the entire page")
	public void to_scroll_down_the_entire_page() throws AWTException {
		ap.To_scroll_down_the_entire_page();
	}

	@When("To click the Read more option in Corporate Governance")
	public void to_click_the_read_more_option_in_corporate_governance() {

		ap.Click_Read_more_option_in_Corporate_Governance();

	}

	@Then("Validate the Corporate Governance page")
	public void validate_the_corporate_governance_page() throws InterruptedException {

		ap.Validate_the_Corporate_Governance_page();

		Thread.sleep(4000);

	}

}
