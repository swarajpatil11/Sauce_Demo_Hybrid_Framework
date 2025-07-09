package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.base_class;

public class TC_Add2Cart_002 extends base_class {

	@Test
	public void AddtoCart() {
		lp.Username("standard_user");
		lp.Password("secret_sauce");
		lp.LoginBtn();

		pg.CartOperations();

		assertEquals(driver.getTitle(), "Swag Labs");

	}
}
