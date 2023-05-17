//La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a lo largo de las 24
//horas de un día. Crea un programa capaz de recorrer este array e indicar cuáles han sido las
//humedades máxima y mínima del día, y a qué horas se han producido.

package hoja2;

public class Ejer08 {

	public static void main(String[] args) {
		int humedad[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };

		// establecemos las horas del dia con menos y mas humedad
		int posMin = 0, posMax = 0;

		for (int i = 1; i < humedad.length; i++) {
			if (humedad[i] > humedad[posMax]) {
				posMax = i;
			} else if (humedad[i] < humedad[posMin]) {
				posMin = i;
			}
			
		}

		System.out.println("La hora con menos humedad ha sido a las " + posMin + ", con una humedad de " + humedad[posMin]+"%");
		System.out.println("La hora con más humedad ha sido a las " + posMax + ", con una humedad de " + humedad[posMax]+"%");

	}

}
