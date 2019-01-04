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

}
