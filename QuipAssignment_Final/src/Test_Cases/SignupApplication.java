package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Object_Repository.Scenario;
import Object_Repository.SharedData;

@Test
public class SignupApplication {
	WebDriver driver;

	public void signup() {
		System.setProperty("webdriver.gecko.driver", "/Users/syedfarid/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get(SharedData.logInPage);
		Scenario run = new Scenario(driver);
		run.accountCreation();

	}
}