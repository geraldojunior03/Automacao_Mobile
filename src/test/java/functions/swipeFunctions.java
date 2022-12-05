package functions;

import org.junit.Assert;

import pages.swipePages;

public class swipeFunctions {

	swipePages sp = new swipePages();
	
	public void entrarSwipe() {
		sp.entrarSwipe();
	}
	
	public void validarMensagem1() {
		String mensagem = sp.validarMensagem1();
		Assert.assertTrue(mensagem.contains("Mova a tela para"));
	}
	
	public void validarMensagem2() {
		String mensagem = sp.validarMensagem2();
		Assert.assertTrue(mensagem.contains("E veja se"));
	}
	
	public void validarMensagem3() {
		String mensagem = sp.validarMensagem3();
		Assert.assertTrue(mensagem.contains("Chegar até o fim!"));
	}
	
	public void avancarTela() {
		sp.avancarTela();
	}
}
