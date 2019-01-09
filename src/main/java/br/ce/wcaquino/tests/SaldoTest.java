package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.Propriedades;
import br.ce.wcaquino.pages.HomePage;
import br.ce.wcaquino.pages.MenuPage;

public class SaldoTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	HomePage homePage = new HomePage();
	
	
	@Test
	public void testSaldoConta() {
		menuPage.acessarTelaPrincipal();
		menuPage.ValidaTela("500.00", homePage.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
		
	}

}
