package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Drivers.DriversFactory;
import metodos.Metodos;

public class TextBoxPage extends DriversFactory {

	Metodos metodos = new Metodos(driver);

	@FindBy(xpath = "//input[@id='userName'] ")
	private WebElement campoNome;

	@FindBy(xpath = "//input[@id='userEmail'] ")
	private WebElement campoEmail;

	@FindBy(xpath = "//textarea[@id='currentAddress'] ")
	private WebElement campoEnderecoAtual;

	@FindBy(xpath = "//textarea[@id='permanentAddress'] ")
	private WebElement campoEnderecoPermanente;

	@FindBy(xpath = "//button[@id='submit'] ")
	private WebElement botaoSubmit;

	@FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
	private WebElement mensagemCadastro;

	public TextBoxPage(WebDriver driver) {
		super(driver);

	}

	public TextBoxPage preencherFormularioTextBox(String nomeCompleto, String email, String enderecoAtual,
			String enderecoPermanente) {
		campoNome.sendKeys(nomeCompleto);
		campoEmail.sendKeys(email);
		campoEnderecoAtual.sendKeys(enderecoAtual);
		campoEnderecoPermanente.sendKeys(enderecoPermanente);
		metodos.scroll(0, 350);
		botaoSubmit.click();
		return new TextBoxPage(driver);

	}

	public String mensagemSucesso() {
		return mensagemCadastro.getText();

	}

}
