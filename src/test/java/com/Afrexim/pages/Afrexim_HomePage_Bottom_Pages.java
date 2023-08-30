package com.Afrexim.pages;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_HomePage_Bottom_Pages extends PageObject{

	
	
	
	
	//mouse hover on Trade & Project Financing Solutions
		@Step
		public void mouse_hover_on_TradeProjectFinancingSolutions() {
			Actions action=new Actions(getDriver());
			action.moveToElement($(By.xpath("//span[text()='Trade & Project Financing Solutions']"))).build().perform();
		}


		//Trade Finance Programs and Project-Related Financing options should be displayed
		@Step
		public void TradeFinanceProgramsOptionsDisplayed() {
			$(By.xpath("/html/body/div[1]/div/div/div/nav/ul/li[1]/ul")).isDisplayed();
			
		}


		//mouse hover on Guarantees Solutions
		@Step
		public void mouse_hover_on_GuaranteesSolutions() {

			Actions action=new Actions(getDriver());
			action.moveToElement($(By.xpath("//span[text()='Guarantees Solutions']"))).build().perform();
		}


		//Short Term Trade Guarantee Products, Working Capital Guarantee Programme, Medium and Long-Term Guarantee Products, Bonding Facilitie, Other Uniques Guarantee Products, How to Apply options should be displayed
		@Step
		public void ShortTermTradeGuaranteeProductsOptionsDisplayed() {
			$(By.xpath("/html/body/div[1]/div/div/div/nav/ul/li[2]/ul")).isDisplayed();
		}


		//mouse hover on Trade Information and Advisory Services
		@Step
		public void mouse_hover_on_TradeInformationandAdvisoryServices() {

			Actions action=new Actions(getDriver());
			action.moveToElement($(By.xpath("//span[text()='Trade Information & Advisory Services']"))).build().perform();
		}


		//Trade Information and Advisory Products option should be displayed
		@Step
		public void TradeInformationAndAdvisoryProductsOptionDisplayed() {

			Actions action=new Actions(getDriver());
			action.moveToElement($(By.xpath("//span[text()='Trade & Project Financing Solutions']"))).build().perform();
			
		}


		//click on Export Development
		@Step
		public void click_on_ExportDevelopment() {
			$(By.xpath("//span[text()='Export Development']")).click();
		}


		//Export Development page should be displayed
		@Step
		public void ExportDevelopmentPageDisplayed() {
			$(By.xpath("//h1[text()='Export Development']")).isDisplayed();
			
		}


		//mouse hover on Need Help Lets guide you through everything
		@Step
		public void mouse_hover_on_NeedHelp() {

			Actions action=new Actions(getDriver());
			action.moveToElement($(By.xpath("//span[contains(text(),'Need Help?')]"))).build().perform();
		}


		//Submit your request option should be displayed
		@Step
		public void Submit_your_request_optionDisplayed() {
			$(By.xpath("/html/body/div[1]/div/div/div/nav/ul/li[5]/ul")).isDisplayed();
		}
	
	
	
}
