package functions;

import pages.splashPages;

public class splashFunctions {

	splashPages sp = new splashPages();
	
	public void entrarSplash() throws InterruptedException {
		sp.entrarSplash();
		sp.aguardar(2000);
	}
	
	public void validarMensagem() {
		sp.validarPrimeira();
		sp.validarSegunda();
		sp.validarTerceira();
		sp.validarQuarta();
		sp.validarQuinta();
	}
}
