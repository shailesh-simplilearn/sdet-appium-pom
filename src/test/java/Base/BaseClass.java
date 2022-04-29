package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.MyConstants;
import utils.PropertyReader;

public class BaseClass {
	public AndroidDriver<MobileElement> driver;
	@BeforeSuite
	public void setupDriver() throws MalformedURLException {
		PropertyReader pReader = new PropertyReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub/");
		
		  cap.setCapability(MyConstants.platform_name, pReader.getPropertyValue(MyConstants.platform_name));
		  cap.setCapability(MyConstants.device_name, pReader.getPropertyValue(MyConstants.device_name));
		  cap.setCapability(MyConstants.platform_version, pReader.getPropertyValue(MyConstants.platform_version));
		  cap.setCapability(MyConstants.app_activity, pReader.getPropertyValue(MyConstants.app_activity));
		  cap.setCapability(MyConstants.app_package,pReader.getPropertyValue(MyConstants.app_package));
		 
		  driver = new AndroidDriver<MobileElement>(appiumURL, cap);
	}
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	

}
