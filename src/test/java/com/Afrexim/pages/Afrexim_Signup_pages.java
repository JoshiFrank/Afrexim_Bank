package com.Afrexim.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.Step;

public class Afrexim_Signup_pages extends PageObject {

	// Select the salutation
	
	@Step
	public void Sign_Up() throws InterruptedException {
	
		
		Thread.sleep(2000);
		
		$(By.xpath("//a[text()='Sign Up']")).click();
		
	}
	
	@Step
	public void Select_The_Salutation(String title) {

		$(By.xpath("(//select[@class='pt-form-control'])[1]")).selectByVisibleText(title);

	}

	// Give the first name
	@Step
	public void Give_the_first_name(String firstname) {

		$(By.xpath("(//input[@class='pt-form-control'])[1]")).typeAndTab(firstname);

	}

	// Give the last name
	@Step
	public void Give_the_last_name(String lastname) {

		$(By.xpath("(//input[@class='pt-form-control'])[2]")).typeAndTab(lastname);

	}

	// Enter the contact number
	@Step
	public void Enter_the_contact_number(String number) {

		$(By.xpath("(//input[@class='pt-form-control'])[3]")).typeAndTab(number);

	}

	// Enter the additional contact
	@Step
	public void Enter_additional_contact(String number) {

		$(By.xpath("(//input[@class='pt-form-control'])[4]")).typeAndTab(number);

	}

	// Enter the email
	@Step
	public void Enter_email_address(String email) {

		$(By.xpath("(//input[@class='pt-form-control'])[5]")).typeAndTab(email);

	}

	// Enter Contact type
	@Step
	public void Enter_contact_type(int index) {

		$(By.xpath("(//select[@class='pt-form-control'])[2]")).selectByIndex(index);

	}

	// Enter Contact Title
	@Step
	public void Enter_Contact_Title(String title) {
		$(By.xpath("(//input[@class='pt-form-control'])[6]")).typeAndTab(title);
	}

	// Enter Sign in user name
	@Step
	public void Sign_in_username() {
// Auto Populate
	}

	// Give password
	@Step
	public void Give_password(String password) {

		$(By.xpath("(//input[@type='password'])[1]")).typeAndTab(password);

	}

	// Give Confirm Password
	@Step
	public void Give_confirm_password(String Crnf_Passwprd) {

		$(By.xpath("(//input[@type='password'])[2]")).typeAndTab(Crnf_Passwprd);

	}

	// Give organization legal name
	@Step
	public void Give_organisation_legalname(String Org_Name) {

		$(By.xpath("(//input[@class='pt-form-control'])[9]")).typeAndTab(Org_Name);

	}

	// Give Organization short name
	@Step
	public void Give_organisation_shortname(String Org_Shrot_Name) {

		$(By.xpath("(//input[@class='pt-form-control'])[10]")).typeAndTab(Org_Shrot_Name);

	}

	// Select_legal_entity_type
	@Step
	public void Select_legal_entity(int index) {

		$(By.xpath("(//select[@class='pt-form-control'])[3]")).selectByIndex(index);

	}

	// Select_typeof_institution
	@Step
	public void Select_typeof_institution(int index) {

		$(By.xpath("(//select[@class='pt-form-control'])[4]")).selectByIndex(index);

	}

	// Enter Activities Description
	@Step
	public void Enter_activities_description(String Descrb) {

		
		$(By.xpath("(//input[@class='pt-form-control'])[11]")).typeAndTab(Descrb);
		
	}

	// Select Sector
	@Step
	public void Select_Sector(int index) {

		$(By.xpath("(//select[@class='pt-form-control'])[5]")).selectByIndex(index);

	}

	// Select Sub-sector
	@Step
	public void Select_subsector(int index) {
		$(By.xpath("(//select[@class='pt-form-control'])[6]")).selectByIndex(index);
	}

	// Select Products of interest
	@Step
	public void Select_productsofinterest(int num) {

		$(By.xpath("//input[@placeholder='Search']")).click();

		$(By.xpath("(//a[@class='bp3-menu-item'])[" + num + "]")).click();

	}

	// Enter Registration number
	@Step
	public void Enter_reg_num(String Reg_number) {

		$(By.xpath("(//input[@class='pt-form-control'])[12]")).typeAndTab(Reg_number);

	}

	// Choose Date
	@Step
	public void Choose_Date(int month_Index, String year, int Day) throws InterruptedException {
		$(By.xpath("//input[@placeholder='Choose Date']")).click();
		Thread.sleep(2000);

		$(By.xpath("//select[@class='bp3-datepicker-month-select']")).selectByIndex(month_Index);
		Thread.sleep(2000);
		$(By.xpath("//input[@placeholder='Choose Date']")).click();
		$(By.xpath("//select[@class='bp3-datepicker-year-select']")).selectByVisibleText(year);
		Thread.sleep(2000);
		$(By.xpath("//input[@placeholder='Choose Date']")).click();
		$(By.xpath("//div[text()='"+Day+"']")).click();
	}

	// Enter City of incorporation
	@Step
	public void Enter_City_of_incorporation(String City_InCorporation) {

		$(By.xpath("(//input[@class='pt-form-control'])[13]")).typeAndTab(City_InCorporation);

	}

	// Select country of incorporation
	@Step
	public void Select_country_of_incorporation(int Country_index) {

		$(By.xpath("(//select[@class='pt-form-control'])[7]")).selectByIndex(Country_index);

	}

	// Enter Operating Street Address
	@Step
	public void Enter_Operating_Street_Address(String Address) {

		$(By.xpath("(//input[@class='pt-form-control'])[14]")).typeAndTab(Address);

	}

	// Enter Operating city
	@Step
	public void Enter_Operating_city(String Oprate_city) {
		$(By.xpath("(//input[@class='pt-form-control'])[15]")).typeAndTab(Oprate_city);
	}

	// Enter Operating Postal code
	@Step
	public void Enter_Operating_Postal_code(String Postal_code) {

		$(By.xpath("(//input[@class='pt-form-control'])[16]")).typeAndTab(Postal_code);

	}

	// Select operating Country
	@Step
	public void Select_operating_Country(int index_Country) {

		$(By.xpath("(//select[@class='pt-form-control'])[8]")).selectByIndex(index_Country);

	}

	// Select initial source of funds
	@Step
	public void Select_initial_source_of_funds(int Promoter_Key) {

		$(By.xpath("(//select[@class='pt-form-control'])[9]")).selectByIndex(Promoter_Key);
	}

	// Select number of employees
	@Step
	public void Select_number_of_employees(int Number_employees) {
		$(By.xpath("(//select[@class='pt-form-control'])[10]")).selectByIndex(Number_employees);
	}

	// Select constitution
	@Step
	public void Select_constitution() {
		$(By.xpath("(//select[@class='pt-form-control'])[11]")).selectByIndex(1);
	}

	// Enter Web site
	@Step
	public void Enter_Website(String Website) {

		$(By.xpath("(//input[@class='pt-form-control'])[17]")).typeAndTab(Website);
	}

	// Click confirmation box
	@Step
	public void Click_confirmation_box() {

		$(By.xpath("//input[@type='checkbox']")).click();

	}

	// Click Sign up button
	@Step
	public void Click_Signup_button() {

		$(By.xpath("//input[@class='pt-button primary']")).click();

	}

	// Verify Registration Confirmation page
	@Step
	public void Verify_Registration_Confirmation_page() {
		
		
		WebElementState shouldBePresent = $(By.xpath("//div[@class='alert alert-success']")).shouldBePresent();
		
		
		
		System.out.println(shouldBePresent);
		

	}

}
