package clase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pruebaDatos {
	
	@Test
	public void testDivisionBien() {
		int resultado = Utilidades.division(30, 30);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDivisionMal() {
		int resultado = Utilidades.division(5, 2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testNumeros() {
		String cadena = "hola134";
		int resultado = Utilidades.extraerNumero(cadena); 
		int esperado = 134;
		assertEquals(esperado, resultado);
	}

}
