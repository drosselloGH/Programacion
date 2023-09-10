package Tema7Persona;

public class main {

	public static void main(String[] args) {

		Persona per = new Persona();
		
		per.saludar();
		
		per.hoyEs(3);
		
		per.mostrar();
		
		per.setDni("45186289Y");
		
		per.mostrar();
		
		Persona per2 = new Persona("Daniel", "Rosselló", "45186289Y");
		
		System.out.println("Datos de persona 2");
		per2.mostrar();
		
	}

}
