package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class formPages {
	
	BasePage bp = new BasePage();
	
	// ENTRANDO NO FORMULARIO
	
	public void entrarFormulario() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Formulário']"));
	}
	
	// PREENCHENDO OS CAMPOS
	
	public void console(String console) {
		bp.clicar(By.id("android:id/text1"));
		bp.clicar(By.xpath("//android.widget.CheckedTextView[@text='" + console + "']"));
	}
	
	public void selecionarCheckbox() {
		bp.clicar(By.xpath("//android.widget.CheckBox[@content-desc='check']"));
	}
	
	public void selecionarSwitch() {
		bp.clicar(By.xpath("//android.widget.Switch[@content-desc='switch']"));
	}
	
	// NASCIMENTO	
	
	public void calendario() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='01/01/2000']"));
	}
	
	public void clicarAno() {
		bp.clicar(By.id("android:id/date_picker_header_year"));
	}
	
	public void escolherAno(String ano) {
		bp.clicar(By.xpath("//android.widget.TextView[@text='" + ano + "']"));
	}
	
	public void avancarMes() {
		bp.clicar(By.xpath("//android.widget.ImageButton[@resource-id='android:id/next']"));
	}
	
	public void escolherDia(int dia) {
		bp.clicar(By.xpath("//android.view.View[@text='" + dia + "']"));
	}
	
	public void aceitarBtn() {
		bp.clicar(By.xpath("//android.widget.Button[@text='OK']"));
	}

	// HORARIO
	
	public void horario() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='12:00']"));
	}
	
	public void escolherHora() {
		bp.clicar(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='20']"));
	}
	
	public void escolherMinutos() {
		bp.clicar(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='0']"));
	}
	
	// SALVANDO
	
	public void clicarSalvar() {
		bp.clicar(By.xpath("//android.widget.Button[@content-desc='save']"));
	}
	
	public void clicarLimpar() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='LIMPAR']"));
	}
	
	public void clicarSalvarDemorado() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='SALVAR DEMORADO']"));
	}
	
	public void aguardar(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	// VALIDANDO
	
	public String validarInformacoes(String dataNasc) {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='" + dataNasc + "']"));
	}
	
	public String validarInformacoesApagadas() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='12:00']"));
	}
}
