import java.util.Scanner;

public class FractionQuiz {

public static void main (String[] args) {
	
	System.out.println("Let the Fraction Quiz Begin. Answers should be in the lowest terms. Good luck!");
	
	Scanner in = new Scanner(System.in);
	
	
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction();
	
	char operation = Fraction.oper();
	Fraction answer= Fraction.add(f1, f2);
	if (operation == '+') {
		answer = Fraction.add(f1, f2);
	}
	if (operation == '-') {
		answer = Fraction.subtract(f1, f2);
	}
	if (operation == '*') {
		answer = Fraction.mult(f1, f2);
	}
	if (operation == '/') {
		answer = Fraction.divide(f1, f2);
	}
	
	
	System.out.print(f1 + "" + Fraction.oper() + "" + f2 + " = ");
	Fraction response = new Fraction(in.nextLine());
	if (response.equals(answer)) {
	System.out.println("correct!");
}
	else {
	System.out.println("Wrong, the answer was " + answer);
	}
	
	
	
	




}
}
