package br.ce.wcaquino.pages;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;

public class ResumoPage extends BasePage {
	
	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class = 'glyphicon glyphicon-remove-circle']"));
		
	}
	public String obterMensagemSucesso() {		
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
		
	}
	public void excluirContaComMovimentacao(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas").
		findElement(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']")).click();
		
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

}
