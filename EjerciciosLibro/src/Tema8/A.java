package Tema8;

//al tener un metodo abstracto, la clase debe ser abstracta
//sus subclases heredaran "metodo1", pero cada una tiene su propia implementacion de "metodo2"
abstract class A {
	int x = 1;

	void metodo1() {

	}

	// fuerza a que sus subclases deban implementar este metodo
	abstract void metodo2();
}
