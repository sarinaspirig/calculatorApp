package ch.bbw.CalculatorApp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Test
	public void testSummeZweiPositive() {
		calculator = new Calculator();
		int result = calculator.addition(23, 25);
		assertTrue(result > 1);

	}

	@Test
	public void testSummeZweiNegative() {

		calculator = new Calculator();
		int result = calculator.addition(-5, -3);
		assertTrue(result < 1);

	}

	@Test
	public void testSummeZweiNull() {
		calculator = new Calculator();
		int result = calculator.addition(-25, 25);
		assertTrue(result == 0);

	}

	@Test
	public void testDifferenzZweiPositive() {
		calculator = new Calculator();
		int result = calculator.subtraction(25, 5);
		assertTrue(result > 1);

	}

	@Test
	public void testProduktZweiPositive() {
		calculator = new Calculator();
		int result = calculator.multiplication(25, 5);
		assertTrue(result > 1);

	}
	
	@Test
	public void testRestZweiPositive() {
		calculator = new Calculator();
		int result = calculator.division(25, 5);
		assertTrue(result > 1);
		
	}

}
