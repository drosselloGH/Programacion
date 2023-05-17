package parte3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//hay una interfaz para cada tipo de evento
public class ManejadorClics implements ActionListener {
	
	@Override
	//cuando haga clic en el boton , se ejecutara lo que haya aqui dentro
	public void actionPerformed(ActionEvent e) {
		System.out.println("Llamando...");
		
	}

	
	
}
