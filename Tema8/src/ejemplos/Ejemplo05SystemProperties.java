package ejemplos;

public class Ejemplo05SystemProperties {

	public static void main(String[] args) {
		
		//mostramos la ruta de la carpeta personal del usuario que ejecuta el programa
		System.out.println("La ruta de la carpeta personal es: "+System.getProperty("user.home"));
		
		//mostramos la ruta de la carpeta desde donde se ejecuta este programa
		System.out.println("La ruta desde la que se ejecuta el programa es: "+System.getProperty("user.dir"));
		
	}
	
}
