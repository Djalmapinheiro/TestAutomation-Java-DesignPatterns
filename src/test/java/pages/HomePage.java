package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Drivers.DriversFactory;
import metodos.Metodos;

public class HomePage extends DriversFactory {

	Metodos metodos = new Metodos(driver);

	@FindBy(xpath = "//div[@class='card-body']//h5[text()='Elements'] ")
	private WebElement botaoElements;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public HomePage acessarDemoQa() {
		driver.get("https://demoqa.com/");
		return new HomePage(driver);

	}

	public ElementsPage abrirPaginaElements() {
		metodos.scroll(0, 250);
		botaoElements.click();
		return new ElementsPage(driver);

	}

}
