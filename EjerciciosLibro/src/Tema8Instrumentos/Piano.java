package Tema8Instrumentos;

import java.util.Iterator;

public class Piano extends Instrumento {

	public Piano() {
		// constructor superclase
		super();
	}

	@Override
	public void interpretar() {
		// TODO Auto-generated method stub
		for (Nota n : melodia) {
			switch (n) {
			case DO: {
				System.out.println("do");
				break;
			}
			case RE: {
				System.out.println("re");
				break;
			}
			case MI: {
				System.out.println("mi");
				break;
			}
			case FA: {
				System.out.println("fa");
				break;
			}
			case SOL: {
				System.out.println("sol");
				break;
			}
			case LA: {
				System.out.println("la");
				break;
			}
			case SI: {
				System.out.println("si");
				break;
			}
			}
			System.out.println("");
		}

	}

}
