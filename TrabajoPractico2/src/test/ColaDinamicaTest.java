package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tpTDA.ColaDinamica;

public class ColaDinamicaTest {
	
	private ColaDinamica cola;

	@Before
	public void setUp() {
		cola = new ColaDinamica();
	}

	@Test
	public void testPeek() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		Assert.assertEquals(Integer.valueOf(1), cola.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Cola Dinamica - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testOffer() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Cola Dinamica - Tiempo ejecucion offer: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), cola.peek());
	}
	
	@Test
	public void testPoll() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);		
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Cola Dinamica - Tiempo ejecucion poll: " + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, cola.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Cola Dinamica - Tiempo ejecucion isEmpty: " + tiempo);
	}
	
	@Test
	public void testEmpty () {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Cola Dinamica - Tiempo ejecucion empty: " + tiempo);
		Assert.assertEquals(true, cola.isEmpty());
	}
}
