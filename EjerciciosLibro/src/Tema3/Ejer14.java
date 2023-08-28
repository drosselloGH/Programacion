package Tema3;

public class Ejer14 {

	public static void main(String[] args) {
		
		mostrarPresentacion();
		
		tablasMultiplicar();
		
	}
	
	private static void mostrarPresentacion() {
		System.out.println("***************************");
		System.out.println("** TABLAS DE MULTIPLICAR **");
		System.out.println("***************************");
	}
	
	private static void tablasMultiplicar() {
		for(int i = 0; i <= 10; i ++) {
			System.out.println("-- Tabla del "+i+ " --");
			for(int j = 0; j <= 10; j++) {
				System.out.println("\t"+i +" x "+j + " = "+(i * j));
			}
			
			System.out.println("");
		}
	}
	
}
