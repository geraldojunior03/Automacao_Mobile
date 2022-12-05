package stepsDefinition;

import functions.splashFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class splashSteps {
	
	splashFunctions sf = new splashFunctions();
	
	@Dado("que eu entre no menu splash")
	public void que_eu_entre_no_menu_splash() throws InterruptedException {
	    sf.entrarSplash();
	}
	
	@Então("devo validar se aparece uma mensagem na tela.")
	public void devo_validar_se_aparece_uma_mensagem_na_tela() {
	    sf.validarMensagem();
	}
}
