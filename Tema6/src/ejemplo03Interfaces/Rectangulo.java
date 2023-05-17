package ejemplo03Interfaces;

public class Rectangulo implements Figura2D{

	private int x;
	private int y;
	private String color;
	private int base;
	private int altura;
	
	
	
	public Rectangulo(int x, int y, int base, int altura, String color) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color: " + color);
		System.out.println("Base = " + base);
		System.out.println("Altura = " + altura);
	}

	@Override
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
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

	@Override
	public Posicion posicion() {
		return new Posicion(x, y);
	}

}
