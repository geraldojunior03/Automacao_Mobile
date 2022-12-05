package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class swipePages {

	BasePage bp = new BasePage();
	
	public void entrarSwipe() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Swipe']"));
	}
	
	public String validarMensagem1() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Mova a tela para']"));
	}
	
	public String validarMensagem2() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='E veja se']"));
	}
	
	public String validarMensagem3() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Chegar até o fim!']"));
	}
	
	public void avancarTela() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='›']"));
	}
}
