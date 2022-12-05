package functions;

import org.junit.Assert;

import pages.abasPages;

public class abasFunctions {

	abasPages ap = new abasPages();
	
	public void entrarAbas() {
		ap.entrarAbas();
	}
	
	public void validarAba1() {
		String mensagem = ap.validarAba1();
		Assert.assertTrue(mensagem.contains("Este é o conteúdo da Aba 1"));
	}
	
	public void entrarAba2() {
		ap.entrarAba2();
	}
	
	public void validarAba2() {
		String mensagem = ap.validarAba2();
		Assert.assertTrue(mensagem.contains("Este é o conteúdo da Aba 2"));
	}
}
