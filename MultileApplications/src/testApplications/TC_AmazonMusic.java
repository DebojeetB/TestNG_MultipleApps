package testApplications;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import app_Info.AmazonMusic;
import app_Info.PageObjectModel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_AmazonMusic extends AmazonMusic{
	
	@Test
	public void automateAmazonMusic() throws IOException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		PageObjectModel pom= new PageObjectModel(driver);
		Properties prop= new Properties();
		
		FileInputStream fip= new FileInputStream(System.getProperty("user.dir")+ ("\\src\\config.properties"));
		prop.load(fip);
		
		pom.Credentials.get(0).sendKeys(prop.getProperty("userName"));
		pom.Credentials.get(1).sendKeys(prop.getProperty("passWord"));
		driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(15000);
		System.out.println("Pause Check");
		driver.findElement(By.className("android.widget.Button")).click();
		driver.findElement(By.id("com.amazon.mp3:id/tab_bar_text_two")).click();
		
		WebElement songSelection= driver.findElement(By.className("android.widget.EditText"));
		songSelection.click();
		songSelection.sendKeys("Humraah");
		
		driver.findElement(By.id("com.amazon.mp3:id/query")).click();
		driver.findElement(By.id("com.amazon.mp3:id/AlbumArtwork")).click();
		driver.findElement(By.id("com.amazon.mp3:id/PlayButton")).click();
		Thread.sleep(15000);
		driver.quit();
		
	}	

}
