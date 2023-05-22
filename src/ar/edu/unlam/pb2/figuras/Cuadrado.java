package ar.edu.unlam.pb2.figuras;

public class Cuadrado extends Figuras{
	
	
	public Cuadrado(Punto esquinaIzq, Punto esquinaDer) {
		this.esquinaIzq = esquinaIzq;
		this.esquinaDer = esquinaDer;
	}
	
	public Double calcularArea() {
		
		Double ladoUno = this.esquinaIzq.getX() - this.esquinaDer.getX();
		Double ladoDos = this.esquinaIzq.getY() - this.esquinaDer.getY();
		Double ladoCalculado = 0.0;
		
		if(ladoUno.equals(ladoDos)) {
			ladoCalculado = this.esquinaIzq.getX() - this.esquinaDer.getX();
		}
		
		return ladoCalculado * ladoCalculado;
		
	}

}
