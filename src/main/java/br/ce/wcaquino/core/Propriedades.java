package br.ce.wcaquino.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = false; // para fechar ou n�o o browse
	
	public static Browsers browser = Browsers.CHROME;
	
	public static String NOME_CONTA_ALTERADA = "Conta alterada" + System.nanoTime();// pega a conta mais um tempo em nano 
	//segundo, sendo assim o nome da conta nunca ser� igual e dar� para ir rodando o teste sem se preocupar de dar o mesmo nome de conta,para numda se repetir
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}

}
