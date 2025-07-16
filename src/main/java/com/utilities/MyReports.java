package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyReports {
	
	public static ExtentReports extent;

	public static ExtentReports getInstance() {

		String path = System.getProperty("user.dir") + "/ExtentReports/index.html";
		if (extent == null) {
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);
			sparkReporter.config().setTheme(Theme.DARK);

			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("User", "Swaraj Chaudhari");

		}

		return extent;
	}
}
