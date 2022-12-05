package functions;

import org.junit.Assert;

import pages.alertPages;

public class alertFunctions {

	alertPages alp = new alertPages();
	
	public void entrarAlerta() {
		alp.entrarAlertas();
	}
	
	public void aguardar() throws InterruptedException {
		alp.aguardarAlerta(500);
	}
	
	// ALERTA SIMPLES
	
	public void clicarSimples() {
		alp.alertaSimples();
	}	
	
	public void aceitarSimples() {
		alp.aceitarSimples();
	}
	
	// ALERTA RESTRITIVO
	
	public void clicarRestritivo() {
		alp.alertaRestritivo();
	}
	
	public void sairRestritivo() {
		alp.sairRestritivo();
	}
	
	// ALERTA CONFIRM
	
	public void clicarConfirm() {
		alp.alertaConfirm();
	}
	
	public void aceitarConfirm() {
		alp.aceitarConfirm();
	}
	
	public void validarAceito() {
		String mensagem = alp.validarAceito();
		Assert.assertTrue(mensagem.contains("Confirmado"));
	}
	
	public void negarConfirm() {
		alp.negarConfirm();
	}
	
	public void validarNegado() {
		String mensagem = alp.validarNegado();
		Assert.assertTrue(mensagem.contains("Negado"));
	}
	
	public void sairConfirm() {
		alp.sairConfirm();
	}
}
