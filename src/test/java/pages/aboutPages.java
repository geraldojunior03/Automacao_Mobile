package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class aboutPages {

	BasePage bp = new BasePage();
	
	// ENTRAR EM ABOUT
	
	public void entrarAbout() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='About...']"));
	}
	
	public void esperaEntrarAbout(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	public String validarMensagem() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Testes funcionais de aplicações Android com Appium']"));
	}
}
