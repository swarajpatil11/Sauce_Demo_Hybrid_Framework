package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_File {
	
	public static String ReadConfig(String key) throws IOException {
		
		String path = System.getProperty("user.dir")+"/src/main/resources/Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(file);
		
		
		
		return pro.getProperty(key);
		
		
		
		
		
		
	}

}
