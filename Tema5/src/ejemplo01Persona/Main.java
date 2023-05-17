package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		// creamos un objeto "per" de la clase "persona"
		Persona per = new Persona("Federico", "López Sanchez", 1980, "22100100T");

		// inicializamos los atributos del objeto per
		//codigo que hemos quitado por el constructor
//		per.nombre = "Federico";
//		per.apellidos = "Lopez Sanchez";
//		per.anyoNacimiento = 1980;
//		per.dni = "22100100T";

		// accedemos y mostramos los atributos del objeto per
		System.out.println("Datos de per");
		System.out.println("Nombre: " + per.getNombre());

		System.out.println("Apellidos:" + per.getApellidos());
		System.out.println("Año nacimiento: " + per.getAnyoNacimiento());
		System.out.println("DNI: " + per.getDni());

		// creamos otra variable persona
		Persona per2 = new Persona("Francisco", "Garcia", 2000);
		//probamos el metodo mostrar() de la clase Persona
		System.out.println("\nDatos de per2");
		per2.mostrar();
		
		Persona per3 = new Persona("Pepe", "Garcia");
		System.out.println("\nDatos de per3");
		per3.mostrar();
		System.out.println();
		per3.setNombre("Mario");
		per3.setApellidos("Fernández Sánchez");
		per3.setAnyoNacimiento(1970);
		per3.setDni("23178265J");
		per3.mostrar();
	}

}
