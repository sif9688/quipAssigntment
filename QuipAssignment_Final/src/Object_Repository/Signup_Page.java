package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup_Page {

	By firstName = By.id("usernamereg-firstName");
	By lastName = By.id("usernamereg-lastName");
	By eMail = By.id("usernamereg-yid");
	By password = By.id("usernamereg-password");
	By mobilePhoneNumber = By.id("usernamereg-phone");
	By month = By.id("usernamereg-month");
	By day = By.id("usernamereg-day");
	By year = By.id("usernamereg-year");
	By Continue = By.id("reg-submit-button");
	WebDriver driver;
	Core c;

	Signup_Page(WebDriver driver) {
		this.driver = driver;
		c = new Core(driver);
	}

	public void nameFirst() {
		c.typeOnElement(firstName, SharedData.firstName);
	}

	public void lastName() {
		c.typeOnElement(lastName, SharedData.lastName);
	}

	public void eMail() {
		c.typeOnElement(eMail, SharedData.email);
	}

	public void password() {
		c.typeOnElement(password, SharedData.password);
	}

	public void mobilePhoneNumber() {
		c.typeOnElement(mobilePhoneNumber, SharedData.mobilePhoneNumber);
	}

	public void birthMonth() {
		c.selectFromDropDownByIndex(month, SharedData.month);
	}

	public void birthDay() {
		c.typeOnElement(day, SharedData.day);
	}

	public void birthYear() {
		c.typeOnElement(year, SharedData.year);
	}

	public void clickOnContinue() {
		c.click(Continue);
	}
}
