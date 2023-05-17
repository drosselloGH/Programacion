public class Calculadora {

	// devolverá el reultado anterior
	private int ans;

	public Calculadora() {
		ans = 0;
	}

	//metodo de una suma
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	//metodo de una resta
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No puedes dividir por cero");
		}
		ans = a / b;
		return ans;
	}
	
	//añadir el valor de "v" a ans
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	//quitarle el valor de "v" a ans
	public int sub (int v) {
		ans -= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans = 0;
	}
	
	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
