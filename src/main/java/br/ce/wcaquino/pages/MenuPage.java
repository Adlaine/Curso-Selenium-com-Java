package br.ce.wcaquino.pages;

import br.ce.wcaquino.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");

	}

	public void acessarTelaListaConta() {
		clicarLink("Contas");
		clicarLink("Listar");

	}

	public void acessarTelaExcluirConta() {
		acessarTelaListaConta();

	}

	public void acessarTelaMovimentacao() {
		clicarLink("Criar Movimentação");

	}
	
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");

	}
	public void acessarTelaResumoMensal() {
		clicarLink("Resumo Mensal");
	}
	
	public void acessarTelaPrincipal() {
		clicarLink("Home");

	}
	
	
	

}
