package ch.bbw.CalculatorApp;

public class Calculator {

	public Calculator() {
		//default constructor
	}

	public int addition(int summand1, int summand2) {
		int result = summand1 + summand2;
		System.out.println("Addition: " + result);
		return result;
	}
	
	public int subtraction(int summand1, int summand2) {
		int result = summand1 - summand2;
		System.out.println("Subtraction: " + result);
		return result;
	}
	
	public int multiplication(int summand1, int summand2) {
		int result = summand1 * summand2;
		System.out.println("Multiplication: " + result);
		return result;
	}
	
	public int division(int summand1, int summand2) {
		int result = summand1 / summand2;
		System.out.println("Division: " + result);
		return result;
	}

}
