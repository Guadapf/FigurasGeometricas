package ar.edu.unlam.pb2.figuras;

import java.util.LinkedList;

public class Plano {
	
	private LinkedList<Figuras> figuras = new LinkedList<Figuras>();
	
	public Boolean agregarFigura(Figuras figura) {
		return figuras.add(figura);
	}
	
	public Boolean moverFigura(Figuras figura, Punto x, Punto y) {
		
		return true;
	}
	
}
