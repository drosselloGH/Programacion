//3.- Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve)
//planetas del Sistema Solar. Haz que después se muestren todos los valores mediante un bucle for

package hoja1;

public class Ejer03 {

	public static void main(String[] args) {

		String[] planetas = { "La Tierra", "Marte", "Mercurio", "Venus", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		String[] densidades = { "5.51 g/cm3", "3.93 g/cm3", "16.6 g/cm3", "5.24 g/cm3", "1.33 g/cm3", "0.687 g/cm3",
				"1.27 g/cm3", "1.64 g/cm3", "1.88 g/cm3" };

		for (int i = 0; i < planetas.length; i++) {
			System.out.println("El planeta " + planetas[i] + " tiene una densidad de " + densidades[i]);
		}

	}

}
