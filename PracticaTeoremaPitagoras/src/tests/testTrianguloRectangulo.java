package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo t;
	static TrianguloRectangulo t1;
	
	@BeforeAll
	static void setup() {
		t = new TrianguloRectangulo(2.5,7.4);
		t1 = new TrianguloRectangulo();
	}
	
	@Test
	void testArea() {
		double areaObtenida=t.area();
		double areaEsperada=9.25;
		assertEquals(areaEsperada, areaObtenida);

	}
	@Test
	void testArea1() {
		double areaObtenida=t1.area();
		double areaEsperada=0.5;
		assertEquals(areaEsperada, areaObtenida);
	}
	@Test
	void testHipotenusa() {
		double hipotenusaObtenida=t.hipotenusa();
		double hipotenusaEsperada=7;
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}
	@Test
	void testHipotenusa1() {
		double hipotenusaObtenida=t1.hipotenusa();
		double hipotenusaEsperada=1;
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}
	@Test
	void testPerimetro() {
		double perimetroObtenido=t.perimetro();
		double perimetroEsperado=16.9;
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	@Test
	void testPerimetro1() {
		double perimetroObtenido=t1.perimetro();
		double perimetroEsperado=3;
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	@Test
	void testExcepcion() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> new TrianguloRectangulo(-1.6,4.7));
		
		String mensajeEsperado="Numero igual o menor que 0";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
}
