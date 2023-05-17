package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final static double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;

	}

	public double getArea() {
		return 2 * PI * radio * (radio + altura);
	}

	public double getVolumen() {
		return PI * Math.pow(radio, 2) * altura;
	}

	public String toString() {
		String respuesta = "Altura: " + altura + " Radio: " + radio;
		return respuesta;
	}

}
