package com.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.page.Add2CartPage;
import com.page.CheckOutPage;
import com.page.LoginPage;
import com.page.Logoutpage;
import com.utilities.Config_File;

public class base_class {

	public static WebDriver driver;
	public static LoginPage lp;
	public static Add2CartPage pg;
	public static CheckOutPage cp;
	public static Logoutpage log;

	@BeforeMethod
	public void Setup() throws IOException {

		String Brname = Config_File.ReadConfig("browser");

		if (Brname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (Brname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (Brname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("No browser found");
		}

		String URL = Config_File.ReadConfig("url");
		driver.get(URL);
		lp = new LoginPage(driver);
		pg = new Add2CartPage(driver);
		cp = new CheckOutPage(driver);
		log = new Logoutpage(driver);

	}

	@AfterMethod
	public void Teardown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		driver.quit();

	}

}
