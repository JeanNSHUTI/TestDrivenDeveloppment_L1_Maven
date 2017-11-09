/**
 * 
 */
package test;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.Test;

/**
 * @author Jean-Rene Nshuti
 *
 */
@SuppressWarnings("unused")
public class TestArithmetic {

	/**
	 * 
	 */
	public TestArithmetic() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Test method for {@link main.Arithmetic#multiply(int, int)}.
	 */
	@Test
	public void testMultiply() {
		
		ddl4_L1_Maven.Calculator calc = new ddl4_L1_Maven.Arithmetic();
		int a, b, res;
		
		a = 2;
		b = 3;
		res = a * b;
		assertTrue("a et b positif", calc.multiply(a, b) == res);
		a = 0;
		b = 5;
		res = a * b;
		assertTrue("a nul", calc.multiply(a, b) == res);
		a = 5;
		b = 0;
		res = a * b;
		assertTrue("b nul", calc.multiply(a, b) == res);
		a = 0;
		b = 0;
		res = a * b;
		assertTrue("a et b nul", calc.multiply(a, b) == res);
		a = 5;
		b = -3;
		res = a * b;
		assertTrue("b negatif", calc.multiply(a, b) == res);
		a = -5;
		b = 3;
		res = a * b;
		assertTrue("a negatif", calc.multiply(a, b) == res);
		a = -5;
		b = -3;
		res = a * b;
		assertTrue("a et b negatif", calc.multiply(a, b) == res);
	}

	/**
	 * Test method for {@link main.Arithmetic#divide(int, int)}.
	 */
	@Test
	public void testDivide() {
		
		ddl4_L1_Maven.Calculator calc = new ddl4_L1_Maven.Arithmetic();			//1. Create an instance of the class to be tested T and 2. Initialise
	    int a, b, res;
	    
	    a = 5; 
        b  = 5; 												//3. Declare and initialize necessary arguments for method test
        res = a / b;											//4. Generate correct result
        assertTrue("a et b positif", calc.divide(a, b) == res);	//5. Test method with same arguments and 6. Verify result
	    a = 0;													//7. Restart from 3 for all possible cases 
        b  = 5; 
        res = a / b;
        assertTrue("a nul", calc.divide(a, b) == res);
	    a = -5; 
        b  = 5; 
        res = a / b;
        assertTrue("a negatif", calc.divide(a, b) == res);
	    a = 5; 
        b  = -5; 
        res = a / b;
        assertTrue("b negatif", calc.divide(a, b) == res);
	    a = -5; 
        b  = -5; 
        res = a / b;
	    assertTrue("a et b negatif", calc.divide(a, b) == res); 
	}

	/**
	 * Test method for {@link main.Arithmetic#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		
		ddl4_L1_Maven.Calculator calc = new ddl4_L1_Maven.Arithmetic();
	    int a, b, res;
	    
	    a = 5; 
        b  = 5; 
        res = a + b;
	    assertTrue("a et b positif", calc.add(a, b) == res);
	    a = 0; 
        b  = 5; 
        res = a + b;
	    assertTrue("a nul", calc.add(a, b) == res);
	    a = 5; 
        b  = 0; 
        res = a + b;
	    assertTrue("b nul", calc.add(a, b) == res);
	    a = 0; 
        b  = 0; 
        res = a + b;
	    assertTrue("a et b nuls", calc.add(a, b) == res);
	    a = -5; 
        b  = 5; 
        res = a+ b;
	    assertTrue("a negatif", calc.add(a, b) == res);
	    a = 5; 
        b  = -5; 
        res = a + b;
	    assertTrue("b negatif", calc.add(a, b) == res);
    	a = -5; 
        b  = -5; 
        res = a + b;
	    assertTrue("a et b negatif", calc.add(a, b) == res);
	}

	/**
	 * Test method for {@link main.Arithmetic#substract(int, int)}.
	 */
	@Test
	public void testSubstract() {
		
		ddl4_L1_Maven.Calculator calc = new ddl4_L1_Maven.Arithmetic();
	    int a, b, res;
	    
	    a = 10; 
        b  = 5; 
        res = a - b;
	    assertTrue("a et b positif", calc.substract(a, b) == res);
	    a = 5; 
        b  = 10; 
        res = a - b;
	    assertTrue("a > b -> resultat negatif", calc.substract(a, b) == res);
	    a = 0; 
        b  = 5; 
        res = a - b;
	    assertTrue("a nul", calc.substract(a, b) == res);
	    a = 5; 
        b  = 0; 
        res = a - b;
	    assertTrue("b nul", calc.substract(a, b) == res);
	    a = 0; 
        b  = 0; 
        res = a - b;
	    assertTrue("a et b nuls", calc.substract(a, b) == res);
	    a = -5; 
        b  = 5; 
        res = a - b;
	    assertTrue("a negatif", calc.substract(a, b) == res);
	    a = 5; 
        b  = -5; 
        res = a - b;
	    assertTrue("b negatif", calc.substract(a, b) == res);
    	a = -5; 
        b  = -5; 
        res = a - b;
	    assertTrue("a et b negatif", calc.substract(a, b) == res);
	}
	
	/**
	 * Test method for {@link main.Arithmetic#divide(int, int)}.
	 * Test for when dividing by zero. Class throws arithmetic
	 * exception.
	 */
	@Test (expected = ArithmeticException.class)
	public final void testDivideByZero() {

		ddl4_L1_Maven.Calculator calc = new ddl4_L1_Maven.Arithmetic();
		int a, b, res;
		a = 5; 
        b  = 0; 
        res = 0;
        assertTrue("b nul", calc.divide(a, b) == res);
		a = 0; 
        b  = 0; 
        res = 0;
        assertTrue("a et b nuls", calc.divide(a, b) == res);

	}


}
