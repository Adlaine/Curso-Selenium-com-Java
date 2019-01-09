package br.ce.wcaquino.tests;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.Propriedades;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.MovimentacaoPage;
import utils.DataUtils;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)// para colocar os testes em ordem alfabeticas para a execu��o de todos

public class MovimentacaoTest extends BaseTest {
		
	
	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void test1_InserirMovimentacao() {
		menuPage.acessarTelaMovimentacao();
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));//j� pega a data de hoje para colocar no formulario
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));
		movimentacaoPage.setDescricao("wwww");
		movimentacaoPage.setInteressado("to");
		movimentacaoPage.setValor("500");
		movimentacaoPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		movimentacaoPage.setStatusPago();
		movimentacaoPage.Salvar();
		movimentacaoPage.ValidaTela("Movimenta��o adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());		
	}
	
	@Test
	public void test2_ValidarCamposObrigatorios() {
		menuPage.acessarTelaMovimentacao();
		movimentacaoPage.Salvar();
		List<String> erros = movimentacaoPage.obterErros();
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				 "Data da Movimenta��o � obrigat�rio",
				 "Data do pagamento � obrigat�rio",
				 "Descri��o � obrigat�rio",
				 "Interessado � obrigat�rio",
				 "Valor � obrigat�rio",
				 "Valor deve ser um n�mero")));  // cole��o de erros
		Assert.assertEquals(6, erros.size()); // verifica o tamanho da cole��o � igual			
	}
	
	@Test
	public void test3_InserirMovimentacaoFutura() {
		menuPage.acessarTelaMovimentacao();
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);	
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDescricao("wwww");
		movimentacaoPage.setInteressado("qqqqq");
		movimentacaoPage.setValor("120");
		movimentacaoPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		movimentacaoPage.setStatusPago();
		movimentacaoPage.Salvar();
			List<String> erros = movimentacaoPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimenta��o deve ser menor ou igual � data atual"));
		Assert.assertEquals(1, erros.size());
	}
	

}
