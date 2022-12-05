package stepsDefinition;

import functions.dragDropFunctions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class dragDropSteps {

	dragDropFunctions df = new dragDropFunctions();
	
	@Dado("que eu entre no menu drag and drop")
	public void que_eu_entre_no_menu_drag_and_drop() {
	    df.entrarDrag();
	}

	@Quando("arrasto para uma posição da lista")
	public void arrasto_para_uma_posição_da_lista() {
	    df.arrastar();
	}

	@Então("devo validar se ela ficou naquela posição")
	public void devo_validar_se_ela_ficou_naquela_posição() {
	    df.validar();
	}
}
