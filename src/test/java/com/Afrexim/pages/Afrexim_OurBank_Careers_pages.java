package com.Afrexim.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Afrexim_OurBank_Careers_pages extends PageObject {

	// Click the Careers link
	@Step
	public void Click_the_Careers_link() {

		$(By.xpath("(//a[text()='Careers'])[1]")).click();

	}

	// Validate the Careers page is Displayed
	@Step
	public void Validate_Careers_page_isDisplayed() {

		$(By.xpath("(//h1[text()='Careers'])[1]")).isDisplayed();

	}

	// Click the Check Vacancies Option
	@Step
	public void Click_Check_Vacancies_Option() {

		$(By.xpath("//span[text()='Check vacancies']")).click();

	}

	// Select the type of the job in All Vacancies Dropdown
	@Step
	public void Select_typeofjob(int index) {

		$(By.xpath("//select[@id='job_categories_select']")).selectByIndex(index);

	}

	// select the job location in the location Dropdown
	@Step
	public void select_joblocation(int index) {

		$(By.xpath("//select[@id='job_locations_select']")).selectByIndex(index);

	}

	// Select the Expected expiry limitation in limitation Dropdown
	@Step
	public void Select_expiry_limitation(int index) {

		$(By.xpath("//select[@id='job_expiry_select']")).selectByIndex(index);

	}

	// Click the Filter Button
	@Step
	public void Click_Filter_Button() {

		$(By.xpath("//button[text()='Filter']")).click();

	}

	// Validate the job search results

	@Step
	public void Validate_jobsearchresults() {

		try {

			boolean displayed = $(By.xpath("(//tr[@class='clickable-row'])[1]")).isDisplayed();

			Assert.assertTrue(displayed);

		} catch (Exception e) {

			System.out.println("No job Results display ");

		}

	}

	// Click desired job

	@Step
	public void Click_desired_job(int index) throws InterruptedException {

		Thread.sleep(2000);

		try {

			$(By.xpath("//*[@id='afrexim_job_entries']/tr[" + index + "]/td[1]/a")).click();

			Thread.sleep(2000);

		} catch (Exception e) {

			System.out.println("No job listings matched your criteria");
		}

	}

	// Validate selected job details

	@Step
	public void Validate_selected_jobdetails() {

		boolean displayed = $(By.xpath("//*[@id='post-29124']/header/h1")).isDisplayed();

		Assert.assertTrue(displayed);
	}
	// -----------------------------------------------------------------------------------------

	// Pages - Validate the Dropdowns of Vacancies

	@Step
	public void Click_All_Vacancies() throws InterruptedException {

		$(By.xpath("//select[@id='job_categories_select']")).click();
		Thread.sleep(4000);
	}

	public String Validate_All_vacancies_Dropdown() {

		WebElementFacade drop = $(By.xpath("//select[@id='job_categories_select']"));

		String text = "";
		Select s = new Select(drop);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			text = options.get(i).getText();

			System.out.println("Dropdown text:" + text);

		}

		return text;

	}
	
	public String Validate_Location_Dropdown() {
		
		
		
		
		WebElementFacade drop = $(By.xpath("//select[@id='job_locations_select']"));

		String text = "";
		Select s = new Select(drop);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			text = options.get(i).getText();

			System.out.println("Dropdown text:" + text);

		}

		return text;

	}
	
	
	
	public String Validate_Expiry_Limitation_Dropdown() {
		
		
		WebElementFacade drop = $(By.xpath("//select[@id='job_expiry_select']"));

		String text = "";
		Select s = new Select(drop);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			text = options.get(i).getText();

			System.out.println("Dropdown text:" + text);

		}

		return text;
		
		
		
		

	}
	
	
	public void Click_Location_Dropdown() {
		
		$(By.xpath("//select[@id='job_locations_select']")).click();
	}
	
	
	public void Click_Expiry_Limitation_Dropdown() {
		$(By.xpath("//select[@id='job_expiry_select']")).click();
	}

}
