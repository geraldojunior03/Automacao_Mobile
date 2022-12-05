package stepsDefinition;

import functions.swipeListFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class swipeListSteps {

	swipeListFunctions sf = new swipeListFunctions();
	
	@Dado("que eu entre no menu swipe list")
	public void que_eu_entre_no_menu_swipe_list() {
	    sf.entrarSwipeList();
	}

	@Dado("arraste pra direita")
	public void arraste_pra_direita() {
	    sf.arrastarElementoE();
	}

	@Quando("clique em mais")
	public void clique_em_mais() {
	    sf.clicarMais();
	}

	@Então("valido que o elemento fique estilizado com estilo de mais")
	public void valido_que_o_elemento_fique_estilizado_com_estilo_de_mais() {
	    sf.validarMais();
	}

	@Quando("clique em menos")
	public void clique_em_menos() {
	    sf.clicarMenos();
	}
	
	@Então("valido que o elemento fique estilizado com estilo de menos")
	public void valido_que_o_elemento_fique_estilizado_com_estilo_de_menos() {
	    sf.validarMenos();
	}
	
	@Dado("arraste pra esquerda")
	public void arraste_pra_esquerda() {
	    sf.arrastarElementoD();
	}

	@Quando("clique em resetar")
	public void clique_em_resetar() {
	    sf.validarReset();
	}
	
	@Então("valido que o elemento fique estilizado com estilo padrão")
	public void valido_que_o_elemento_fique_estilizado_com_estilo_padrão() {
	    sf.validarReset();
	}
}
