package ejemplo03Puntos;

public class Main {

	public static void main(String[] args) {

		Punto punto1 = new Punto(15, 10, "Verde");
		
//		punto1.x = 15;
//		punto1.y = 10;
//		punto1.color = "Verde";
		
		//System.out.println("El color de punto1 es "+punto1.color);
		
		punto1.mostrar();
		
		System.out.println("Desplazamos 50px a la derecha");
		punto1.desplazarX(50);
		
		punto1.mostrar();
		
		System.out.println("Desplazamos 10px hacia arriba");
		punto1.desplazarY(10);
		punto1.mostrar();
		
		System.out.println("Desplazamos 30px a la derecha y 20px hacia abajo el punto");
		punto1.desplazarXY(30, -20);
		
		punto1.mostrar();
		
		Punto punto2 = new Punto(20, 21);
		punto2.mostrar();

	}

}
