package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class swipeListPages {

	BasePage bp = new BasePage();
	
	public void entrarSwipeList() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Swipe List']"));
	}
	
	public void arrastarEsquerda() {
		String coordenadas = bp.coordEl("//*[@text='Opção 1']").toString();
		bp.scrollEsquerda(coordenadas);
	}
	
	public void arrastarDireita() {
		String coordenadas = bp.coordEl("//*[@text='Opção 1']").toString();
		bp.scrollDireita(coordenadas);
	}
	
	public void clicarMais() {
		bp.clicarBotaoExato(By.xpath("//android.widget.TextView[@text='(+)']"));
	}
	
	public void clicarMenos() {
		bp.clicarBotaoExato(By.xpath("//android.widget.TextView[@text='(-)']"));
	}
	
	public String validarMais(String op) {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Opção " + op + " (+)']"));
	}
	
	public String validarMenos(String op) {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Opção " + op + " (-)']"));
	}
	
	public String validarReset(String op) {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Opção " + op + "']"));
	}
}
