package ar.edu.unlam.pb2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void queSePuedaCalcularElArea() {
		Punto p1 = new Punto(3.0,3.0);
		Punto p2 = new Punto(0.0, 0.0);
		Cuadrado c1 = new Cuadrado(p1, p2);
		
		Double valorObtenido = c1.calcularArea();
		Double valorEsperado = 9.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queNoSePuedaCalcularElAreaPorqueNoEsUnCuadrado() {
		Punto p1 = new Punto(6.0,3.0);
		Punto p2 = new Punto(0.0, 0.0);
		Cuadrado c1 = new Cuadrado(p1, p2);
		
		Double valorObtenido = c1.calcularArea();
		Double valorEsperado = 0.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	

}
