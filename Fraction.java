public class Fraction {
    // instance variable (atrributes, fields)

    int numerator, denominator;

    // constructors
    public Fraction() { // default constructor (no parameter)
        setNum(1);
        setDenom(1);
    }

    public Fraction(int n, int d) { // parameterized constructor
        setNum(n);
        setDenom(d);
    }
    public Fraction(String a){
		setNum(Integer.parseInt( a.substring(0,a.indexOf('/'))));
		setDenom(Integer.parseInt(a.substring(a.indexOf('/')+1)));
	}
	public Fraction(Fraction f){
		setNum(f.numerator);
		setDenom(f.denominator);
	}

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessor method, aka getters
        return numerator;
    }

    public int getDenom() { // accessor method
        return denominator;
    }
    //public String Fraction.add(String a, String b){
    public String toString(){
		return numerator + "/" + denominator;
	}
		
	public void setNum( int n ){
		numerator = n;
	}
	
	public void setDenom( int d ){
		if(d!=0){
			denominator = d;
		}else{
			denominator = 1;
			System.out.println("Error");
		}
	}
	
	
	
	public void reduce() {
	int GCM = 0;
	int a = getNum();
	int b = getDenom();
	while(a!=b) {
	if (a<b) {
		b=b-a;
	}else{
		a=a-b;
}}
	GCM = a;
	setDenom(denominator/GCM);
	setNum(numerator/GCM);
	
}




public static Fraction add(Fraction a, Fraction b) {
		int finalD = a.denominator * b.denominator;
		int finalN = a.numerator * (finalD / a.denominator) + b.numerator * (finalD / b.denominator);		
	
		Fraction answer = new Fraction (finalN , finalD);
		answer.reduce();
		return answer;

}

public static Fraction subtract(Fraction a, Fraction b) {
		int finalD = a.denominator * b.denominator;
		int finalN = a.numerator * (finalD / a.denominator) - b.numerator * (finalD / b.denominator);		
	
		Fraction answer = new Fraction (finalN , finalD);
		answer.reduce();
		return answer;

}

public static Fraction mult(Fraction a, Fraction b) {
		int finalDen = a.denominator * b.denominator;
		int finalNum = a.numerator* b.numerator;
		
		Fraction answer = new Fraction (finalNum , finalDen);
		return answer;
		}
		

public static Fraction divide(Fraction a, Fraction b) {
		int finalDen = a.denominator * b.numerator;
		int finalNum = a.numerator* b.denominator;
		
		Fraction answer = new Fraction (finalNum , finalDen);
		return answer;
	}

public boolean equal(Fraction f) {
	int a = getDenom();
	int b = getNum();
	if(a==f.denominator && b==f.numerator) {
		return true;
	}else{
		return false;
	}
}





}
