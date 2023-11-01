package studio7;

public class Die {
	
	private int n;
	
public Die(int actualN) {
	this.n = actualN;
}
	
public int integer() {
	return (int) (Math.random() * n + 1);
}
 
	public static void main(String[] args) {
	Die og = new Die(7);
	System.out.println(og.integer());
	}
}
