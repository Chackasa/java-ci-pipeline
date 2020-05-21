package calculator;

public class Calculator {

	public int suma(int... num) {
		int x = 0;
		for(int n: num) {
			x = x + n;
		}
		
		return x;
	}
	
	public int resta(int... num) {
		int x = num[0];
		for (int i = 1; i < num.length; i++){
			x = x - num[i];
		}
		return x;
	}
	
	public double division(int dividendo, int divisor) {
			double x = (double)dividendo/(double)divisor;
			return x;
		}
		
	
	public int multiplicacion(int... num) {
		int x = 1;
		for(int n: num) {
			x = x * n;
		}
		return x;
	}
}
