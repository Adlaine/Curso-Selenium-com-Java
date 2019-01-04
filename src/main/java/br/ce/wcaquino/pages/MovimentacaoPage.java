package br.ce.wcaquino.pages;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;

public class MovimentacaoPage extends BasePage {

	public void setDataMovimentacao(String data) {
		escrever("data_transacao", data);
	}

	public void setDataPagamento(String data) {
		escrever("data_pagamento", data);
	}

	public void Salvar() {
		clicarBotao(By.xpath("//button[@type='submit']"));
	}

	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
		
	}

	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
		
	}

	public void setValor( String valor) {
		escrever("valor", valor);
		
	}

	public void setConta(String conta) {
		selecionarCombo("conta", conta);
		
	}

	public void setSituacao() {
		clicarRadio("status_pago");
				
	}
	public String obterMensagemSucesso() {		
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
