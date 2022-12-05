package functions;

import org.junit.Assert;
import pages.formPages;

public class formFunctions {
	
	formPages fp = new formPages();
	
	public void entrarForm() {
		fp.entrarFormulario();
	}
	
	public void escolherConsole() {
		fp.console("PS4");
	}
	
	public void selecionarCheckbox() {
		fp.selecionarCheckbox();
	}
	
	public void selecionarSwitch() {
		fp.selecionarSwitch();
	}
	
	public void dataNascimento() {
		fp.calendario();
		fp.clicarAno();
		fp.escolherAno("2003");
		for(int i = 1; i < 12; i++) {
			fp.avancarMes();
		}
		fp.escolherDia(31);
		fp.aceitarBtn();
	}
	
	public void horaNascimento() {
		fp.horario();
		fp.escolherHora();
		fp.escolherMinutos();
		fp.aceitarBtn();
	}
	
	public void verificarMensagem() {
		String mensagem = fp.validarInformacoes("Data: 31/12/2003");
		Assert.assertTrue(mensagem.contains("Data: 31/12/2003"));
	}
	
	public void verificarMensagemApagadas() {
		String mensagem = fp.validarInformacoesApagadas();
		Assert.assertTrue(mensagem.contains("12:00"));
	}
	
	public void clicarSalvar() {
		fp.clicarSalvar();
	}
	
	public void clicarLimpar() {
		fp.clicarLimpar();
	}
	
	public void salvarDemorado() {
		fp.clicarSalvarDemorado();
	}
	
	public void aguardar() throws InterruptedException {
		fp.aguardar(5);
	}
}
