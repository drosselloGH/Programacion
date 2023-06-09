package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Ejemplo08JFileChosser {

	public static void main(String[] args) {

		// creamos un JFileChooser para que el usuario pueda elegir qué archivo va a
		// abrir

		JFileChooser elegirArchivo = new JFileChooser();

		// mostramos el FileChooser al usuario
		int eleccion = elegirArchivo.showOpenDialog(null);

		// si se ha pulsado CANCELAR, o cerrar ventana, el programa acaba
		if (eleccion == JFileChooser.CANCEL_OPTION) {
			System.out.println("Has cancelado");
			return;
		}
		// sino, obtenemos el archivo con su ruta completa desde el FileChooser

		// sabemos qué archivo se ha elegido
		File archivo = elegirArchivo.getSelectedFile();
		System.out.println("Has elegido el archivo: " + archivo.toString());

		// lo abrimos y lo mostramos al usuario
		try {
			FileReader lectorArchivo = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(lectorArchivo);
			
			String linea = buffer.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Ha habido un error al leer el archivo");
		}

	}
}
