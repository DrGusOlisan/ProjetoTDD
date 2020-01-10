package br.com.rsinet.hub_tdd.projetoTDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.pageObjects.PaginaPrincipal;
import br.com.rsinet.hub_tdd.pageObjects.PaginaDeLogin;

public class App {

	private static WebDriver driver;

	@Test
	public void loga() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");

		PaginaPrincipal.botaoConta(driver).click();

		PaginaDeLogin.logaUsuario(driver).sendKeys("");
		PaginaDeLogin.logaSenha(driver).sendKeys("");
		PaginaDeLogin.botaoLogar(driver).click();

		PaginaPrincipal.desloga(driver).click();

		driver.quit();
	}
}
