package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "user-name")
	WebElement TxTUsername;
	@FindBy(id = "password")
	WebElement TxTPassword;
	@FindBy(id = "login-button")
	WebElement LoginBTN;
	@FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/h3") WebElement error;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void Username(String Uname) {
		TxTUsername.sendKeys(Uname);
	}

	public void Password(String Pass) {
		TxTPassword.sendKeys(Pass);
	}

	public void LoginBtn() {
		LoginBTN.click();
	}
	
	public String Error () {
		return error.getText();
	}
	
	
	
	
	
	
	
	
	
	

}
