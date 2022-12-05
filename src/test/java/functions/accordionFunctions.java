package functions;

import org.junit.Assert;

import pages.accordionPages;

public class accordionFunctions {

	accordionPages ap = new accordionPages();
	
	public void entrarAccordion() {
		ap.entrarAccordion();
	}
	
	public void escolherOP1() {
		ap.escolherOP1();
	}
	
	public void validarMensagem1() {
		String mensagem1 = ap.validarMensagem1();
		Assert.assertTrue(mensagem1.contains("Esta é a descrição da opção 1"));
	}
	
	public void escolherOP2() {
		ap.escolherOP2();
	}
	
	public void validarMensagem2() {
		String mensagem2 = ap.validarMensagem2();
		Assert.assertTrue(mensagem2.contains("Esta é a descrição da opção 2"));
	}
	
	public void escolherOP3() {
		ap.escolherOP3();
	}
	
	public void validarMensagem3() {
		String mensagem3 = ap.validarMensagem3();
		Assert.assertTrue(mensagem3.contains("Esta é a descrição da opção 3"));
	}
	
	public void escolherOP4() {
		ap.escolherOP4();
	}
	
	public void validarMensagem4() {
		String mensagem4 = ap.validarMensagem4();
		Assert.assertTrue(mensagem4.contains("Esta é a descrição da opção 4"));
	}
	
	public void escolherOP5() {
		ap.escolherOP5();
	}
	
	public void validarMensagem5() {
		String mensagem5 = ap.validarMensagem5();
		Assert.assertTrue(mensagem5.contains("Esta é a descrição da opção 5"));
	}
	
	public void escolherOP6() {
		ap.escolherOP6();
	}
	
	public void validarMensagem6() {
		String mensagem6 = ap.validarMensagem6();
		Assert.assertTrue(mensagem6.contains("Esta é a descrição da opção 6"));
	}
	
	
}
