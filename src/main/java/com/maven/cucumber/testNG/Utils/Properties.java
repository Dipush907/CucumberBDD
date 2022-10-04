package com.maven.cucumber.testNG.Utils;

import java.io.FileInputStream;

public class Properties {  
	
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("C:/Users/Bidhudatta/eclipse-workspace_old/Selenium_Automation/com.parekh.cucumberFramework/src/test/resources/blogExtentConfig.xml");
		Properties pobj = new Properties();
		String value =pobj.getPropertyKeyValue(key);
		return value;
	}
}  


