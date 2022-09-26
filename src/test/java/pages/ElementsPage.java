package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Drivers.DriversFactory;

public class ElementsPage extends DriversFactory {

	@FindBy(xpath = "//span[text()='Text Box'] ")
	private WebElement botaoTextBox;

	public ElementsPage(WebDriver driver) {
		super(driver);
	}

	public TextBoxPage abrirFormularioTextBox() {

		botaoTextBox.click();
		return new TextBoxPage(driver);

	}

}
