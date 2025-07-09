package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	@FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
	WebElement MenuBTN;
	@FindBy(id = "logout_sidebar_link")
	WebElement LogOutBtn;

	public Logoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void Logout() throws InterruptedException {
		MenuBTN.click();
		Thread.sleep(1000);
		LogOutBtn.click();
	}

}
