package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;


@DisplayName("Testes Automatizados no Formulario TextBox")
public class TextBoxTests {

	private WebDriver driver;

	@BeforeEach
	public void setUp() {

		// Abrir o Navegador
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
	}

	@Test
	@DisplayName("Registrar um novo usuario no textBox")

	public void testRegistrarUmNovoUsuarioNoTextBox() {

		String mensagemCadastroAtual = new HomePage(driver)
		.acessarDemoQa()
		.abrirPaginaElements()
		.abrirFormularioTextBox()
		.preencherFormularioTextBox("Djalma Junior ", "teste@gmail.com", "Rua das Oliveiras, n14", "Nova Jersey")
		.mensagemSucesso();

		
		assertEquals(mensagemCadastroAtual,
		  "Name:Djalma Junior\r\n" + "Email:teste@gmail.com\r\n" +
		  "Current Address :Rua das Oliveiras, n14\r\n" +
		  "Permananet Address :Nova Jersey");
		
	}

	@AfterEach
	public void tearDown() {
		driver.quit();

	}

}
