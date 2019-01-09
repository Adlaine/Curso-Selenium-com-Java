package br.ce.wcaquino.tests;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.DriverFactory;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	@Test
	public void test1_ExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		resumoPage.excluirMovimentacao();
		menuPage.ValidaTela("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
	}

	@Test
	public void test2_ResumoMensal() {
		menuPage.acessarTelaResumo();
		menuPage.ValidaTela("Seu Barriga - Extrato", getDriver().getTitle()); // import static ctrl shit m, vai
		// verificar o titulo da pagina/aba
		
		// Para verificar se a lista do resumo mensal realmente está vazia.
		
		List<WebElement> elementosEncontrados =
 					DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));// verifica todos os elementos da lista
		Assert.assertEquals(0 , elementosEncontrados.size());
		
	}

}
