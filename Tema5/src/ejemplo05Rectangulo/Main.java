package ejemplo05Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rect = new Rectangulo();
		
		rect.x = 10;
		rect.y = 15;
		rect.base = 30;
		rect.altura = 20;
		rect.color = "Azul";
		
		rect.mostrar();

		//movemos el rectangulo
		rect.desplazar(10, 30);
		System.out.println();
		rect.mostrar();
		
		System.out.println("Area = "+rect.area());
		
		System.out.println("Perimetro = "+rect.perimetro());
		
		//nos inventamos un punto y vemos si está dentro del rectangulo
		System.out.println("Está dentro? "+rect.estaDentro(25, 30));
	}

}
