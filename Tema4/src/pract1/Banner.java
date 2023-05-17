package pract1;

import java.util.Arrays;
import java.util.Scanner;

public class Banner {

	//en este metodo, pediremos los datos, y mostraremos el resultado
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mensaje: ");
		String mensaje = sc.nextLine();
		System.out.print("Ancho del banner: ");
		int ancho = sc.nextInt();

		//si el mensaje es más largo que el ancho, al ancho aumentará
		if(mensaje.length() > ancho) {
			System.out.println("El ancho del banner es insuficiente. "
					+ "Se aplicarça un ancho mínimo de "+(mensaje.length()+4));
			//hacemos que el ancho mida 2 mas que el mensaje (sino, el mensaje no podria
			//estar dentro del banner), y luego hacemos que sea 2 mas grande (para poner
			//minimo un espacio por cada costado)
			ancho = mensaje.length() + 4;
		}
		System.out.println();
		mostrarBanner(mensaje, ancho);

	}

	// este método creará las barras de "#"
	static void mostrarBarra(int ancho) {
		// creamos x "#" como numero indicado como ancho del banner
		for (int i = 0; i < ancho; i++) {
			System.out.print("#");
		}

	}

	//este método crea la barra intermedia con el texto
	static void mostrarTexto(String mensaje, int ancho) {
		//cantidad de espacios en blanco que habrá en la línea
		int espacioBlanco = ancho - mensaje.length();
		
		//por motivo que desconozco, hay que hacer este algoritmo:
		//(espacioBlanco/2)-1 para que se ponga de forma correcta
		
		//mostramos el primer borde del banner
		System.out.print("#");
		//mostramos la mitad -1 de los espacios en blanco que hay
		for (int i = 0; i < (espacioBlanco/2)-1; i++) {
			System.out.print(" ");
		}
		//mostramos el mensaje
		System.out.println(mensaje);
		
		//mostramos la mitad-1 de los espacios en blanco que hay
		for (int i = 0; i < (espacioBlanco/2)-1; i++) {
			System.out.print(" ");
		}
		//mostramos el último borde del banner
		System.out.print("#");
		
	}
	
	//este método muestra todas las lineas creadas,
	//las del ancho y la del mensaje
	static void mostrarBanner(String mensaje, int ancho) {
		mostrarBarra(ancho);
		System.out.println();
		mostrarTexto(mensaje, ancho);
		System.out.println();
		mostrarBarra(ancho);
	}

}
