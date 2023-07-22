package com.Afrexim.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Afrexim.pages.Afrexim_Signup_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Afrexim_Signup_steps {

	@Managed
	WebDriver driver;

	@Steps
	Afrexim_Signup_pages ps;

	@When("Click the SignUp link Under the SignIn Box")
	public void click_the_sign_up_link_under_the_sign_in_box() throws InterruptedException {

		ps.Sign_Up();

	}

	@Then("System should be Show Contact Person Detaile Page")
	public void system_should_be_show_contact_person_detaile_page() {

	}

	@When("Select the Salutation")
	public void select_the_salutation() {

		ps.Select_The_Salutation("Dr.");

	}

	@When("Give the First Name {string}")
	public void give_the_first_name(String First_name) {

		ps.Give_the_first_name(First_name);

	}

	@When("Give the last Name {string}")
	public void give_the_last_name(String last_name) {

		ps.Give_the_last_name(last_name);

	}

	@When("Enter the Contact Number {string}")
	public void enter_the_contact_number(String Number) {

		ps.Enter_the_contact_number(Number);

	}

	@When("Enter the Additional Number {string}")
	public void enter_the_additional_number(String Additional_Num) {

		ps.Enter_additional_contact(Additional_Num);

	}

	@When("Enter The Contact Email {string}")
	public void enter_the_contact_email(String Cont_Email) {

		ps.Enter_email_address(Cont_Email);

	}

	@When("Select The Contact Type")
	public void select_the_contact_type() {

		ps.Enter_contact_type(1);
	}

	@When("Enter The Contact Title {string}")
	public void enter_the_contact_title(String Cont_title) {

		ps.Enter_Contact_Title(Cont_title);

	}

	@When("Enter The SignIn User Name {string}")
	public void enter_the_sign_in_user_name(String string) {

	}

	@When("Give The Password {string}")
	public void give_the_password(String password) {

		ps.Give_password(password);

	}

	@When("Give The Confirm Password {string}")
	public void give_the_confirm_password(String Con_password) {

		ps.Give_confirm_password(Con_password);

	}

	@When("Enter Organization Legal Name {string}")
	public void enter_organization_legal_name(String Org_Legal) {

		ps.Give_organisation_legalname(Org_Legal);

	}

	@When("Enter Organization Short Name {string}")
	public void enter_organization_short_name(String Short_name) {

		ps.Give_organisation_shortname(Short_name);

	}

	@When("Select Legal Entity Type")
	public void select_legal_entity_type() {

		ps.Select_legal_entity(1);

	}

	@When("Select Type of Institution")
	public void select_type_of_institution() {

		ps.Select_typeof_institution(1);

	}

	@When("Enter Activities Description {string}")
	public void enter_activities_description(String Discription) {

		ps.Enter_activities_description(Discription);

	}

	@When("Select Sector")
	public void select_sector() {

		ps.Select_Sector(1);

	}

	@When("Select Sub-sector")
	public void select_sub_sector() throws InterruptedException {

		Thread.sleep(3000);

		ps.Select_subsector(4);

	}

	@When("Select Products of interest")
	public void select_products_of_interest() {

		ps.Select_productsofinterest(2);

	}

	@When("Enter Registration number {string}")
	public void enter_registration_number(String Reg_numb) {

		ps.Enter_reg_num(Reg_numb);

	}

	@When("Choose Date")
	public void choose_date() throws InterruptedException {

		ps.Choose_Date(2, "2000", 20);

	}

	@When("Enter City of incorporation {string}")
	public void enter_city_of_incorporation(String city) {

		ps.Enter_City_of_incorporation(city);

	}

	@When("Select country of incorporation")
	public void select_country_of_incorporation() {

		ps.Select_country_of_incorporation(3);

	}

	@When("Enter Operating Street Address {string}")
	public void enter_operating_street_address(String Address) {

		ps.Enter_Operating_Street_Address(Address);

	}

	@When("Enter Operating city {string}")
	public void enter_operating_city(String Oprat_city) {

		ps.Enter_Operating_city(Oprat_city);

	}

	@When("Enter Operating Postal code {string}")
	public void enter_operating_postal_code(String postal) {

		ps.Enter_Operating_Postal_code(postal);

	}

	@When("Select operating Country")
	public void select_operating_country() {

		ps.Select_operating_Country(1);

	}

	@When("Select initial source of funds")
	public void select_initial_source_of_funds() {

		ps.Select_initial_source_of_funds(1);

	}

	@When("Select number of employees")
	public void select_number_of_employees() {

		ps.Select_number_of_employees(2);

	}

	@When("Select constitution")
	public void select_constitution() {

		ps.Select_constitution();

	}

	@When("Enter Website {string}")
	public void enter_website(String website) {

		ps.Enter_Website(website);

	}

	@When("Click confirmation box")
	public void click_confirmation_box() {

		ps.Click_confirmation_box();
	}

	@When("Click Signup button")
	public void click_signup_button() {

		ps.Click_Signup_button();

	}

	@Then("Verify Registration Confirmation page")
	public void verify_registration_confirmation_page() {

		ps.Verify_Registration_Confirmation_page();

	}

}
