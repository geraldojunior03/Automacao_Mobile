package stepsDefinition;

import functions.accordionFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class accordionSteps {

	accordionFunctions af = new accordionFunctions();
	
	@Dado("que eu entre no menu accordion")
	public void que_eu_entre_no_menu_accordion() {
	    af.entrarAccordion();
	}

	@Quando("clico na primeira opção")
	public void clico_na_primeira_opção() {
	    af.escolherOP1();
	}

	@Então("valido a mensagem da primeira opção")
	public void valido_a_mensagem_da_primeira_opção() {
	    af.validarMensagem1();
	}

	@Quando("clico na segunda opção")
	public void clico_na_segunda_opção() {
	    af.escolherOP2();
	}

	@Então("valido a mensagem da segunda opção")
	public void valido_a_mensagem_da_segunda_opção() {
	    af.validarMensagem2();
	}
	
	@Quando("clico na terceira opção")
	public void clico_na_terceira_opção() {
	    af.escolherOP3();
	}

	@Então("valido a mensagem da terceira opção")
	public void valido_a_mensagem_da_terceira_opção() {
	    af.validarMensagem3();
	}
	
	@Quando("clico na quarta opção")
	public void clico_na_quarta_opção() {
	    af.escolherOP4();
	}

	@Então("valido a mensagem da quarta opção")
	public void valido_a_mensagem_da_quarta_opção() {
	    af.validarMensagem4();
	}
	
	@Quando("clico na quinta opção")
	public void clico_na_quinta_opção() {
	    af.escolherOP5();
	}

	@Então("valido a mensagem da quinta opção")
	public void valido_a_mensagem_da_quinta_opção() {
	    af.validarMensagem5();
	}
	
	@Quando("clico na sexta opção")
	public void clico_na_sexta_opção() {
	    af.escolherOP6();
	}

	@Então("valido a mensagem da sexta opção")
	public void valido_a_mensagem_da_sexta_opção() {
	    af.validarMensagem6();
	}

}
