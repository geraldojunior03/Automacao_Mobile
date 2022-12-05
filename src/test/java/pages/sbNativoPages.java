package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class sbNativoPages {

	BasePage bp = new BasePage();
	
	public void entrarNativo() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='SeuBarriga Nativo']"));
	}
	
	public void realizarLogin() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='ENTRAR']"));
	}
	
	public void aguardar(int tempo) throws InterruptedException {
		bp.esperar(tempo);
	}
	
	public String validarMensagem() {
		return bp.obterTexto(By.xpath("//android.widget.TextView[@text='Conta para movimentacoes']"));
	}
}
