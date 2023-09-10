package Tema8;

public class Main {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Dani", 21, 173, 2000);

		Persona p = emp1;

		// se ejecuta la version del objeto referenciado, debido al @Override
		p.mostrar();

		System.out.println(p.estatura);

		Persona persona = emp1;

		//Esto ya incluye por defecto el metodo toString()
		System.out.println(persona);
		
		Persona per = new Persona("Dani", 21, 173);
		
		System.out.println(persona.equals(per));
		
		String saludo = "hola";
		
		//vemos a que clase u objeto pertenece 
		System.out.println(per.getClass());
		
	}

}
