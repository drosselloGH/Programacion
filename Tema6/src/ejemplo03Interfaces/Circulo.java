package ejemplo03Interfaces;

public class Circulo implements Figura2D {

	private int x;
	private int y;
	private String color;
	private int radio;

	public Circulo() {

	}

	public Circulo(int x, int y, String color, int radio) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.radio = radio;
	}

	public Circulo(int x, int y, int radio) {
		this(x, y, "NEGRO", radio);
	}

	public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);
		System.out.println("Radio = " + radio);
	}

	@Override
	public void desplazar(int dx, int dy) {
		x = dx + x;
		y = dy + y;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public Posicion posicion() {
		Posicion pos = new Posicion(x, y);
		return pos;
		//otra opcion
//		return new Posicion(x, y);
	}

}
