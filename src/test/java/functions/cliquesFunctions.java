package functions;

import org.junit.Assert;

import pages.cliquesPages;

public class cliquesFunctions {

	cliquesPages cp = new cliquesPages();
	
	public void entrarCliques() {
		cp.entrarCliques();
	}
	
	public void cliqueLongo() {
		cp.cliqueLongo();
	}
	
	public void cliqueDuplo() {
		cp.cliqueDuplo();
	}
	
	public void duploLento() throws InterruptedException {
		cp.duploLento(1000);
	}
	
	public void Limpar() {
		cp.Limpar();
	}
	
	public void esperar() throws InterruptedException {
		cp.esperar(5000);
	}
	
	// VALIDAR
	
	public void validarLongo()  {
		String mensagem = cp.validarLongo();
		Assert.assertTrue(mensagem.contains("Clique Longo"));
	}
	
	public void validarDuplo() {
		String mensagem = cp.validarDuplo();
		Assert.assertTrue(mensagem.contains("Duplo Clique"));
	}
	
	public void validarDuploLongo() {
		String mensagem = cp.validarDuploLongo();
		Assert.assertTrue(mensagem.contains("Duplo Clique lento"));
	}
	
	public void validarLimpar() {
		String mensagem = cp.validarLimpar();
		Assert.assertTrue(mensagem.contains(""));
	}
}
