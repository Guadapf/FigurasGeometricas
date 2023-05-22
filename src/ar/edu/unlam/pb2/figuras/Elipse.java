package ar.edu.unlam.pb2.figuras;

public class Elipse extends Figuras{
	
	private final Double PI = 3.14;
	
	public Elipse(Punto centro, Double radio, Double radioMay) {
		this.centro = centro;
		this.radio = radio;
		this.radioMay = radioMay;
	}
	
	public Double calcularArea() {
		return (PI*radio*radioMay);
	}
}
