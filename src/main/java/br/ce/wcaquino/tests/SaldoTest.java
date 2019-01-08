package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.HomePage;
import br.ce.wcaquino.pages.MenuPage;

public class SaldoTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	HomePage homePage = new HomePage();
	
	@Test
	public void testSaldoConta() {
		menuPage.ValidaTela("500.00", homePage.obterSaldoConta("Conta alterada 3"));
		
	}

}
