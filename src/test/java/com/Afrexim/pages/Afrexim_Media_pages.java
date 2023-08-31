package com.Afrexim.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageUrls;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class Afrexim_Media_pages extends PageObject {

	// To click the Media option
	@Step
	public void click_Mediaoption() {

		$(By.xpath("(//span[text()='Media'])[1]")).click();

	}

	// To validate the media dropdown
	@Step
	public void validate_mediadropdown() {

		boolean displayed = $(By.xpath("//*[@id=\"menu-item-52\"]/ul")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// news option

	// To click the news option
	@Step
	public void click_newsoption() {

		$(By.xpath("(//a[text()='News'])[1]")).click();

	}

	// To validate the News Articles page
	@Step
	public void validate_NewsArticlespage() {

		String a = $(By.xpath("//h1[text()='News articles']")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "News articles");

	}

	// To validate right arrow and years present
	@Step
	public void validate_rightarrow_yearspresent() throws InterruptedException {

		for (int i = 0; i <= 8; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();

		}

	}

	// To click and check left arrow
	@Step
	public void click_check_leftarrow() throws InterruptedException {

		for (int i = 0; i <= 8; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[1]")).click();

		}

	}

	// To click twenty-twenty three year
	@Step
	public void click_twentytwentythreeyear() {

		$(By.xpath("//a[text()='2023']")).click();

	}

	// Scroll down and click Load more
	@Step
	public void Scrolldown_clickLoadmore() throws InterruptedException {

		Thread.sleep(2000);

		$(By.xpath("//a[text()='Load more']")).click();

	}

	// Validate twenty-twenty three news results
	@Step
	public void Validate_twentytwentythree_newsresults() {

		List<WebElement> Le = getDriver().findElements(By.xpath("//article//div[2]"));

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-twenty two year
	@Step
	public void click_twentytwentytwoyear() throws InterruptedException, AWTException {


		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(3000);
		$(By.xpath("//div/a[@rel='2022']")).click();
	}

	// Validate twenty-twenty two news results
	@Step
	public void Validate_twentytwentytwo_newsresults() {
		List<WebElement> Le = getDriver().findElements(By.xpath("//article//div[2]"));

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-twenty one year
	@Step
	public void click_twentytwentyoneyear() {

		$(By.partialLinkText("2021")).click();
	}

	// Validate twenty-twenty one news results
	@Step
	public void Validate_twentytwentyone_newsresults() {

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-twenty year
	@Step
	public void click_twentytwentyyear() {

		$(By.xpath("//a[text()='2020']")).click();
	}

	// Validate twenty-twenty news results
	@Step
	public void Validate_twentytwenty_newsresults() {

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-nineteen year
	@Step
	public void click_twentynineteen_year() {
		$(By.xpath("//a[text()='2019']")).click();
	}

	// Validate twenty-nineteen news results
	@Step
	public void Validate_twentynineteen_newsresults() {
		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-eighteen year
	@Step
	public void click_twentyeighteen_year() throws AWTException {
		

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		$(By.xpath("//a[text()='2018']")).click();
	}

	// Validate twenty-eighteen news results
	@Step
	public void Validate_twentyeighteen_newsresults() {

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-seventeen year
	@Step
	public void click_twentyseventeen_year() {
		$(By.xpath("//a[text()='2017']")).click();
	}

	// Validate twenty-seventeen news results
	@Step
	public void Validate_twentyseventeen_newsresults() {

		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-sixteen year
	@Step
	public void click_twentysixteen_year() {
		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2016']")).click();
	}

	// Validate twenty-sixteen news results
	@Step
	public void Validate_twentysixteen_newsresults() {
		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-fifteen year
	@Step
	public void click_twentyfifteenyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2015']")).click();
	}

	// Validate twenty-fifteen news results
	@Step
	public void Validate_twentyfifteen_newsresults() {
		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-fourteen year
	@Step
	public void click_twentyfourteenyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2014']")).click();
	}

	// Validate twenty-fourteen news results
	@Step
	public void Validate_twentyfourteen_newsresults() {
		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-thirteen year
	@Step
	public void click_twentythirteenyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2013']")).click();
	}

	// Validate twenty-thirteen news results
	@Step
	public void Validate_twentythirteen_newsresults() {
		for (int i = 1; i <= 20; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-twelve year
	@Step
	public void click_twentytwelveyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2012']")).click();
	}

	// Validate twenty-twelve news results
	@Step
	public void Validate_twentytwelve_newsresults() {
		for (int i = 1; i <= 3; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-eleven year
	@Step
	public void click_twentyelevenyear() {
		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2011']")).click();
	}

	// Validate twenty-eleven news results
	@Step
	public void Validate_twentyeleven_newsresults() {
		for (int i = 1; i <= 3; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-ten year
	@Step
	public void click_twentyten_year() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2010']")).click();
	}

	// Validate twenty-ten news results
	@Step
	public void Validate_twentyten_newsresults() {
		for (int i = 1; i <= 1; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To click twenty-nine year
	@Step
	public void click_twentynineyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2009']")).click();
	}

	// Validate twenty-nine news results
	@Step
	public void Validate_twentynine_newsresults() {

		for (int i = 1; i <= 10; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To click twenty-eight year
	@Step
	public void click_twentyeightyear() {

		$(By.xpath("(//button[@type='button'])[2]")).click();

		$(By.xpath("//a[text()='2008']")).click();
	}

	// Validate twenty-eight news results
	@Step
	public void Validate_twentyeight_newsresults() {
		for (int i = 1; i <= 6; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// ------------------------------------------------------------------------
	// Validate the Past events functionality

	// To click the events option
	@Step
	public void To_click_eventsoption() {

		$(By.xpath("(//a[text()='Events'])[1]")).click();

	}

	// To click the past events option
	@Step
	public void To_click_pasteventsoption() {

		$(By.xpath("(//a[text()='Past Events'])[2]")).click();

	}

	// To validate the past events page
	@Step
	public void To_validate_pasteventspage() {

		$(By.xpath("(//h1[text()='Past events'])")).isDisplayed();

	}

	// To click right arrow
	@Step
	public void To_click_right_arrowInPastEventsPage() throws InterruptedException {

		for (int i = 0; i <= 7; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[2]")).click();
		}

	}

	// To click and check left arrow button
	@Step
	public void To_click_checkleftarrow() throws InterruptedException {

		for (int i = 0; i <= 7; i++) {

			Thread.sleep(2000);

			$(By.xpath("(//button[@type='button'])[1]")).click();

		}
	}

	// To validate twenty-twenty-two past events results
	@Step

	public void To_validate_twenty_twenty_twopastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 2; i++) {
			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty-twenty-one past events results
	@Step
	public void To_validate_twentytwentyonePastEventsResults() throws InterruptedException {
		for (int i = 1; i <= 7; i++) {
			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty-twenty past events results
	public void To_validate_twentytwentyPastEventsResults() {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To validate twenty nineteen past events results
	@Step
	public void To_validate_twentyNineteenPastEventResults() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty eighteen past events results
	@Step
	public void To_validate_twentyEighteenPastEventsResults() throws InterruptedException {
		for (int i = 1; i <= 2; i++) {
			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty seventeen past events results
	@Step
	public void to_validate_twenty_seventeen_past_events_results() throws InterruptedException {

		for (int i = 1; i <= 1; i++) {

			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");

		}

		Thread.sleep(2000);
	}

	// To validate twenty sixteen past events results
	@Step
	public void To_validate_twentySixteenPastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 4; i++) {
			Thread.sleep(2000);
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty fifteen past events results
	@Step
	public void To_validate_twentyFifteenPastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty fourteen past events results
	@Step
	public void To_validate_twentyFourteenPastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty thirteen past events results
	@Step
	public void To_validate_twentyThirteenPastEventsResults() throws InterruptedException {
		for (int i = 1; i <= 1; i++) {
			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");

		}

		Thread.sleep(2000);
	}

	// To validate twenty-twelve past events results
	@Step
	public void To_validate_twentytwelvePastEventsResults() {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}
	}

	// To validate twenty eleven past events results
	@Step
	public void To_validate_twentyElevenPastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty-ten past events results
	@Step
	public void To_validate_twentytenPastEventsResults() {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

	}

	// To validate twenty nine past events results
	@Step
	public void To_validate_twentyNinePastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

	// To validate twenty eight past events results
	@Step
	public void To_validate_twentyEightPastEventsResults() throws InterruptedException {

		for (int i = 1; i <= 2; i++) {

			WebElement news = getDriver().findElement(By.xpath("(//article/div[@class='text'])[" + i + "]"));

			String text = news.getText();

			System.out.println("********************");
			System.out.println(text);
			System.out.println("********************");
		}

		Thread.sleep(2000);
	}

// ----------------------------------------------------------------------------------------------------
	// validate the Press Releases Functionalty

	// click press releases link
	@Step
	public void click_press_releases_link() {

		$(By.xpath("//a[text()='Press Releases'][1]")).click();

	}

	// Click the first link
	@Step
	public void click_the_first_link() {

		$(By.xpath("//*[@id='post-29356']/div[2]/header/h2")).click();

	}

	// Validate the first link_details
	@Step
	public void validate_the_first_link_details() {

		WebElement elememt = getDriver()
				.findElement(By.xpath("//h1[text()='AFREXIMBANK OPENS CARICOM OFFICE IN BARBADOS￼']"));

		String textContent = elememt.getText();
		Assert.assertEquals(textContent, "AFREXIMBANK OPENS CARICOM OFFICE IN BARBADOS￼");

	}

	// Click the second link
	@Step
	public void click_the_second_link() {

		$(By.xpath("//*[@id='post-29330']/div[2]/header/h2/a")).click();

	}

	// Validate the second link
	@Step
	public void validate_the_second_link_details() {

		String textContent = $(By.xpath("//*[@id='post-29330']/header/h1")).getTextContent();

		Assert.assertEquals(textContent,
				"Afreximbank reiterates prioritization of food security, " + "promoting trade & investment "
						+ "and advancing the African Continental Free Trade Agreement "
						+ "(AfCFTA) at 2nd Russia-Africa Economic & Humanitarian Forum");

	}

	// Click third link
	@Step
	public void click_third_link() {

		$(By.xpath("//*[@id='post-29256']/div[2]/header/h2/a")).click();

	}

	// Validate the third link
	@Step
	public void validate_the_third_link() {

		String textContent = $(By.xpath("//h1[text()='Moody’s Maintains Afreximbank’s Credit Rating at Baa1']"))
				.getTextContent();

		Assert.assertEquals(textContent, "Moody’s Maintains Afreximbank’s Credit Rating at Baa1");

	}

	// Click fourth link
	@Step
	public void click_fourth_link() {

		$(By.xpath("//*[@id='post-29207']/div[2]/header/h2/a")).click();
	}

	// Validate the fourth link
	@Step
	public void validate_the_fourth_link() {
		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent,
				"Afreximbank leads US$155 million strategic" + " facility to Djibouti Ports and Free Zone Authority.");

	}

	// Click fifth link
	@Step
	public void click_fifth_link() {

		$(By.xpath("//*[@id='post-29222']/div[2]/header/h2/a")).click();
	}

	// Validate the fifth link
	@Step
	public void validate_the_fifth_link() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent, textContent);

	}

	// Click sixth link
	@Step
	public void click_sixth_link() {

		$(By.xpath("//*[@id='post-29246']/div[2]/header/h2/a")).click();

	}

	// Valiadate the sixth link
	@Step
	public void valiadate_the_sixth_link() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent, "Afreximbank, Digiloop sign MoU to Collaborate to "
				+ "Boost Sovereign Client’s Revenue Origination Capacity in Africa");

	}

	// click seventh link
	@Step
	public void click_seventh_link() {

		$(By.xpath("//*[@id='post-29162']/div[2]/header/h2/a")).click();

	}

	// validate the seventh link
	@Step
	public void validate_the_seventh_link_details() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent, "AFREXIMBANK LAUNCHES THE AFRICAN TRADE REPORT 2023");

	}

	// click Eighth link
	@Step
	public void click_Eighth_link() {

		$(By.xpath("//*[@id='post-29146']/div[2]/header/h2/a")).click();

	}

	// validate the Eighth link
	@Step
	public void validate_the_Eighth_link_details() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent,
				"Cairo Hosts IATF2023 Business Roadshow to " + "Promote Trade Between Egypt and Africa");

	}

	// click nineth link
	@Step
	public void click_nineth_link() {

		$(By.xpath("//*[@id='post-29153']/div[2]/header/h2/a")).click();

	}

	// validate the nineth link
	@Step
	public void validate_the_nineth_link_details() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent,
				"Guyana To Host Second AfriCaribbean Trade and " + "Investment Forum 30-31 October 2023.");

	}

//click tenth link
	@Step
	public void click_tenth_link() {

		$(By.xpath("//*[@id='post-29157']/div[2]/header/h2/a")).click();
	}

	// Validate the tenth link
	@Step
	public void validate_the_tenth_link() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent,
				"The Arab-Africa Trade Bridges Program Launches" + " AATB Food Security Program");

	}

	// click eleventh link
	@Step
	public void click_eleventh_link() {

		$(By.xpath("//*[@id='post-29053']/div[2]/header/h2/a")).click();

	}

	// Validate the eleventhlink
	@Step
	public void validate_the_eleventh_link() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent, "Afreximbank signs Eur 19.6m Financing Agreement with "
				+ "Al Mahaliya for Dairy Processing in Mauritania");

	}

	// click twelth link
	@Step
	public void click_twelth_link() {

		$(By.xpath("//*[@id='post-29035']/div[2]/header/h2/a")).click();

	}

	// Valiadate the twelth link details
	@Step
	public void valiadate_the_twelth_link_details() {

		String textContent = $(By.xpath("//h1[@class='entry-title']")).getTextContent();

		Assert.assertEquals(textContent,
				"Afreximbank and UTM Offshore to develop Floating " + "LNG project in Nigeria");

	}

//-----------------------------------------------------------------------------------------------------------------
	// validate the Insights functionalty

	// click the insights link
	@Step
	public void click_the_insights_link() throws InterruptedException {

		Thread.sleep(2000);

		$(By.xpath("//*[@id='menu-item-21323']/a")).click();

	}

	// click link in insights page
	@Step
	public void click_link_in_insights() {

		$(By.xpath("//*[@id='post-21328']/div[2]/header/h2/a")).click();
	}

	// validate the trade page
	@Step
	public void validate_the_trade_page() {

		String text = $(By.xpath("//h1[@class='entry-title']")).getText();

		Assert.assertEquals(text, "With tariffs gone, the work begins for African trade. "
				+ "By Dr. George Elombi, Executive Vice President (Governance, Legal & Corporate Services), Afreximbank, "
				+ "in the Financial Times, 14 March 2020.");

	}

}
