package ejemplo04Circulos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//c1 es un circulo
		Circulo c1 = new Circulo(20, 10, "Rojo", 50);
//		c1.x = 20;
//		c1.y = 10;
//		c1.color = "Rojo";
//		c1.radio = 50;

		c1.mostrar();
		
		c1.desplazar(0, 0);
		
		System.out.println("Área: "+c1.area());
		
		System.out.println("Perímetro: "+c1.perimetro());
		
		Circulo c2 = new Circulo(23, -23 , 23);
		c2.mostrar();
	}

}
