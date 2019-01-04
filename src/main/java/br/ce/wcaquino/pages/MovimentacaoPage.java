package br.ce.wcaquino.pages;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;

public class MovimentacaoPage extends BasePage {

	public void inserirDataMovimentacao(String data) {
		escrever("data_transacao", data);
	}

	public void inserirDataPagamento(String data) {
		escrever("data_transacao", data);
	}

	public void Salvar() {
		clicarBotao(By.xpath("//button[@type='submit']"));
	}

	public void inserirDescricao(String descricao) {
		escrever("descricao", descricao);
		
	}

	public void inserirInteressado(String interessado) {
		escrever("descricao", interessado);
		
	}

	public void inserirValor( String valor) {
		
		
	}
}
