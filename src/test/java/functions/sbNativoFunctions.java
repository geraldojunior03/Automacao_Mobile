package functions;

import org.junit.Assert;

import pages.sbNativoPages;

public class sbNativoFunctions {
	
	sbNativoPages sbp = new sbNativoPages();
	
	public void entrarNativo() {
		sbp.entrarNativo();
	}
	
	public void realizarLogin() throws InterruptedException {
		sbp.realizarLogin();
		sbp.aguardar(2000);
	}
	
	public void validarLogin() {
		String mensagem = sbp.validarMensagem();
		Assert.assertTrue(mensagem.contains("Conta para movimentacoes"));
	}
}
