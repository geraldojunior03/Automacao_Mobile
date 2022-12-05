package functions;

import org.junit.Assert;
import pages.aboutPages;

public class aboutFunctions {
	
	aboutPages ap = new aboutPages();
	
	public void entrarAbout() {
		ap.entrarAbout();
	}
	
	public void esperarAbout() throws InterruptedException {
		ap.esperaEntrarAbout(500);
	}
	
	public void validarMensagens() {
		String mensagem = ap.validarMensagem();
		Assert.assertTrue(mensagem.contains("Testes funcionais de aplicações Android com Appium"));
	}
}
