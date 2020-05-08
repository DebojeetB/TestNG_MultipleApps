package app_Info;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hotstar {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws IOException{
	
		File fs= new File("src");
		File f= new File(fs, "Hotstar.apk");
		
		
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Debo");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
	cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());

	AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	return driver;
	
	
	}

}
