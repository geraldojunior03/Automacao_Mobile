package stepsDefinition;

import functions.cliquesFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class cliquesSteps {

	cliquesFunctions cf = new cliquesFunctions();
	
	@Dado("que eu entre no menu cliques")
	public void que_eu_entre_no_menu_cliques() {
	    cf.entrarCliques();
	}
	
	@Quando("eu der um clique longo")
	public void eu_der_um_clique_longo() {
	    cf.cliqueLongo();
	}

	@Então("devo validar que a mensagem de clique lento apareceu no campo de texto")
	public void devo_validar_que_a_mensagem_de_clique_lento_apareceu_no_campo_de_texto() {
	    cf.validarLongo();
	}
	
	@Quando("der dois clique no botão escrito duplo clique")
	public void dê_dois_clique_no_botão_escrito_duplo_clique() {
	    cf.cliqueDuplo();
	}

	@Então("devo validar que a mensagem de duplo clique apareceu no campo de texto")
	public void devo_validar_que_a_mensagem_de_duplo_clique_apareceu_no_campo_de_texto() {
	    cf.validarDuplo();
	}
	
	@Quando("der duplo clique lento")
	public void dê_um_clique() throws InterruptedException {
	    cf.duploLento();
	}

	@Então("devo validar que a mensagem de duplo clique lento apareceu no campo de texto")
	public void devo_validar_que_a_mensagem_de_duplo_clique_lento_apareceu_no_campo_de_texto() {
	    cf.validarDuploLongo();
	}
	
	@Quando("clique no botão escrito LIMPAR")
	public void clique_no_botão_escrito_limpar() {
	    cf.Limpar();
	}

	@Então("devo validar que a utlima mensagem que apareceu no campo de texto foi limpa")
	public void devo_validar_que_a_utlima_mensagem_que_apareceu_no_campo_de_texto_foi_limpa() {
	    cf.validarLimpar();
	}



}
