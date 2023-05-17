//2.- Crea un array de Strings llamado meses cuyos valores sean los nombres de los doce meses del
//año. Haz que después se muestren todos los valores mediante un bucle while

package hoja1;

public class Ejer02 {

	public static void main(String[] args) {

		int contador = 0;
		
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		while (contador < meses.length) {
			System.out.println(meses[contador]);
			contador++;
		}

	}

}
