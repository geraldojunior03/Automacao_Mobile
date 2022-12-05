package pages;

import org.openqa.selenium.By;
import core.BasePage;

public class alertPages {

	BasePage bp = new BasePage();
	
	public void entrarAlertas() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Alertas']"));
	}
	
	public void aguardarAlerta(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	// ALERTA SIMPLES
	
	public void alertaSimples() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='ALERTA SIMPLES']"));
	}
	
	public void aceitarSimples() {
		bp.clicar(By.xpath("//android.widget.Button[@text='OK']"));
	}
	
	// ALERTA RESTRITIVO
	
	public void alertaRestritivo() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='ALERTA RESTRITIVO']"));
	}
	
	public void sairRestritivo() {
		bp.clicar(By.xpath("//android.widget.Button[@text='SAIR']"));
	}
	
	// ALERTA CONFIRM
	
	public void alertaConfirm() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='ALERTA CONFIRM']"));
	}
	
	public void aceitarConfirm() {
		bp.clicar(By.id("android:id/button2"));
	}
	
	public String validarAceito() {
		return bp.obterTexto(By.id("android:id/message"));
	}
	
	public void negarConfirm() {
		bp.clicar(By.id("android:id/button1"));
	}
	
	public String validarNegado() {
		return bp.obterTexto(By.id("android:id/message"));
	}
	
	public void sairConfirm() {
		bp.clicar(By.id("android:id/button1"));
	}
}
