package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class abasPages {

	BasePage bp = new BasePage();
	
	public void entrarAbas() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Abas']"));
	}
	
	public String validarAba1() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 1']"));
	}
	
	public void entrarAba2() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Aba 2']"));
	}
	
	public String validarAba2() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 2']"));
	}
}
