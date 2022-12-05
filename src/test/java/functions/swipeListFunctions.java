package functions;

import org.junit.Assert;

import pages.swipeListPages;

public class swipeListFunctions {

	swipeListPages sp = new swipeListPages();
	
	public void entrarSwipeList() {
		sp.entrarSwipeList();
	}
	
	public void arrastarElementoE() {
		sp.arrastarEsquerda();
	}
	
	public void arrastarElementoD() {
		sp.arrastarDireita();
	}
	
	public void clicarMais() {
		sp.clicarMais();
	}
	
	public void clicarMenos() {
		sp.clicarMenos();
	}
	
	public void validarMais() {
		String mensagem = sp.validarMais("1");
		Assert.assertTrue(mensagem.contains("Opção 1 (+)"));
	}
	
	public void validarMenos() {
		String mensagem = sp.validarMenos("1");
		Assert.assertTrue(mensagem.contains("Opção 1 (-)"));
	}
	
	public void validarReset() {
		String mensagem = sp.validarReset("1");
		Assert.assertTrue(mensagem.contains("Opção 1"));
	}
}
