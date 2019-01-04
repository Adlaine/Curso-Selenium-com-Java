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
		movimentacaoPage.inserirDataMovimentacao("04/01/2019");
		movimentacaoPage.inserirDataPagamento("04/01/2019");
		movimentacaoPage.inserirDescricao("kkkk");
		movimentacaoPage.inserirInteressado("lllll");
		movimentacaoPage.inserirValor("123,50");
		
		
		
		
	}

}
