package Tema7;

public class MainSintonizador {

	public static void main(String[] args) {
		
		Sintonizador sint1 = new Sintonizador();
		
		sint1.display();
		
		for(int i = 0; i <= 80; i++) {
			sint1.up();
			sint1.display();
		}
		
	}
	
}
