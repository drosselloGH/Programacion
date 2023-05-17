import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Comparable<Cliente> {

	//ArrayList
	/*mas rapida para operaciones que supongan recorrer la lista para leer o modificar elementos*/
	List<Cliente> lista = new ArrayList<>();
	
	String dni;
	String nombre;
	LocalDate fechaNacimiento;
	
	Cliente (String dni, String nombre, String fechaNacimiento){
		this.dni = dni;
		this.nombre = nombre;
		DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
	}
	
	int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(((Cliente) obj).dni);
	}

	@Override
	public int compareTo(Cliente otro) {
		return dni.compareTo(otro.dni);
	}
	
	@Override
	public String toString() {
		return "DNI: "+dni+" Nombre: "+nombre+" Edad: "+edad()+"\n";
	}
	
}
