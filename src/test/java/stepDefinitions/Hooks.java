package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void initPageObjects() {
		System.setProperty("webdriver.chrome.driver",
				"./chromedriver.dmg");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
