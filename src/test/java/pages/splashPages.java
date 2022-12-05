package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class splashPages {

	BasePage bp = new BasePage();
	
	public void entrarSplash() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Splash']"));
	}
	
	public void aguardar(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	public String validarPrimeira() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta']"));
	}
	
	public String validarSegunda() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='é']"));
	}
	
	public String validarTerceira() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='uma']"));
	}
	
	public String validarQuarta() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='tela']"));
	}
	
	public String validarQuinta() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Splash!']"));
	}
}
