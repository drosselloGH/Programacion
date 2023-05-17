package ejemplo05Rectangulo2;

import ejemplo06Banco.CuentaBancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rect = new Rectangulo(10, 15, 30, 20, "azul");
		
		//codigo que hemos borrado porque usamos un constructor en su lugar
//		rect.x = 10;
//		rect.y = 15;
//		rect.base = 30;
//		rect.altura = 20;
//		rect.color = "Azul";
		
		rect.mostrar();

		//movemos el rectangulo
		rect.desplazar(10, 30);
		System.out.println();
		rect.mostrar();
		
		System.out.println("Area = "+rect.area());
		
		System.out.println("Perimetro = "+rect.perimetro());
		
		//nos inventamos un punto y vemos si está dentro del rectangulo
		System.out.println("Está dentro? "+rect.estaDentro(25, 30));
		
		Rectangulo rect2 = new Rectangulo(100, 50, "amarillo");
		rect2.mostrar();
		
		//este usa el constructor implicito
		Rectangulo rect3 = new Rectangulo();
	}

}
