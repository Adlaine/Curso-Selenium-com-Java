package br.ce.wcaquino.pages;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");// Para acessar a pagina
	}
	
	public void setEmail(String mail) {
		escrever("email", mail);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void clicarBotaoEntrar() {
		clicarBotaoPorTexto("Entrar");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBotaoEntrar();
		
	}

}
