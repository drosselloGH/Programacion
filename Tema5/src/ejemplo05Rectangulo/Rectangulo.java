package ejemplo05Rectangulo;

public class Rectangulo {

	private int x;
	private int y;
	private String color;
	private int base;
	private int altura;
	
	public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color: " + color);
		System.out.println("Base = " + base);
		System.out.println("Altura = " + altura);
	}

	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	// devuelve si el punto "a" y "b" estan dentro del rectangulo
	public boolean estaDentro(int a, int b) {
		int y1 = y - altura;
		int x1 = x + base;

		if ((x <= a && a <= x1) && (b <= y && b >= y1)) {
			return true;
		}
		return false;

	}

}
