package ar.edu.unlam.pb2.figuras;

public abstract class Figuras {
	
	protected Punto centro;
	protected Double radio;
	protected Double radioMay;
	protected Punto esquinaIzq;
	protected Punto esquinaDer;
	protected Double lado;
	protected Punto punto;
	
	
	public Punto getPunto() {
		return punto;
	}
	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	public Double getRadioMay() {
		return radioMay;
	}
	public void setRadioMay(Double radioMay) {
		this.radioMay = radioMay;
	}
	public Punto getEsquinaIzq() {
		return esquinaIzq;
	}
	public void setEsquinaIzq(Punto esquinaIzq) {
		this.esquinaIzq = esquinaIzq;
	}
	public Punto getEsquinaDer() {
		return esquinaDer;
	}
	public void setEsquinaDer(Punto esquinaDer) {
		this.esquinaDer = esquinaDer;
	}
	public Double getLado() {
		return lado;
	}
	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	public abstract Double calcularArea();
	
	
}
