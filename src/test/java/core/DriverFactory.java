package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;


import io.appium.java_client.android.AndroidDriver;
import managers.FileReaderManager;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	public static String device = FileReaderManager.getInstance().getConfigReader().getDevice();;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("autoGrantPermissions", "true");
		desiredCapabilities.setCapability("appPackage", "com.ctappium");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		
//		desiredCapabilities.setCapability("appWaitActivity", "net.natura.semprepresente.tutorial.view.TutorialActivity");
//		desiredCapabilities.setCapability(MobileCapabilityType.APP, Properties.apkPath);
//		desiredCapabilities.setCapability("appActivity", "net.natura.natura_home.screen.home.HomeActivity");
//		desiredCapabilities.setCapability("apiKey", "784958e6-eb8a-40fb-95dd-966ee0498d72");
//		desiredCapabilities.setCapability("deviceId", device);
//		desiredCapabilities.setCapability("executionName", "APP Natura - Report Result");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
/*		try {
			driver = new AndroidDriver<MobileElement>(new URL("https://br.crashken.com/api/mobile/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}*/
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public static void resetAPP() {
		getDriver().resetApp();
		BaseTest.contadorPassos = 1;
	}

	public static void killDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
			BaseTest.contadorPassos = 1;
		}
	}

}
