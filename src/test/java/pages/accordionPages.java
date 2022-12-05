package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class accordionPages {

	BasePage bp = new BasePage();
	
	public void entrarAccordion() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Accordion']"));
	}
	
	// ESCOLHA DE OPÇÕES
	
	public void escolherOP1() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 1']"));
	}
	
	public void escolherOP2() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 2']"));
	}
	
	public void escolherOP3() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 3']"));
	}
	
	public void escolherOP4() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 4']"));
	}
	
	public void escolherOP5() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 5']"));
	}
	
	public void escolherOP6() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Opção 6']"));
	}
	
	// VALIDANDO MENSAGENS
	
	public String validarMensagem1() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 1']"));
	}
	
	public String validarMensagem2() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 2']"));
	}
	
	public String validarMensagem3() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 3. Que pode, inclusive ter mais que uma linha']"));
	}
	
	public String validarMensagem4() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 4']"));
	}
	
	public String validarMensagem5() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 5']"));
	}
	
	public String validarMensagem6() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 6']"));
	}
}
