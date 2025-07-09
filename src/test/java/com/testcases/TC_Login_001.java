package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base_class;
import com.utilities.ReadData;

public class TC_Login_001 extends base_class {
	@Test(dataProvider = "td")
	public void Login(String User, String pass) {

		lp.Username(User);
		lp.Password(pass);
		lp.LoginBtn();

		/*
		 * if (User.equals("standard_user") && pass.equals("secret_sauce")) {
		 * assertEquals(driver.getTitle(), "Swag Labs");
		 * 
		 * } if (User.equals("amit@gmail.com") && pass.equals("amit@123")) {
		 * assertEquals(lp.Error(),
		 * "Username and password do not match any user in this service");
		 * 
		 * } if (User.equals("Shan@gmail.com") && pass.equals("shan@123")) {
		 * assertEquals(lp.Error(),
		 * "Username and password do not match any user in this service");
		 * 
		 * } if (User.equals("!$%#@gmail.com") && pass.equals("#$%^@!@#")) {
		 * assertEquals(lp.Error(),
		 * "Username and password do not match any user in this service");
		 */

		//}

	}

	@DataProvider(name = "td")
	String[][] LoginData() throws Exception {

		String[][] data = ReadData.ReadXl();

		return data;
	}
}