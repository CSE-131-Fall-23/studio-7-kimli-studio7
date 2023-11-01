package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int actualNumerator, int actualDenominator) {
		numerator = actualNumerator;
		denominator = actualDenominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}

	public Fraction sum(Fraction nnn) {
		int newNumerator = this.getNumerator() * nnn.getDenominator();
		int newDenominator = this.getDenominator() * nnn.getDenominator();
		int newOtherNumerator = nnn.getNumerator() * this.getDenominator();
		int sum = newNumerator + newOtherNumerator;
		return new Fraction(sum, newDenominator);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
