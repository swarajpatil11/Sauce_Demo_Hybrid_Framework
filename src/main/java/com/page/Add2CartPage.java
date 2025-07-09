package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add2CartPage {

	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/a/div")
	WebElement BackPackBTN;
	@FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div/button")
	WebElement Add2cartBTN;
	@FindBy(css = "#shopping_cart_container > a > svg > path")
	WebElement cartIcon;

	public Add2CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void CartOperations() {
		BackPackBTN.click();
		Add2cartBTN.click();
		cartIcon.click();
	}

}
