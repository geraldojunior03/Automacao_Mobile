package stepsDefinition;

import functions.opescondidaFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class opescondidaSteps {

	opescondidaFunctions of = new opescondidaFunctions();
	
	@Dado("que eu role a tela até o final do aplicativo")
	public void que_eu_role_a_tela_até_o_final_do_aplicativo() {
	    of.rolarTela();
	}

	@Dado("clico em opção bem escondida")
	public void clico_em_opção_bem_escondida() {
	    of.clicarOp();
	}

	@Quando("eu clicar em OK")
	public void eu_clicar_em_ok() {
	    of.aceitarOp();
	}

	@Então("devo verificar se este alerta será fechado.")
	public void devo_verificar_se_este_alerta_será_fechado() {
	    of.validarEscolha();
	}

	
}
