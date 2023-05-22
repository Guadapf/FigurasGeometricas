package ar.edu.unlam.pb2.figuras;

public class Rectangulo extends Figuras{
	
	public Rectangulo(Punto esquinaIzq, Punto esquinaDer) {
		super.esquinaIzq = esquinaIzq;
		super.esquinaDer = esquinaDer;
	}
	
	public Double calcularArea() {
		Double base = this.esquinaDer.getX() - this.esquinaIzq.getX();
		Double altura = this.esquinaDer.getY() - this.esquinaIzq.getY();
		
		return base * altura;
	}
}
