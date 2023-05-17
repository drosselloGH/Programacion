//4.- Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una de ellas el
//nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que después se muestren
//todos los valores mediante un bucle for.

package hoja1;

public class Ejer04 {

	public static void main(String[] args) {

		String[] companyeros = new String[4];
		
		companyeros[0] = "Álvaro";
		companyeros[1] = "Aaron";
		companyeros[2] = "Mihai";
		companyeros[3] = "Álvaro";
		
		for (int i = 0; i < companyeros.length; i++) {
			System.out.println(companyeros[i]);
		}

	}

}
