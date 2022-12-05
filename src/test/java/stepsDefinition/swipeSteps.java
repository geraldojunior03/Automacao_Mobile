package stepsDefinition;

import functions.swipeFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class swipeSteps {

	swipeFunctions sf = new swipeFunctions();
	
	@Dado("que eu entre no menu Swipe")
	public void que_eu_entre_no_menu_swipe() {
	    sf.entrarSwipe();
	}

	@Dado("valide a mensagem de mova a tela para a esquerda")
	public void valide_a_mensagem_de_mova_a_tela_para_a_esquerda() {
	    sf.validarMensagem1();
	}

	@Dado("clique na seta para direita")
	public void clique_na_seta_para_direita() {
	    sf.avancarTela();
	}

	@Quando("valide a mensagem de e veja se você consegue")
	public void valide_a_mensagem_de_e_veja_se_você_consegue() {
	    sf.validarMensagem2();
	}

	@Então("valide a mensagem Chegar até o fim!")
	public void valide_a_mensagem_chegar_até_o_fim() {
		sf.validarMensagem3();
	}
}
