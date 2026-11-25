public class FractionQuiz {

public static void main (String[] args) {
	
	System.out.println("Let the Fraction Quiz Begin. Answers should be in the lowest terms. Good luck!");
	
	
	
	
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction();
	
	char operation = Fraction.oper();
	
	if (operation == '+') {
		Fraction answer = Fraction.add(f1, f2);
	}
	if (operation == '-') {
		Fraction answer = Fraction.subtract(f1, f2);
	}
	if (operation == '*') {
		Fraction answer = Fraction.mult(f1, f2);
	}
	if (operation == '/') {
		Fraction answer = Fraction.divide(f1, f2);
	}
	
	
	
}
}
