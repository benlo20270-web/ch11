public class Fraction {
// instance variables (attributes, fields)
	 int numerator, denominator;


// constructors

	public Fraction () {  // default constructure
		numerator = 1;
		denominator = 1;
	
	
}

	 public Fraction (int n, int d) { //parameterized constructor
		 numerator = n;
		 denominator = d;
}
// behaviour methods (accessor, mutator, helper)

public Fraction(String s){
	numerator = Integer.parseInt(s.substring(0,s.indexOf('/')));
	denominator = Integer.parseInt(s.substring(s.indexOf('/')+1));
	
	
}

public Fraction (Fraction f) {
	numerator = f.numerator;
	denominator = f.denominator;
	
	
	
}



public int getNum() {
	return numerator;
}

public int getDenom() {
	return denominator;
}

public string toString() {
	return numerator + "/" + denominator;
}
	//mutator methods
	public void setNum(int n) {
		numerator = n;
	}

	public void setDenom(int d) {
		if(d!=0) {
			denomintator = d;
	}else{
		denominator = 1;
		System.out.print("Error");
	}
}

















}
