package page;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import medthods.MethodClass;

public class MainPage  {
	
	public MainPage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
	private AndroidElement viewLink;
	@AndroidFindBy(accessibility = "Controls")
	private AndroidElement contoldButton;
	@AndroidFindBy(accessibility = "1. Light Theme")
	private AndroidElement lightThemeBUtton;
	@AndroidFindBy(id="io.appium.android.apis:id/check1")
	private AndroidElement checkBox1;
	
	MethodClass methods = new MethodClass();
	
	public void goTOTheme() {
		//methods.clickOnElement(viewLink);
		viewLink.click();
		methods.clickOnElement(contoldButton);
		methods.clickOnElement(lightThemeBUtton);
		methods.clickOnElement(checkBox1);
		
		
		
	}

}
