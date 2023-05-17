
public class Ejemplo01 {

	public static void main(String[] args) {

		String[] ciudades = { "Son Ferrer", "Palma", "Roma", "Valencia" };

		System.out.println("****CIUDADES****");
		System.out.println("Primera ciudad " + ciudades[0]);
		System.out.println("Segunda ciudad " + ciudades[1]);
		System.out.println("Tercera ciudad " + ciudades[2]);
		System.out.println("Cuarta ciudad " + ciudades[3]);

		String[] mascotas = { "Perro", "Gato", "Tortuga", "Ratón", "Cobaya", "Ardilla" };

		System.out.println("****MASCOTAS****");
		System.out.println("Mascotas: " + mascotas[0]);
		System.out.println("Mascotas: " + mascotas[1]);
		System.out.println("Mascotas: " + mascotas[2]);
		System.out.println("Mascotas: " + mascotas[3]);
		System.out.println("Mascotas: " + mascotas[4]);
		System.out.println("Mascotas: " + mascotas[5]);

		double[] estaturas = { 1.33, 1.88, 1.68, 2.10 };

		System.out.println("****ESTATURAS****");
		for (int i = 0; i < 4; i++) {
			System.out.println("Estatura: " + estaturas[i]);
		}

	}

}
