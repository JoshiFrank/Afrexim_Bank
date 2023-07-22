package com.Afrexim.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Investors_pages;

import io.cucumber.java.en.Given;
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
	
	


}
