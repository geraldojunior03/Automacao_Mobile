package stepsDefinition;

import functions.abasFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class abasSteps {
	
	abasFunctions af = new abasFunctions();
	
	@Dado("que eu entre no menu abas")
	public void que_eu_entre_no_menu_abas() {
	    af.entrarAbas();
	}

	@Dado("valido a mensagem da primeira aba")
	public void valido_a_mensagem_da_primeira_aba() {
	    af.validarAba1();
	}

	@Quando("clico no menu segunda aba")
	public void clico_no_menu_segunda_aba() {
	    af.entrarAba2();
	}
	@Então("devo validar se a mensagem da segunda aba apareceu")
	public void devo_validar_se_a_mensagem_da_segunda_aba_apareceu() {
	    af.validarAba2();
	}
}
