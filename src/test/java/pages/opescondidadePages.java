package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class opescondidadePages {

	BasePage bp = new BasePage();
	
	public void rolarTela() {
		bp.scrollDown();
		bp.scrollDown();
	}
	
	public void escolherOpEscondida() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção bem escondida']"));
	}
	
	public void aceitarOpEscondida() {
		bp.clicar(By.xpath("//android.widget.Button[@text='OK']"));
	}
	
	public void validarOpEscondida() {
		bp.aguardarElementoVisivel(By.xpath("//"));
	}
}
