import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClas() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	//before hace que un fragmento de codigo se ejecute antes
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}

	@After
	public void after() {
		System.out.println("after()");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		Calculadora calc = new Calculadora();
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}

	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		Calculadora calc = new Calculadora();
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void tesDiv() {
		calc.div(5, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		calc.div(5,  0);
	}
	
	@Test(timeout = 100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
	

}
