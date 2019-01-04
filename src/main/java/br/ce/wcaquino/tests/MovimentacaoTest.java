package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void InserirMovimentacao() {
		menuPage.acessarTelaMovimentacao();
		movimentacaoPage.setDataMovimentacao("04/01/2019");
		movimentacaoPage.setDataPagamento("04/01/2019");
		movimentacaoPage.setDescricao("kkkk");
		movimentacaoPage.setInteressado("lllll");
		movimentacaoPage.setValor("123");
		movimentacaoPage.setConta("Conta 100");
		movimentacaoPage.setSituacao();
		movimentacaoPage.Salvar();
		movimentacaoPage.ValidaTela("Movimentação adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());
		
		
		
		
		
	}

}
