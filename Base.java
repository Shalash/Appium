
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	
	
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		AndroidDriver<AndroidElement>  driver;
		
		File appDir = new File("src");
	     File app = new File(appDir, "AppName.apk");
	     
	     DesiredCapabilities cap = new DesiredCapabilities();
		// define emulator/virtual device capabilities
	     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulatorName");
		
		//define automation name- app to be used to get elements
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		
		//define tested app path
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//Assign driver
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	     
		return driver;
	}

}
