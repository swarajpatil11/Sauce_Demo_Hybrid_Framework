package com.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.base_class;

public class TC_Checkout_003 extends base_class {
	TC_Add2Cart_002 add;

	@Test
	public void checkout() {
		add = new TC_Add2Cart_002();
		add.AddtoCart();
		cp.checkoutData("admin", "user", "444008");
		

		WebElement Message = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
		assertEquals(Message.getText(), "THANK YOU FOR YOUR ORDER");
		
		
		
		
		
	}

}
