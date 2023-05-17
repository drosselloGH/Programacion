package ejemplo01;

//es una extension de Persona, teniendo sus mismas caracteristicas, 
//asi creamos una herencia
public class Cliente extends Persona {

	private String visa;

	public Cliente(String nombre, String apellidos, String dni, String visa) {
		super(nombre, apellidos, dni);
		this.visa = visa;
	}

	// este metodo sobreescribe el metodo mostrar() de la clase Persona
	@Override
	public void mostrar() {
		// llamamos al metodo mostrar() de la clase padre (superclase)
		super.mostrar();
		System.out.println("Visa: " + visa);

	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	public String getVisa() {
		return visa;
	}

	public void darDeAlta() {

	}

	@Override
	// @Override indica que es una sobreescritura de otro objeto
	public String toString() {
		String datos = "Nombre: " + getNombre() + "\nApellidos: " + getApellidos() + "\nDNI: " + getDni() + "\nVisa "
				+ visa;
		return datos;
	}

	@Override
	public boolean equals(Object obj) {
		// si el parametro pasado tiene la misma posicion de memoria
		if (this == obj) {
			return true;
		}
		//si el parametro es nulo
		if (obj == null) {
			return false;
		}
		//si el parametro pertenece a la clase Cliente
		if (obj instanceof Cliente) {
			// convertimos el objeto a un tipo Cliente, almacenado en la variable cl
			Cliente cl = (Cliente) obj;

			if (getNombre().equals(cl.getNombre()) && getApellidos().equals(cl.getApellidos())
					&& getDni().equals(cl.getDni()) && getVisa().equals(cl.getVisa())) {
				return true;
			}

		}

		return false;

	}

}
