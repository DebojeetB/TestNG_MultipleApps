package testApplications;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import app_Info.Hotstar;
import app_Info.PageObjectModel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_Hotstar extends Hotstar {
	
	@Test
	public void automateHotstar() throws IOException, InterruptedException {
	
	AndroidDriver<AndroidElement> driver= Capabilities();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	
	PageObjectModel poModel= new PageObjectModel(driver);	
	
	poModel.ContinueButton.click();
	driver.findElement(By.xpath("//*[contains (@text, \"English\")]")).click();
	poModel.Continue.click();

	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Best of Disney+\").instance(0))");

	List<AndroidElement> allMovies= driver.findElements(By.id("in.startv.hotstar:id/image"));
	
	for (int i=0; i<allMovies.size(); i++) {
		
		String packageName= allMovies.get(i).getTagName();
		
		if(packageName.equals("Movie Name Bala")) {
			
			allMovies.get(i).click();
			break;
			}
		
	}
	
	Thread.sleep(10000);
	driver.findElement(By.id("in.startv.hotstar:id/play")).click();
	Thread.sleep(15000);
	driver.quit();
	
	}}



