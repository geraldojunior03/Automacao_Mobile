package stepsDefinition;

import functions.formFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class formSteps {
	
	formFunctions ff = new formFunctions();
	
	@Dado("que eu entre no menu formulário")
	public void clico_em_formulário() {
	    ff.entrarForm();
	}

	@Dado("selecionar um videogame")
	public void selecionar_um_videogame() {
	    ff.escolherConsole();
	}

	@Dado("marcar o checkbox")
	public void marcar_o_checkbox() {
		ff.selecionarCheckbox();
	}
	
	@Dado("marcar o switch")
	public void marcar_o_switch() {
		ff.selecionarSwitch();
	}

	@Dado("selecionar a data de aniversário")
	public void selecionar_a_data_de_aniversário() {
	    ff.dataNascimento();
	}
	
	@Dado("selecionar a hora de nascimento")
	public void selecionar_a_hora_de_aniversário() {
	    ff.horaNascimento();
	}

	@Quando("clicar em salvar")
	public void clicar_em_salvar() {
	    ff.clicarSalvar();
	}
	
	@Então("devo verificar se as informações foram salvas")
	public void devo_verificar_se_as_informações_foram_salvas() {
		ff.verificarMensagem();
	}
	
	@Dado("validar as informações salvas")
	public void validar_as_informações_salvas() {
		ff.verificarMensagem();
	}

	@Quando("clicar em limpar")
	public void clicar_em_limpar() {
	    ff.clicarLimpar();
	}

	@Dado("clicar em salvar demorado")
	public void clicar_em_salvar_demorado() {
	    ff.salvarDemorado();
	}

	@Dado("aguardar")
	public void aguardar() throws InterruptedException {
	    ff.aguardar();
	}
	
	@Então("devo verificar se as informações salvas foram apagadas")
	public void devo_verificar_se_as_informações_salvas_foram_apagadas() {
	    ff.verificarMensagemApagadas();
	}
}
