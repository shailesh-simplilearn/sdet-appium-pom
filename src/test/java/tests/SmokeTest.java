package tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import page.MainPage;

public class SmokeTest extends BaseClass{
	
	@Test
	public void firstMethod() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.goTOTheme();
		
		Thread.sleep(3000);
	}

}
