package ejemplo03Interfaces;

public interface Figura2D {

	//obliga a todas las clases que implementen esta interfaz a tener estos metodos
	public double area();

	public double perimetro();

	public void desplazar(int dx, int dy);

	public Posicion posicion();

}
