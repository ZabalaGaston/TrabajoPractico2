package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tpTDA.PilaHL;


public class PilaHLTest {

	private PilaHL pilaHL;

	@Before
	public void setUp() {
		pilaHL = new PilaHL();
	}
	
	@Test
	public void testPush() {
		long startTime = System.currentTimeMillis();
		pilaHL.push(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaHL - Tiempo ejecucion push: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), pilaHL.peek());	
	}
	
	@Test
	public void testPop() {		
		pilaHL.push(1);
		pilaHL.push(2);
		long startTime = System.currentTimeMillis();
		Integer prueba = (Integer) pilaHL.pop();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaHL - Tiempo ejecucion pop: " + tiempo);
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {		
		pilaHL.push(1);
		pilaHL.push(2);
		pilaHL.push(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(3), pilaHL.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaHL - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, pilaHL.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaHL - Tiempo ejecucion isEmpty: " + tiempo);
	}
	
	@Test
	public void testEmpty () {		
		pilaHL.push(1);
		pilaHL.push(2);
		long startTime = System.currentTimeMillis();
		pilaHL.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaHL - Tiempo ejecucion empty: " + tiempo);
		Assert.assertEquals(true, pilaHL.isEmpty());
	}
}
