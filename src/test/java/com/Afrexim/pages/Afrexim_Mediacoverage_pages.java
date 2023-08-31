package com.Afrexim.pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Afrexim_Mediacoverage_pages extends PageObject{

	
	
	
	
	// To click News function
		@Step
		public void toclick_news_function() {

			$(By.xpath("(//a[text()='News'])[2]")).click();

		}

		// To get the news results
		@Step
		public void toget_the_news_results() throws InterruptedException, AWTException {

			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);

			for (int i = 1; i <= 40; i++) {

				Thread.sleep(3000);

				WebElement news = getDriver().findElement(By.xpath("(//div[@class='text'])["+i+"]"));
				String text = news.getText();
				System.out.println("********************");
				System.out.println(text);
				System.out.println("************************");

			}

			
		}
	
}
