package cadenas;

public class Cadenas4 {

	public static void main(String[] args) {

		double pulgadasTV = 15.6;

		// String pulgadas = "" + pulgadasTV;

		String pulgadas = String.valueOf(pulgadasTV);

		System.out.println("El tamaño de la tele es de " + pulgadas + " pulgadas");

		// ejemplo con el metodo split()

		String datosCliente = "Salas Díaz,Ana,40,asalas@gmail.com";
		String[] datosSeparados = datosCliente.split(",");
		System.out.println("Datos del cliente");
		System.out.println("==========================");
		System.out.println("Apellidos: " + datosSeparados[0]);
		System.out.println("Nombre: " + datosSeparados[1]);
		System.out.println("Edad: " + datosSeparados[2]);
		System.out.println("Email: " + datosSeparados[3]);

		// ejemplo con el metodo split()
		String frase = "Bien hecho es mejor que bien dicho";
		String[] palabras = frase.split(" ");
		System.out.println("Frase descompuesta en palabras sueltas:");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

	}

}
