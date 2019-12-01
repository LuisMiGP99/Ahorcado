package dad.javafx.ahorcado.view;

import dad.javafx.ahorcado.controller.PartidaController;
import javafx.scene.control.TabPane;

public class GeneralView extends TabPane {
	
	PartidaController controller1 = new PartidaController();
	
	public GeneralView() {
		super();
		setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		this.getTabs().addAll(controller1.getView());
		}
}
