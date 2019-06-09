package test;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;
import tpTDA.PilaEstatica;


public class PilaTest {
	private PilaEstatica pila;
	
	@Test
	public void testPush() {
		pila = new PilaEstatica(10);
		long startTime = System.currentTimeMillis();
		pila.push(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Estatica - Tiempo ejecucion push: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), pila.peek());	
	}
	
	@Test
	public void testPop() {
		pila = new PilaEstatica(10);
		pila.push(1);
		pila.push(2);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(2), pila.pop());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Estatica - Tiempo ejecucion pop: " + tiempo);
	}
	
	@Test
	public void testPeek() {
		pila = new PilaEstatica(10);	
		pila.push(1);
		pila.push(2);
		pila.push(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(3), pila.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Estatica - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		pila = new PilaEstatica(10);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, pila.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Estatica - Tiempo ejecucion isEmpty: " + tiempo);
	}
	
	@Test
	public void testEmpty () {
		pila = new PilaEstatica(10);	
		pila.push(1);
		pila.push(2);
		long startTime = System.currentTimeMillis();
		pila.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Estatica - Tiempo ejecucion empty: " + tiempo);
		Assert.assertEquals(true, pila.isEmpty());
	}
	}
