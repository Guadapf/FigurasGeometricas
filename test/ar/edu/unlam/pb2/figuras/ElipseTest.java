package ar.edu.unlam.pb2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElipseTest {

	@Test
	public void queSePuedaCalcularElArea() {
		Punto p1 = new Punto(1.0,5.0);
		Elipse e1 = new Elipse(p1, 2.1,5.1);
		
		Double valorObtenido = e1.calcularArea();
		Double valorEsperado = 33.6294;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
