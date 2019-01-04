package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.ContasPage;
import br.ce.wcaquino.pages.MenuPage;


public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testInserirConta () {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta 55");
		contasPage.salvar();
		contasPage.ValidaTela("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListaConta();
		contasPage.alterarConta("Conta 6");
		contasPage.setNome("Conta alterada 2");
		contasPage.salvar();
		contasPage.ValidaTela("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void TestExcluirConta() {
		menuPage.acessarTelaExcluirConta();
		contasPage.excluirConta("Conta alterada 2");
		contasPage.ValidaTela("Conta removida com sucesso!", contasPage.obterMensagemSucesso());
	}

}