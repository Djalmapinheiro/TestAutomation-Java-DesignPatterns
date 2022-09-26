package metodos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public Metodos(WebDriver driver) {
		super(driver);

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy( " + n1 + "," + n2 + " )");

	}

}
