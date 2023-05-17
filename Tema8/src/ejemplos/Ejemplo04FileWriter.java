package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//programa que lea tareas que el usuario quiere almacenar y las guarde en el disco
public class Ejemplo04FileWriter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//para evitar problemas, hacemos que la ruta del archivo sea una constante
		//hay que concatenarlo con el nombre del archivo, pues el "getProperty" no se puede modificar
		//el nombre del archivo donde guardaremos las tareas se llamará "tareas" y estará en la carpeta personal del usuario
		final String NOMBRE_ARCHIVO = System.getProperty("user.home")+"/tareas";

		// pedimos que escriba una tarea
		System.out.println("Escribe tu tarea: ");
		String tarea = sc.nextLine();
		
		//guardamos la tarea en un archivo en el disco
		guardarTarea(tarea, NOMBRE_ARCHIVO);
		
		//mostrar al usuario todas las tareas que hay en el archivo
		mostrarTareas(NOMBRE_ARCHIVO);

	}

	private static void guardarTarea(String tarea, String nombreArchivo) {
		// abrimos el archivo para escritura
		try {
			// al escribir en este archivo, si no existe, se crea automaticamente
			// si el archivo ya tiene contenido, lo reescribe
			// el parametro "true" indica que no se borrará el archivo
			FileWriter archivo = new FileWriter(nombreArchivo, true);

			// creamos un objeto bufferWriter para manejar el archivo de forma mas eficiente
			BufferedWriter buffer = new BufferedWriter(archivo);

			// guardamos lo que quiere escribir el usuario
			// dejamos un espacio para que se separen las tareas por un salto de línea
			buffer.write(tarea + "\n");

			// indicamos al usuario que se ha guardado su tarea
			System.out.println("Se ha guardado su tarea");

			// cerramos el archivo. Si no se hace, los datos pueden no guardarse: los datos
			// pueden no pasar del buffer de memoria al dico
			buffer.close();

		} catch (IOException e) {
			System.out.println("Se ha producido un error escribiendo en el archivo");
		}
	}
	
	private static void mostrarTareas(String nombreArchivo) {
		try {
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);
			
			String linea = buffer.readLine();
			
			//banner
			System.out.println("\n===============");
			System.out.println("     TAREAS    ");
			System.out.println("===============");
			
			int cantTareas = 0;
			
			while(linea != null) {
				cantTareas++;
				System.out.println("\t- "+cantTareas+" "+linea);
				linea = buffer.readLine();
			}
			System.out.println("\n\tTienes "+cantTareas+ " tareas por hacer");
			buffer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Se ha producido un error al leer el archivo");
		}
	}

}
