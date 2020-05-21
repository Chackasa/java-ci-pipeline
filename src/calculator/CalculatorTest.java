package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void SumaNumerosPositivos() {
		Calculator c = new Calculator();
		assertEquals(15,c.suma(1,2,3,4,5));
		
	}
	
	@Test
	public void SumaNumerosNegativos() {
		Calculator c= new Calculator();
		assertEquals(-15,c.suma(-1,-2,-3,-4,-5));
	}
	
	@Test
	public void RestaNumerosPositivos() {
		Calculator c= new Calculator();
		assertEquals(20,c.resta(100,50,25,5));
		
	}
	
	@Test
	public void RestaNumerosNegativos() {
		Calculator c= new Calculator();
		assertEquals(0,c.resta(-10,-5,-5));
	}
	
	@Test
	public void DivisionRegular() {
		Calculator c = new Calculator();
		assertEquals(6.0,c.division(30, 5),0.1);
	}
	
	@Test
	public void DivisionNumeroEntreSiMismo() {
		Calculator c= new Calculator();
		assertEquals(1,c.division(100,100),0.1);
	}
	
	@Test
	public void MultiplicacionRegular() {
		Calculator c = new Calculator();
		assertEquals(120,c.multiplicacion(1,2,3,4,5));
	}
	
	@Test
	public void MultiplicacionPorCero() {
		Calculator c = new Calculator();
		assertEquals(0,c.multiplicacion(5,10,15,20,25,30,35,40,0));
	}

}
