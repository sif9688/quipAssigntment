package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Core {

	WebDriver driver;

	public Core(WebDriver driver) {
		this.driver = driver;
	}

	public void getURL(String url) {
		driver.get(url);
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void typeOnElement(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public void selectFromDropDownByIndex(By by, int index) {
		new Select(driver.findElement(by)).selectByIndex(index);
	}

}
