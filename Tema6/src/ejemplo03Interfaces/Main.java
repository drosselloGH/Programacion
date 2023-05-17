package ejemplo03Interfaces;

public class Main {

	public static void main(String[] args) {
		
//		Figura2D figura = new Circulo(10, 10, 5);
//		System.out.println(figura.area());
//		
//		figura = new Rectangulo(20, 20, 100, 50, "rojo");
//		System.out.println(figura.area());
		
		//creamos una varible de tipo Figura2D que almacence
		//un objeto Circulo
		
		Figura2D fig = new Circulo(0, 0, "rojo", 10);
		Figura2D fig2 = new Rectangulo(5, 5, 10, 5, "Verde");
		
		System.out.println(area(fig));
		System.out.println(area(fig2));
		
	}
	
	public static double area(Figura2D fig) {
		return fig.area();
	}
	
}
