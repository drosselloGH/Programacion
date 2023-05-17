package ejemplos;

import java.io.File;

import javax.swing.JFileChooser;

public class Ejemplo09FileChooser {

	public Ejemplo09FileChooser() {
		
		JFileChooser elegirArchivo = new JFileChooser();
		
		//se muestra en el centro
		int eleccion = elegirArchivo.showSaveDialog(null);
		
		if(eleccion == JFileChooser.CANCEL_OPTION) {
			System.out.println("Has cancelado");
			//termina el programa inmediatamente.
			//hubiera sido lo mismo si hubieramos escrito "return"
			System.exit(0);
		}
		
		File archivo = elegirArchivo.getSelectedFile();
		System.out.println("Has elegido guardar en el archivo: "+archivo.toString());
		
		
		
	}

}
