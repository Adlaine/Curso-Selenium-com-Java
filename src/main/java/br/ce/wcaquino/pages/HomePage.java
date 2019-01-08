package br.ce.wcaquino.pages;

import br.ce.wcaquino.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldoConta(String conta) {
		return obterCelula("Conta", conta, "Saldo", "tabelaSaldo").getText();    //pegao saldo da tabela com um numero de conta passado po parametro 			
	}

}
