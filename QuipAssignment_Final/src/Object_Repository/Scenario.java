package Object_Repository;

import org.openqa.selenium.WebDriver;

public class Scenario {
	WebDriver driver;
	Signup_Page s;

	public Scenario(WebDriver driver) {
		this.driver = driver;
		s = new Signup_Page(driver);
	}

	public void accountCreation() {
		s.nameFirst();
		s.lastName();
		s.eMail();
		s.password();
		s.mobilePhoneNumber();
		s.birthMonth();
		s.birthDay();
		s.birthYear();
		s.clickOnContinue();
	}

}
