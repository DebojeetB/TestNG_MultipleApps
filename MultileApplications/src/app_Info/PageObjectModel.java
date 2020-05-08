package app_Info;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObjectModel {
	
	public PageObjectModel(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="in.startv.hotstar:id/btn_choose")
	public WebElement ContinueButton;

	
	@AndroidFindBy(id="in.startv.hotstar:id/tv_continue")
	public WebElement Continue;

	@AndroidFindBy(className="android.widget.EditText")
	public List <WebElement> Credentials;
	
	
	
}
