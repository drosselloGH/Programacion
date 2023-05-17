package ejemplo04Circulos;

public class Circulo {

	private int x;
	private int y;
	private String color;
	private int radio;
	
	public Circulo(){
		
	}
	
	public Circulo(int x, int y, String color, int radio){
		this.x = x;
		this.y = y;
		this.color = color;
		this.radio = radio;
	}
	
	public Circulo(int x, int y, int radio){
		this(x, y,  "NEGRO", radio);
	}
	
	public void mostrar() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("Color = "+color);
		System.out.println("Radio = "+radio);
	}
	
	public void desplazar(int dx, int dy) {
		x = dx + x;
		y = dy + y;
	}
	
	//metodo que devuelve el area del circulo
	public double area() {
		return  Math.PI * Math.pow(radio, 2);
	}
	
	//metodo que devuelve el perimetro del circulo
	public double perimetro() {
		return (2*Math.PI) * radio;
	}
}
