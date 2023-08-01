package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Aboutus_pages extends PageObject {

	// To click the Our Bank Option
	@Step
	public void To_click_the_Our_Bank_Option() {

		$(By.xpath("(//span[text()='Our Bank'])[1]")).click();

	}

	// To Select the About Us Functionality
	@Step
	public void To_Select_the_About_Us_Functionality() {

		$(By.xpath("(//a[text()='About Us'])[1]")).click();

	}

	// To validate the About us page
	@Step
	public void To_validate_the_About_us_page() {

		boolean aboutus = $(By.xpath("//h1[text()='About Us']")).isDisplayed();
		Assert.assertTrue(aboutus);

	}

	// organisational structure

	// navigate to back

	// Vision and mission

	// To click Read more in Vision and Mission
	@Step
	public void Toclick_Readmore_VisionandMission() {

		$(By.xpath("(//span[text()='Read more'])[2]")).click();

	}

	// To validate Vision and Mission page
	@Step
	public void validate_VisionandMissionpage() {

		boolean vision = $(By.xpath("//h1[text()='Vision & Mission']")).isDisplayed();
		Assert.assertTrue(vision);
	}

	// Our Strategy

	// To click Read more in Our Strategy
	@Step
	public void Toclick_Readmore_OurStrategy() {

		$(By.xpath("(//span[text()='Read more'])[3]")).click();

	}

	// Validate Our Strategy page
	@Step
	public void Validate_OurStrategypage() {

		boolean strategy = $(By.xpath("//h1[text()='Our Strategy']")).isDisplayed();
		Assert.assertTrue(strategy);
	}

	// Board of Directors

	// To click Readmore in Board of Directors
	@Step
	public void Toclick_Readmore_BoardofDirectors() {

		$(By.xpath("(//span[text()='Read more'])[4]")).click();

	}

	// Validate Board of Directors page
	@Step
	public void Validate_BoardofDirectorspage() {

		boolean board = $(By.xpath("//h1[text()='Board of Directors']")).isDisplayed();
		Assert.assertTrue(board);
	}

	// Management Team
	// To click Readmore in Mnagement Team
	@Step
	public void Toclick_Readmore_MnagementTeam() {

		$(By.xpath("(//span[text()='Read more'])[5]")).click();

	}

	// Validate Management Team page
	@Step
	public void Validate_ManagementTeampage() {

		boolean management = $(By.xpath("//h1[text()='Management Team']")).isDisplayed();
		Assert.assertTrue(management);

	}

	// To scroll down the entire page
	@Step
	public void To_scroll_down_the_entire_page() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	// To click the Read more option in Corporate Governance
	@Step
	public void Click_Read_more_option_in_Corporate_Governance() {

		$(By.xpath("(//span[text()='Read more'])[6]")).click();

	}

	// Validate the Corporate Governance page
	@Step
	public void Validate_the_Corporate_Governance_page() {

		boolean corporate = $(By.xpath("(//h1[text()='Corporate Governance'])")).isDisplayed();
		Assert.assertTrue(corporate);
	}

}
