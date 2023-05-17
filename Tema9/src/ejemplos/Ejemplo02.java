package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * 
 * La clase Ejemplo02 muestra una ventana que nos perimtirá elegir y leer 
 * archivos de texto plano
 * 
 * <p>
 * Esta clase utiliza los siguientes paquetes para mostrar una ventana y acceder al contenido de un archivo
 * 
 * <ul>
 * <li>Swing</li>
 * <li>java.io</li>
 * </ul>
 * 
 * La otra clase de este proyecto es {@link Ejemplo01}
 * 
 * @author Daniel Rosselló
 * @version 1.0, may 2023
 *
 */

public class Ejemplo02 {

	/**
	 * Arranca la aplicación dejando elegir un archivo al usuario
	 * 
	 * @param args		array con los argumentos escritos en la terminal al invocar el programa
	 */
	
	public static void main(String[] args) {

		String rutaArchivo = seleccionarArchivo();
		if (rutaArchivo == null) {
			return;
		}

		String palabra = pedirPalabra();

		System.out.println("La palabra: " + palabra + " ha aparecido " + leerArchivo(rutaArchivo, palabra) + " veces.");

	}

	/**
	 * Ventana que permite elegir un archivo de texto plano a elección del usuario
	 * 
	 * @return		devuelve el nombre del archivo seleccionado
	 */
	private static String seleccionarArchivo() {
		JFileChooser archivoSeleccionado = new JFileChooser();
		int eleccion = archivoSeleccionado.showOpenDialog(null);
		if (eleccion == JFileChooser.CANCEL_OPTION) {
			System.out.println("Ningun archivo seleccionado");
			return null;
		}
		String archivo = "" + archivoSeleccionado.getSelectedFile();
		return archivo;
	}

	/**
	 * Pide una palabra al usuario
	 * 
	 * @return		devuelve la palabra introducida para luego usar ésta en otra función
	 */
	private static String pedirPalabra() {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una palabra: ");
		String palabra = entrada.nextLine();

		return palabra;
	}

	// Leer archivo
	private static int leerArchivo(String rutaArchivo, String palabra) {

		int numPalabras = 0;

		try {
			FileReader archivo = new FileReader(rutaArchivo);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();

			while (linea != null) {
				numPalabras = numPalabras + contadorPalabras(linea, palabra);
				linea = buffer.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo.");
		}
		return numPalabras;
	}

	/**
	 * Cuenta cuántas veces se repite una palabra en una frase
	 * 
	 * @param frase 	cadena de texto donde se encuentra la palabra
	 * @param palabra	palabra a buscar
	 * @return			devuelve cuantas veces se repite esa palabra en la frase
	 */
	private static int contadorPalabras(String frase, String palabra) {

		int numPalabras = 0;
		int posicion = frase.indexOf(palabra);

		if (posicion == -1) {
			return 0;
		}

		numPalabras++;
		posicion++;
		while (frase.indexOf(palabra, posicion) != -1) {
			numPalabras++;
			posicion = frase.indexOf(palabra, posicion) + 1;
		}

		return numPalabras;

	}
}
