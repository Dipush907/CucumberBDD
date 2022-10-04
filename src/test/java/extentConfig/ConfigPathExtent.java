package extentConfig;

import com.maven.cucumber.testNG.Utils.Properties;

public class ConfigPathExtent {

	public String getReportConfigPath() throws Throwable{
		Properties pObj= new Properties();
		String reportConfigPath = pObj.getPropertyKeyValue("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
} 
