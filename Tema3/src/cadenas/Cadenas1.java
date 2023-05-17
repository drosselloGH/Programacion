package cadenas;

public class Cadenas1 {

	public static void main(String[] args) {

		/* ejempplo1 .length() */
		String refran = "A quien madruga Dios le ayuda";

		int longitud = refran.length();
		System.out.println("Este refrán tiene " + longitud + " letras (contando espacios).");

		/* ejemplo2 charAt */
		String frase = "Mi carro me lo robaron";
		// mostramos el caracter en la 3ra posicion
		System.out.println("Caracter en la posición 3: " + frase.charAt(3));

		// mostrar todos los caracteres de una palabra
		String palabra = "Espacial";
		for (int i = 0; i < palabra.length(); i++) {
			System.out.print(palabra.charAt(i) + "\t");
		}
		System.out.println();

		/* ejemplo3 .replace */
		String dicho = "El perro promedio es mejor persona que la persona promedio.";
		String nuevoDicho = dicho.replace("perro", "gato");
		System.out.println(nuevoDicho);
		System.out.println(dicho);

	}

}
