package br.ce.wcaquino.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.ContasPage;
import br.ce.wcaquino.pages.MenuPage;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)// para colocar os testes em ordem alfabeticas para a execução de todos

public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	
	
	@Test
	public void test1_InserirConta () {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta 100");
		contasPage.salvar();
		contasPage.ValidaTela("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void test2_AlterarConta() {
		menuPage.acessarTelaListaConta();
		contasPage.alterarConta("Conta 100");
		contasPage.setNome("Conta alterada 3");
		contasPage.salvar();
		contasPage.ValidaTela("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
		
	}
	
		
	@Test
	public void test3_InserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta alterada 3");
		contasPage.salvar();
		contasPage.ValidaTela("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}
	
	

}
