package stepsDefinition;

import functions.sbNativoFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class sbNativoSteps {

	sbNativoFunctions sbf = new sbNativoFunctions();
	
	@Dado("que eu entre no meu seu barriga nativo")
	public void que_eu_entre_no_meu_seu_barriga_nativo() {
	    sbf.entrarNativo();
	}
	
	@Quando("clico no botão entrar")
	public void clicar_no_botão_entrar() throws InterruptedException {
	    sbf.realizarLogin();
	}
	
	@Então("devo validar se o login foi efetuado com sucesso")
	public void devo_validar_se_o_login_foi_efetuado_com_sucesso() {
	    sbf.validarLogin();
	}
}
