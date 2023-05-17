package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//programa que abre un archivo de texto plano y muestra todo su contenido en la terminal
public class Ejemplo02FileReader {

	public static void main(String[] args) {
		
		//abrimos el archivo
		try {
			FileReader archivo = new FileReader("ficheros/ejemplo.txt");
			
			//creamos una variable para acceder al archivo usando un buffer en memoria
			BufferedReader buffer = new BufferedReader(archivo);
			
			//puede provocar un error de tipo IO
			String linea = buffer.readLine();
			
			//si la linea reacien leida no es null
			while(linea != null) {
				//mostramos la linea
				System.out.println(linea);
				
				//leemos la siguiente linea del archivo
				linea = buffer.readLine();
				
			}
			
			System.out.println("## FIN DEL ARCHIVO ##");
			
			//cerramos el archivo
			buffer.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
			
		} catch (IOException e) {
			System.out.println("Se ha producido un error al leer el archivo");
		}
		
		
	}
	
}
