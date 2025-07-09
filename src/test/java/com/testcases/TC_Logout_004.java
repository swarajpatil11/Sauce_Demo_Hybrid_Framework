package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.base_class;

public class TC_Logout_004 extends base_class {
	@Test
	public void Logout() throws InterruptedException {
		TC_Checkout_003 tc = new TC_Checkout_003();
		tc.checkout();
		log.Logout();
		assertEquals(driver.getTitle(), "Swag Labs");

	}

}
