package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class cliquesPages {

	BasePage bp = new BasePage();
	
	public void entrarCliques() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Cliques']"));
	}
	
	public void esperar(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	// CLICAR
	
	public void cliqueLongo() {
		bp.cliqueLongo(By.xpath("//android.widget.TextView[@text='Clique Longo']"));
		
	}
	
	public void cliqueDuplo() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Clique duplo']"));
		bp.clicar(By.xpath("//android.widget.TextView[@text='Clique duplo']"));
	}
	
	public void duploLento(int tempo) throws InterruptedException {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Clique duplo lento']"));
		bp.esperar(tempo);
		bp.clicar(By.xpath("//android.widget.TextView[@text='Clique duplo lento']"));
	}
	
	public void Limpar() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Limpar']"));
	}

	// VALIDAR
	
	public String validarLongo() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Clique Longo']"));
	}
	
	public String validarDuplo() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Duplo Clique']"));
	}
	
	public String validarDuploLongo() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Duplo Clique lento']"));
	}
	
	public String validarLimpar() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='']"));
	}
}
