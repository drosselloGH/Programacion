package Tema7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista {

	int lista[];

	public Lista() {
		lista = new int[0];
	}

	public int numElementos() {
		return lista.length;
	}

	public void insertarFin(int num) {
		// hacemos la tabla mas grande
		lista = Arrays.copyOf(lista, lista.length + 1);
		lista[lista.length - 1] = num;
	}

	public void insertarInicio(int num) {
		lista = Arrays.copyOf(lista, lista.length + 1);
		// copiamos de la tabla lista, desde la posicion 0 a la tabla lista a la
		// posicion 1, todos los elementos
		System.arraycopy(lista, 0, lista, 1, lista.length - 1);
		lista[0] = num;
	}

	public void insertar(int num, int posicion) {
		if (posicion >= lista.length) {
			System.out.println("No se puede insertar en esa posicion");
		} else {
			// añadimos un elemento a la lista
			lista = Arrays.copyOf(lista, lista.length + 1);
			// copiamos los elementos que deberian ir tras la posicion indicada en la
			// posicion indicada +1
			System.arraycopy(lista, 0, lista, posicion + 1, lista.length - posicion - 1);
			lista[posicion] = num;
		}
	}

	public void insertarFin(Lista otraLista) {
		// donde se añadirá la nueva lista
		int tamIni = lista.length;
		lista = Arrays.copyOf(lista, tamIni + otraLista.lista.length);
		System.arraycopy(otraLista.lista, 0, lista, tamIni, otraLista.lista.length);
	}

	//lleva a cabo una eliminacion ordenada, pero de otra forma
	public Integer eliminar(int indice) {
		Integer eliminado = null;

		if (indice >= 0 && indice < lista.length) {
			eliminado = lista[indice];
			// copiamos todos los datos desde el numero siguiente al indice indicado. Y los
			// ponemos en las posiciones anteriores
			for (int i = indice + 1; i < lista.length; i++) {
				lista[i - 1] = lista[i];
			}
			// hacemos la lista con un indice menos
			lista = Arrays.copyOf(lista, lista.length - 1);
		}

		return eliminado;

	}

//	public int eliminar(int id) {
//		
//		int num = 0;
//		
//		if(id < 0 || id >= lista.length) {
//			System.out.println("No existe esa posicion");
//		} else {
//			num = lista[id];
//			//que tenga el valor del ultimo dato
//			lista[id] = lista[lista.length -1];
//			lista = Arrays.copyOf(lista, lista.length -1);
//		}
//		
//		return num;
//	}

	public int obtenerNumero(int pos) {
		if (pos >= lista.length) {
			System.out.println("Esa posicion no existe");
			return -1;
		} else {
			return lista[pos];
		}
	}

	public int obtenerIndice(Integer claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < lista.length && indice == -1; i++) {
			if (lista[i] == claveBusqueda) {
				indice = i;
			}
		}

		return indice;
	}

	public void mostrar() {
		System.out.println("Datos de la lista: ");
		System.out.println(Arrays.toString(lista));
	}

	static Lista concatena(Lista l1, Lista l2) {
		Lista l3 = new Lista();

		l3.insertarFin(l1);
		l3.insertarFin(l2);

		return l3;
	}

}
