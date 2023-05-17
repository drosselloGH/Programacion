package cadenas;

public class Cadenas2 {

	public static void main(String[] args) {
		/* ejemplo4 indexOf */
		String frase = "Si tú crees que puedes, puedes. Si tú crees que no puedes,no puedes. Tanto si piensas una cosa como la otra, estás en lo cierto (Henry Ford).";
		System.out.println("La palabra crees aparece en la posición " + frase.indexOf("crees"));
		System.out.println("La palabra luz aparece en la posición " + frase.indexOf("luz"));

		// si la palabra no se encuentra, se mostrará la posicion "-1"

		// esto muestra la posicion de la palabra, empezando desde el final
		System.out.println("La palabra luz aparece en la posición " + frase.lastIndexOf("crees"));

		/* ejemplo substring */
		//primero inclusive, segundo exclusive
		System.out.println("Los caracteres desde el 3 hasta el 10 (ambos inclusive) son: " + frase.substring(3, 11));
		System.out.println("Los caracteres desde el 70 hasta el final son: " + frase.substring(70));

	}

}
