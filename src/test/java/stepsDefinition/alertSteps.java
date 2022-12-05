package stepsDefinition;

import functions.alertFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class alertSteps {
	
	alertFunctions alf = new alertFunctions();
	
	@Dado("que eu entre no menu alerta")
	public void que_eu_entre_no_menu_alerta() {
	    alf.entrarAlerta();
	}
	
	// ALERTA SIMPLES
	
	@Dado("clico alerta simples")
	public void clico_alerta_simples() {
	    alf.clicarSimples();
	}
	
	@Quando("abrir uma tela de alerta clicavel")
	public void abrir_uma_tela_de_alerta_clicavel() throws InterruptedException {
	    alf.aguardar();
	}
	
	@Então("devo verificar se ao clicar no botão OK, alerta deve ser aceito")
	public void devo_verificar_se_ao_clicar_no_botão_ok_alerta_deve_ser_aceito() {
	    alf.aceitarSimples();
	}
	
	// ALERTA RESTRITIVO
	
	@Dado("clico em alerta restritivo")
	public void clico_em_alerta_restritivo() {
		alf.clicarRestritivo();
	}
	
	@Então("devo verificar se ao clicar no botão SAIR, alerta deve ser fechado")
	public void devo_verificar_se_ao_clicar_no_botão_sair_alerta_deve_ser_fechado() {
	    alf.sairRestritivo();
	}
	
	// ALERTA CONFIRM
	
	@Dado("clico em alerta confirm")
	public void clico_em_alerta_confirm() {
	    alf.clicarConfirm();
	}
	
	@Dado("clico em confirmar")
	public void clico_em_confirmar() {
	    alf.aceitarConfirm();
	}
	
	@Dado("valido que foi confirmado")
	public void valido_que_foi_confirmado() {
	    alf.validarAceito();
	}
	
	@Dado("clico em sair")
	public void clico_em_sair() {
	    alf.sairConfirm();
	}
	
	@Dado("clico em negar")
	public void clico_em_negar() {
	    alf.negarConfirm();
	}
	
	@Quando("valido que foi negado")
	public void valido_que_foi_negado() {
	   alf.validarNegado();
	}
	
	@Então("clicar em sair")
	public void clicar_em_sair() {
	    alf.sairConfirm();
	}
}
