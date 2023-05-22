package ar.edu.unlam.pb2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void queSePuedaCalcularElArea() {
		Punto p1 = new Punto(5.0,2.0);
		Punto p2 = new Punto(0.0,0.0);
		Rectangulo r1 = new Rectangulo(p1, p2);
		
		Double valorObtenido = r1.calcularArea();
		Double valorEsperado = 10.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
