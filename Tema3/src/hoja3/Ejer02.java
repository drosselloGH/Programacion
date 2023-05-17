package hoja3;

public class Ejer02 {
	public static void main(String[] args) {
		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

		double aux = 0;

		int posMin = 0, posMax = 0;
		for (int i = 0; i < cotizaciones.length; i++) {
			if(cotizaciones[i] < cotizaciones[posMin]) {
				posMin = i;
			} else if (cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;
			}
		}

		System.out.println("Mínimo: " + cotizaciones[posMin]);
		System.out.println("Máximo: " + cotizaciones[posMax]);

	}
}
