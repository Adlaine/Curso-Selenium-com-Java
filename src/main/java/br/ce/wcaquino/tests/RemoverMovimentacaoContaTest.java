package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.ContasPage;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.ResumoPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	

	private MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void TestExcluirContaComMovimentacao() {
		
		menuPage.acessarTelaListaConta();
		resumoPage.excluirContaComMovimentacao("Conta alterada 3");
		resumoPage.ValidaTela("Conta em uso na movimentações", contasPage.obterMensagemErro());
	
	}
		

}
