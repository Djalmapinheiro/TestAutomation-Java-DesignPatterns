package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DriversFactory {

	protected WebDriver driver;

	public DriversFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

}
