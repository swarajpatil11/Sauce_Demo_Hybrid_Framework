package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement checkoutBTN;
	@FindBy(id = "first-name")
	WebElement TxtFirstName;
	@FindBy(id = "last-name")
	WebElement TxtLastName;
	@FindBy(id = "postal-code")
	WebElement TxtPostalCode;
	@FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement ContinueBTN;
	@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
	WebElement FinishBTN;

	public CheckOutPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void checkoutData(String firstname, String lastname, String postal) {
		checkoutBTN.click();

		TxtFirstName.sendKeys(firstname);
		TxtLastName.sendKeys(lastname);
		TxtPostalCode.sendKeys(postal);
		ContinueBTN.click();
		FinishBTN.click();
	}

}
