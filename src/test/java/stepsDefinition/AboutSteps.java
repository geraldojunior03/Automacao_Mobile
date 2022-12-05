package stepsDefinition;

import functions.aboutFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AboutSteps {
	
	aboutFunctions af = new aboutFunctions();
	
	@Dado("que eu entre no menu about")
	public void clico_em_about() {
	    af.entrarAbout();
	}

	@Quando("abrir uma tela de sobre do aplicativo")
	public void abrir_uma_tela_de_sobre_do_aplicativo() throws InterruptedException {
	    af.esperarAbout();
	}

	@Então("devo verificar se há alguma irregularidade de posicionamento dos elementos e validar as mensagens")
	public void devo_verificar_se_há_alguma_irregularidade_de_posicionamento_dos_elementos() {
	    af.validarMensagens();
	}
}
