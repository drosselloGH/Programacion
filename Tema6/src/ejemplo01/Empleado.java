package ejemplo01;

public class Empleado extends Persona {

	private int categoriaEmpleado;

	public Empleado(String nombre, String apellidos, String dni, int categoriaEmpleado) {
		super(nombre, apellidos, dni);
		this.categoriaEmpleado = categoriaEmpleado;
	}

	public void setCategoriaEmpleado(int categoriaEmpleado) {
		this.categoriaEmpleado = categoriaEmpleado;
	}

	public int getCategoriaEmpleado() {
		return categoriaEmpleado;
	}

	@Override
	// este metodo sobreescribe el metodo mostrar() de la clase Persona
	public void mostrar() {
		// llamamos al metodo mostrar() de la clase padre (superclase)
		super.mostrar();
		System.out.println("Categoria " + categoriaEmpleado);
	}

	@Override
	// cliente esta obligada a implementar un metodo darDeAlta(),
	// porque la clase padre, Persona, tiene ese metodo abstracto
	public void darDeAlta() {

	}

	// creamos un metodo para comparar objetos
	@Override
	public boolean equals(Object obj) {

		// si el parametro pasado tiene la misma posicion de memoria
		if (obj == this) {
			return true;
		}
		// si le pasa un parametro null
		if (obj == null) {
			return false;
		}

		// si el parametro pasado es de la clase Empleado
		if (obj instanceof Empleado) {
			Empleado emp = (Empleado) obj;

			if (getNombre().equals(emp.getNombre()) && getApellidos().equals(emp.getApellidos())
					&& getDni().equals(emp.getDni()) && categoriaEmpleado == emp.categoriaEmpleado) {
				return true;
			}

		}

		return false;

	}

}
