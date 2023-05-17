package ejemplo03Puntos;

public class Punto {

	private int x;
	private int y;
	private String color;
	
	public Punto(){
		
	}
	
	public Punto(int x, int y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public Punto(int x, int y){
		this(x, y, "NEGRO");
	}
	
	public void mostrar() {
		System.out.println("Color: "+color);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	public void desplazarX(int dx) {
		x = dx + x;
	}
	
	public void desplazarY(int dy) {
		y = dy + y;
	}
	
	public void desplazarXY(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
