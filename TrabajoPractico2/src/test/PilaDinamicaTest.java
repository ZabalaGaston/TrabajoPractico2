package test;
import org.junit.Assert;
import org.junit.Test;

import tpTDA.PilaDinamica;


@SuppressWarnings({"rawtypes", "unchecked"})
public class PilaDinamicaTest {
	
	private PilaDinamica pila;

	@Test
	public void testPush() {
		pila = new PilaDinamica();
		long startTime = System.currentTimeMillis();
		pila.push(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion push:" + tiempo);
		Assert.assertEquals(Integer.valueOf(1), pila.peek());	
	}
	
	@Test
	public void testPop() {
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		long startTime = System.currentTimeMillis();
		Integer prueba = (Integer) pila.pop();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion pop:" + tiempo);
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {
		pila = new PilaDinamica();		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(3), pila.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion peek:" + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		pila = new PilaDinamica();
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, pila.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion isEmpty:" + tiempo);
	}
	
	@Test
	public void testEmpty () {
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		long startTime = System.currentTimeMillis();
		pila.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion empty:" + tiempo);
		Assert.assertEquals(true, pila.isEmpty());
	}
}
