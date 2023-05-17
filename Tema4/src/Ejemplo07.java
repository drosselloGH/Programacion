import java.util.Arrays;

//paso de parametros por valor y por referencia
public class Ejemplo07 {

	public static void main(String[] args) {

		int mes = 1;
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		
		//mostramos los valores de mes y meses, al principio
		System.out.println("La variable mes vale \n" + mes);
		System.out.println("La variable meses vale \n" + Arrays.toString(meses));
		
		//llamamos al metodo modificado
		modificar(mes, meses);
		
		//mostramos los valores de mes y meses tras ejecutar el metodo
		System.out.println("\n(Despues de ejecutar el metodo)\n");
		System.out.println("La variable mes vale \n" + mes);
		System.out.println("La variable meses vale \n" + Arrays.toString(meses));

	}

	static void modificar(int mes, String[] nombres) {

		mes = 2;
		nombres[0] = "Tomate";

	}

}
