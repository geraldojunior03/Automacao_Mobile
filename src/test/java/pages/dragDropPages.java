package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class dragDropPages {

	BasePage bp = new BasePage();
	
	public void entrarDragDrop() {
		bp.clicar(By.xpath("//android.widget.TextView[@text='Drag and drop']"));
	}
	
	public void scroll() {
		bp.scrollDown();
		bp.scrollDown();
	}
	
	public void arrastarCaixa() {
		bp.dragDrop(By.xpath("//android.widget.TextView[@text='Esta']"), By.xpath("//android.widget.TextView[@text='qualquer local desejado.']"));
	}
	
	public void validarDrag() {
		bp.elementoExiste(By.xpath("//android.view.ViewGroup[@index='5']//android.widget.TextView[@text='Esta']"));
	}
}
