package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestRun.TestRunnerWithTestNG;


public class UtilForExtentReport extends TestRunnerWithTestNG{

	public static byte[] takeSceenShot()
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
