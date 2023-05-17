
public class Ejemplo16 {

	public static void main(String[] args) {
		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };
		
		int posMin;
		String aux0, aux1;
		
		for (int i = 0; i < calificaciones.length -1; i++) {
			posMin = i;
			for (int j = i+1; j < calificaciones.length; j++) {
				if(Double.parseDouble(calificaciones[j][1]) < Double.parseDouble(calificaciones[posMin][1])){
					posMin = j;
				}
			}
			
			aux0 = calificaciones[i][0];
			aux1 = calificaciones[i][1];
			
			calificaciones[i][0] = calificaciones[posMin][0];
			calificaciones[i][1] = calificaciones[posMin][1];
			
			calificaciones[posMin][0] = aux0;
			calificaciones[posMin][1] = aux1;
			
		}
		
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println(calificaciones[i][0]+"\t"+calificaciones[i][1]);
		}

	}

}
