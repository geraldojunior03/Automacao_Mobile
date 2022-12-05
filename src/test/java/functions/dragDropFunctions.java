package functions;

import pages.dragDropPages;

public class dragDropFunctions {

	dragDropPages dp = new dragDropPages();
	
	public void entrarDrag() {
		dp.scroll();
		dp.entrarDragDrop();
	}
	
	public void arrastar() {
		dp.arrastarCaixa();
	}
	
	public void validar() {
		dp.validarDrag();
	}
}
